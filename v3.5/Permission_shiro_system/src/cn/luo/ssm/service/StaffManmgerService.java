package cn.luo.ssm.service;

import cn.luo.ssm.po.Staff;

/**
 * 员工管理
 * @author Administrator
 *
 */
public interface StaffManmgerService {
	//根据员工id查询基本信息
	public Staff selectStaffBySid()throws Exception;
}
