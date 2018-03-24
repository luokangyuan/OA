package cn.luo.ssm.service;

import java.util.List;

import cn.luo.ssm.po.RoleVo;
import cn.luo.ssm.po.SysperTreeVO;
import cn.luo.ssm.po.Sysrole;

/**
 * 角色权限业务层
 * @author Administrator
 *
 */
public interface PerAndRoleService {
	//查询所有的系统角色和权限信息
	public List<RoleVo> selectAllRoleAndPer()throws Exception;
	//查询所有的系统角色信息
	public List<Sysrole> selectAllRole()throws Exception;
	//根据父节点查询子菜单
	public List<SysperTreeVO> selectPerByPid(String pid)throws Exception;
}
