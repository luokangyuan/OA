package cn.luo.ssm.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cn.luo.ssm.po.Alonework;
import cn.luo.ssm.po.Staff;

public interface AloneWorkService {
	//查询对应员工的待办事项
	public List<Alonework> selectAllAloneWork(Alonework alonework)throws Exception;
	//添加事项
	public void insertTodoWork(Alonework alonework,MultipartFile file) throws Exception;
	//根据事项主键修改事项
	public void updateTodpWorkById(Alonework alonework, MultipartFile file,String lowstaff)throws Exception;
	//删除事项
	public void deleteTodoWorkByID(int tid)throws Exception;
	//查询所有员工的待办事项
	public List<Alonework> selectSysAllAloneWork(Staff staff)throws Exception;
	//根据用户id查询用户的员工编号
	public String findStaNumberByStaid(int stid)throws Exception;
	//根据登录的用户获取员工编号信息
	public Staff findStaffBySid()throws Exception;
	//查询下属员工信息
	public List<Staff> selectStaffList()throws Exception;
	//管理员添加事项
	public void insertTodoWorkBySys(Alonework alonework,MultipartFile file,String lowstaff) throws Exception;
}
