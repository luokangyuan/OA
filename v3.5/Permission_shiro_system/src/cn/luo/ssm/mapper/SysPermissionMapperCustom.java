package cn.luo.ssm.mapper;

import java.util.List;

import cn.luo.ssm.po.Syspermission;


public interface SysPermissionMapperCustom {
	
	//根据用户id查询菜单
	public List<Syspermission> findMenuListByUserId(Integer  userid)throws Exception;
	//根据用户id和一级菜单id查询二级菜单查询菜单
	public List<Syspermission> findSeMenuListByUserIdAndMenuId(Integer pid,Integer  userid)throws Exception;
	//根据用户id查询权限url
	public List<Syspermission> findPermissionListByUserId(Integer userid)throws Exception;

}
