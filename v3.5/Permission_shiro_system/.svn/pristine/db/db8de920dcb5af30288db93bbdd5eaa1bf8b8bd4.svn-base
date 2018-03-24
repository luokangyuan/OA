package cn.luo.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.luo.ssm.exception.CustomException;
import cn.luo.ssm.mapper.StaffMapper;
import cn.luo.ssm.mapper.SysPermissionMapperCustom;
import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.po.StaffExample;
import cn.luo.ssm.po.Syspermission;
import cn.luo.ssm.service.SysService;
import cn.luo.ssm.util.MD5;


public class SysServiceImpl implements SysService {
	
	@Autowired
	private StaffMapper sysUserMapper;
	
	@Autowired
	private SysPermissionMapperCustom sysPermissionMapperCustom;

	@Override
	public ActiveUser authenticat(String userCode, String password)
			throws Exception {
		/**
	认证过程：
	根据用户身份（账号）查询数据库，如果查询不到用户不存在
	对输入的密码 和数据库密码 进行比对，如果一致，认证通过
		 */
		//根据用户账号查询数据库
		Staff sysUser = this.findSysUserByUserCode(userCode);
		
		if(sysUser == null){
			//抛出异常
			throw new CustomException("用户账号不存在");
		}
		
		//数据库密码 (md5密码 )
		String password_db = sysUser.getStapassword();
		
		//对输入的密码 和数据库密码 进行比对，如果一致，认证通过
		//对页面输入的密码 进行md5加密 
		String password_input_md5 = new MD5().getMD5ofStr(password);
		if(!password_input_md5.equalsIgnoreCase(password_db)){
			//抛出异常
			throw new CustomException("用户名或密码 错误");
		}
		//得到用户id
		int userid = sysUser.getStaid();
		//根据用户id查询菜单 
		List<Syspermission> menus =this.findMenuListByUserId(userid);
		
		//根据用户id查询权限url
		List<Syspermission> permissions = this.findPermissionListByUserId(userid);
		
		//认证通过，返回用户身份信息
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(sysUser.getStaid());
		activeUser.setUsercode(userCode);
		activeUser.setUsername(sysUser.getStaname());//用户名称
		
		//放入权限范围的菜单和url
		activeUser.setMenus(menus);
		activeUser.setPermissions(permissions);
		
		return activeUser;
	}
	
	//根据用户账号查询用户信息
	public Staff findSysUserByUserCode(String userCode)throws Exception{
		StaffExample sysUserExample = new StaffExample();
		StaffExample.Criteria criteria = sysUserExample.createCriteria();
		criteria.andStausercodeEqualTo(userCode);
		
		List<Staff> list = sysUserMapper.selectByExample(sysUserExample);
		
		if(list!=null && list.size()==1){
			return list.get(0);
		}	
		
		return null;
	}

	@Override
	public List<Syspermission> findMenuListByUserId(Integer userid)
			throws Exception {
		List<Syspermission>menuList = sysPermissionMapperCustom.findMenuListByUserId(userid);
		for(int i = 0; i<menuList.size();i++){
			Syspermission syspermission = menuList.get(i);
			int pid = syspermission.getPerid();
			List<Syspermission>seList = sysPermissionMapperCustom.findSeMenuListByUserIdAndMenuId(pid, userid);
			syspermission.setSemenu(seList);
			System.out.println(syspermission.getSemenu().size()+"===================");
		}
		
		return menuList;
	}

	@Override
	public List<Syspermission> findPermissionListByUserId(Integer userid)
			throws Exception {
		
		return sysPermissionMapperCustom.findPermissionListByUserId(userid);
	}

}
