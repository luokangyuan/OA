package cn.luo.ssm.mapper;

import java.util.List;

import cn.luo.ssm.po.Calendars;
import cn.luo.ssm.po.Staff;

/**
 * 待办事项查看页面
 *<p>Title:CalendarsMapper </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2017-4-4
 */
public interface CalendarMapper {
	
	//查询对应员工的待办事项
	public List<Calendars> selectAllCalendar(Calendars calendars)throws Exception;
	//添加事项
	public void insertMyCalendars(Calendars calendars) throws Exception;
	//根据事项主键修改事项
	public void updateCalendarsById(Calendars calendars)throws Exception;
	//删除事项
	public void deleteCalendarsByID(int tid)throws Exception;
	//事项管理的查询
	public List<Calendars> sekectSysManagCalendars(Staff staff)throws Exception;

}
