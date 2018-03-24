package cn.luo.ssm.service;

import java.util.List;

import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Staff;

/*
 * 
 * 部门业务层
 */
public interface SystemDeptService {
	//插入部门
	public void insertDept(DeptVO deptVO)throws Exception;
	//根据部门主键查询员工
	public List<Staff> findAllStaffByDept(int pid)throws Exception;
	//修改部门信息
	public void updateDeptInfo(DeptVO deptVO)throws Exception;
	//重置负责人
	public void updateDeptNoChart(int pid)throws Exception;
	//修改负责人
	public void updatDdeptChart(int sid)throws Exception;
	//删除部门
	public void deleteDept(int pid)throws Exception;
}
