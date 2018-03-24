package cn.luo.ssm.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cn.luo.ssm.po.Calendars;
import cn.luo.ssm.po.Staff;

public interface CalendarService {
	//查询对应员工的待办事项
	public List<Calendars> selectAllCalendar(Calendars calendars )throws Exception;
	//添加事项
	public void insertMyCalendars(Calendars calendars,MultipartFile file) throws Exception;
	//根据事项主键修改事项
	public void updateCalendarsById(Calendars calendars, MultipartFile file,String lowstaff)throws Exception;
	//删除事项
	public void deleteCalendarsByID(int tid)throws Exception;
	//查询所有员工的待办事项
	public List<Calendars> sekectSysManagCalendars(Staff staff)throws Exception;
	//根据用户id查询用户的员工编号
/*	public String findStaNumberByStaid(int stid)throws Exception;
	//根据登录的用户获取员工编号信息
	public Staff findStaffBySid()throws Exception;
	//查询下属员工信息
	public List<Staff> selectStaffList()throws Exception;
	//管理员添加事项
	public void insertTodoWorkBySys(Alonework alonework,MultipartFile file,String lowstaff) throws Exception;*/
}
