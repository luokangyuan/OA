package cn.luo.ssm.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.po.Syspermission;
import cn.luo.ssm.service.SysService;


public class CustomRealm extends AuthorizingRealm {
	//注入service
	@Autowired
	private SysService sysService;
	// 设置realm的名称
	@Override
	public void setName(String name) {
		super.setName("customRealm");
	}
	//realm的认证方法，从数据库查询用户信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// token是用户输入的用户名和密码 
		// 第一步从token中取出用户名
		String userCode = (String) token.getPrincipal();
		// 第二步：根据用户输入的userCode从数据库查询
		Staff sysUser = null;
		try {
			sysUser = sysService.findSysUserByUserCode(userCode);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// 如果查询不到返回null
		if(sysUser==null){
			return null;
		}
		// 从数据库查询到密码
		String password = sysUser.getStapassword();
		//盐
		String salt = sysUser.getSalt();
		// 如果查询到返回认证信息AuthenticationInfo
		//activeUser就是用户身份信息
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(sysUser.getStaid());
		activeUser.setUsercode(sysUser.getStausercode());
		activeUser.setUsername(sysUser.getStaname());
		//..
		//根据用户id取出菜单
		List<Syspermission> menus  = null;
		try {
			//通过service取出菜单 
			menus = sysService.findMenuListByUserId(sysUser.getStaid());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//将用户菜单 设置到activeUser
		activeUser.setMenus(menus);
		//将activeUser设置simpleAuthenticationInfo
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
				activeUser, password,ByteSource.Util.bytes(salt), this.getName());
		return simpleAuthenticationInfo;
	}
	
	

	// 用于授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		//从 principals获取主身份信息
		//将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
		ActiveUser activeUser =  (ActiveUser) principals.getPrimaryPrincipal();
		//根据身份信息获取权限信息
		//从数据库获取到权限数据
		List<Syspermission> permissionList = null;
		try {
			permissionList = sysService.findPermissionListByUserId(activeUser.getUserid());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//单独定一个集合对象 
		List<String> permissions = new ArrayList<String>();
		if(permissionList!=null){
			for(Syspermission sysPermission:permissionList){
				//将数据库中的权限标签 符放入集合
				permissions.add(sysPermission.getPerpercode());
			}
		}
		
		
	/*	List<String> permissions = new ArrayList<String>();
		permissions.add("user:create");//用户的创建
		permissions.add("item:query");//商品查询权限
		permissions.add("item:add");//商品添加权限
		permissions.add("item:edit");//商品修改权限
*/		//....
		
		//查到权限数据，返回授权信息(要包括 上边的permissions)
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		//将上边查询到授权信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addStringPermissions(permissions);

		return simpleAuthorizationInfo;
	}
	
	//清除缓存
	public void clearCached() {
		PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
		super.clearCache(principals);
	}


}
