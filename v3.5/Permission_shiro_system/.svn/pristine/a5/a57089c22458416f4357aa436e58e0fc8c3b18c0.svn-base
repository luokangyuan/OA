package cn.luo.ssm.service;

import java.util.List;

import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.po.Syspermission;

public interface SysService {
	
	//根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public ActiveUser authenticat(String userCode,String password) throws Exception;
	
	//根据用户账号查询用户信息
	public Staff  findSysUserByUserCode(String userCode)throws Exception;
	
	//根据用户id查询权限范围的菜单
	public List<Syspermission> findMenuListByUserId(Integer userid) throws Exception;
	
	//根据用户id查询权限范围的url
	public List<Syspermission> findPermissionListByUserId(Integer userid) throws Exception;
}
