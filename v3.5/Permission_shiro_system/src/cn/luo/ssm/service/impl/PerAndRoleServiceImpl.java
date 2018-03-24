package cn.luo.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.luo.ssm.mapper.PerAndRoleMapper;
import cn.luo.ssm.po.RoleVo;
import cn.luo.ssm.po.SysperTreeVO;
import cn.luo.ssm.po.Syspermission;
import cn.luo.ssm.po.Sysrole;
import cn.luo.ssm.service.PerAndRoleService;
@Service
@Transactional
public class PerAndRoleServiceImpl implements PerAndRoleService{
	@Autowired
	private PerAndRoleMapper perAndRoleMapper;
	@Override
	public List<RoleVo> selectAllRoleAndPer() throws Exception {
		List<RoleVo> rolepers = new ArrayList<RoleVo>();
		List<Sysrole> roles = perAndRoleMapper.selectAllRole();
		for(int i = 0;i < roles.size(); i++){
			RoleVo roleVo = new RoleVo();
			roleVo.setRolename(roles.get(i).getRolename());
			List<Syspermission> pers = perAndRoleMapper.selectPerByRoleId(roles.get(i).getRoleid());
			roleVo.setPersisions(pers);
			rolepers.add(roleVo);
		}
		return rolepers;
	}
	@Override
	public List<Sysrole> selectAllRole() throws Exception {
		return perAndRoleMapper.selectAllRole();
	}
	@Override
	public List<SysperTreeVO> selectPerByPid(String pid) throws Exception {
		List<SysperTreeVO> pertree = new ArrayList<SysperTreeVO>();
		if(pid == null){
			List<Syspermission> pers =  perAndRoleMapper.selectChilderByPid("9999");
			for(int i = 0 ; i < pers.size();i++){
				SysperTreeVO sysperTreeVO = new SysperTreeVO();
				sysperTreeVO.setText(pers.get(i).getPername());
				sysperTreeVO.setId(pers.get(i).getPerid());
				sysperTreeVO.setState("closed");
				pertree.add(sysperTreeVO);
			}
		}else{
			List<Syspermission> pers =  perAndRoleMapper.selectChilderByPid(pid);
			for(int i = 0 ; i < pers.size();i++){
				SysperTreeVO sysperTreeVO = new SysperTreeVO();
				sysperTreeVO.setText(pers.get(i).getPername());
				sysperTreeVO.setId(pers.get(i).getPerid());
				sysperTreeVO.setState("open");
				pertree.add(sysperTreeVO);
			}
		}
		return pertree;
	}

	
}