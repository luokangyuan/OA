package cn.luo.ssm.mapper;

import cn.luo.ssm.po.Staff;

/**
 * 员工管理接口
 * @author Administrator
 *
 */
public interface StaffManmagerMapper {
	//根据员工id查询基本信息
	public Staff selectStaffBySid(int sid)throws Exception;
}
