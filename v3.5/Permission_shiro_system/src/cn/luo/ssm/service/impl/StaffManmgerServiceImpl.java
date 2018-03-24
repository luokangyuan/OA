package cn.luo.ssm.service.impl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.luo.ssm.mapper.StaffManmagerMapper;
import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.service.StaffManmgerService;
@Service
@Transactional
public class StaffManmgerServiceImpl implements StaffManmgerService  {
	@Autowired
	private StaffManmagerMapper staffManmagerMapper;
	@Override
	public Staff selectStaffBySid() throws Exception {
		//取出身份信息
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		return staffManmagerMapper.selectStaffBySid(uid);
	}

}
