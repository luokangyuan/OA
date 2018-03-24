package cn.luo.ssm.mapper;

import java.util.List;

import cn.luo.ssm.po.Alonework;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.po.Syspermission;
import cn.luo.ssm.po.Sysrole;

/**
 * 待办事项查看页面
 *<p>Title:AloneWorkMapper </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2017-4-4
 */
public interface PerAndRoleMapper {
	//查询所有的角色集合
	public List<Sysrole> selectAllRole()throws Exception;
	//根据角色id查询权限集合
	public List<Syspermission> selectPerByRoleId(int roleid)throws Exception;
	//根据父节点查询子菜单
	public List<Syspermission> selectChilderByPid(String pid)throws Exception;
	
}
