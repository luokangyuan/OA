package cn.luo.ssm.mapper;

import java.util.List;

import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Staff;

/**
 * 系统部门
 * @author Administrator
 *
 */
public interface SystemDeptMapper {
	/**
	 * 插入部门信息
	 * @param deptVO
	 * @throws Exception
	 */
	public void insertDept(DeptVO deptVO)throws Exception;
	/**
	 * 根据部门主键查询对应的员工信息
	 * @param pid
	 * @return
	 * @throws Exception
	 */
	public List<Staff> findAllStaffByDept(int pid)throws Exception;
	/**
	 * 根据部门主键id修改部门信息
	 * @param deptVO
	 * @throws Exception
	 */
	public void updateDeptInfo(DeptVO deptVO)throws Exception;
	/**
	 * 将部门id的所有员工的是否是为负责人设为否
	 * @param pid
	 * @throws Exception
	 */
	public void updateDeptNoChart(int pid)throws Exception;
	/**
	 * 根据员工主键将员工设为负责人
	 * @param sid
	 * @throws Exception
	 */
	public void updatDdeptChart(int sid)throws Exception;
	/**
	 * 根据部门主键删除部门信息
	 * @param pid
	 * @throws Exception
	 */
	public void deleteDept(int pid)throws Exception;
}
