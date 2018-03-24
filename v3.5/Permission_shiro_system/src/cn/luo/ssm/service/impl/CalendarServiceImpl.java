package cn.luo.ssm.service.impl;

import java.io.File;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import cn.luo.ssm.mapper.AloneWorkMapper;
import cn.luo.ssm.mapper.CalendarMapper;
import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.Alonework;
import cn.luo.ssm.po.Calendars;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.service.CalendarService;
/**
 * 待办事项业务层
 *<p>Title:AloneWorkServiceImpl </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2017-4-4
 */
@Service
@Transactional
public class CalendarServiceImpl implements CalendarService {
	@Autowired
	private CalendarMapper calendarMapper;
	@Autowired
	private AloneWorkMapper aloneWorkMapper;
	
	@Override
	public List<Calendars> selectAllCalendar(Calendars calendas)
			throws Exception {
		//取出身份信息
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		calendas.setStaId(uid);
		return calendarMapper.selectAllCalendar(calendas);
	}
	@Override
	public void insertMyCalendars(Calendars calendars,MultipartFile file) throws Exception {
		//取出身份信息
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		calendars.setStaId(uid);
		Date date  = new Date();
		calendars.setCalendaCreate(date);
		calendars.setCreateAuthor(activeUser.getUsername());
		calendars.setCalendaType("1");
		if(!file.isEmpty()){
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\";
				//获取每一个原始文件的文件名
				String OriginalFilename = file.getOriginalFilename();
				calendars.setCalendaFile(OriginalFilename);
				//新的文件名
				String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				calendars.setCalendServerName(newFileName);
				//新文件
				File newFile = new File(file_path+newFileName);
				//将内存中的数据写入磁盘
				file.transferTo(newFile);
		}else{
			calendars.setCalendaFile("无附件");
			calendars.setCalendServerName("无附件");
		}
		calendarMapper.insertMyCalendars(calendars);
	}

	@Override
	public void updateCalendarsById(Calendars calendars, MultipartFile file,String lowstaff) throws Exception {
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		String staNumber = aloneWorkMapper.findStaNumberByStaid(uid);
		Staff staff = new Staff();
		staff.setStanumber(staNumber);
		List<Staff> lowsta = aloneWorkMapper.findStaByStaid(staff);
		int lowstaid = 0;
		 for(int i = 0 ; i<lowsta.size();i++){
			if(lowstaff.equals(lowsta.get(i).getStaname())){
				lowstaid = lowsta.get(i).getStaid();
			}
		}
		calendars.setStaId(lowstaid);
		if(!file.isEmpty()){
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\";
				//获取每一个原始文件的文件名
				String OriginalFilename = file.getOriginalFilename();
				calendars.setCalendaFile(OriginalFilename);
				//新的文件名
				String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				calendars.setCalendServerName(newFileName);
				//新文件
				File newFile = new File(file_path+newFileName);
				//将内存中的数据写入磁盘
				file.transferTo(newFile);
		}
		calendarMapper.updateCalendarsById(calendars);
	}

	@Override
	public void deleteCalendarsByID(int tid) throws Exception {
		aloneWorkMapper.deleteTodoWorkByID(tid);
	}
	
	@Override
	public List<Calendars> sekectSysManagCalendars(Staff staff)
			throws Exception {
		//得到当前用户的员工编码，根据当前员工编码的下属员工编码的主键
		//查询当前员工的的下属所有的待办事项
		//查询当前用户的下属员工主键
		//根据查询得到的主键集合查询待办事项
		List<Calendars> calendars = calendarMapper.sekectSysManagCalendars(staff);
		//下属员工集合
		List<Staff> lowsta = aloneWorkMapper.findStaByStaid(staff);
		for(int i = 0 ; i <calendars.size(); i++){
			for(int j = 0 ; j <lowsta.size(); j++){
				if(calendars.get(i).getStaId()==lowsta.get(j).getStaid()){
					calendars.get(i).setStaname(lowsta.get(j).getStaname());
				}
			}
		}
		return calendars;
	}
	/*@Override
	public String findStaNumberByStaid(int stid) throws Exception {
		
		
		return aloneWorkMapper.findStaNumberByStaid(stid);
	}
	@Override
	public Staff findStaffBySid() throws Exception {
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		String staNumber = aloneWorkMapper.findStaNumberByStaid(uid);
		Staff staff = new Staff();
		staff.setStanumber(staNumber);
		return staff;
	}
	@Override
	public List<Staff> selectStaffList() throws Exception {
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		String staNumber = aloneWorkMapper.findStaNumberByStaid(uid);
		Staff staff = new Staff();
		staff.setStanumber(staNumber);
		return aloneWorkMapper.findStaByStaid(staff);
	}
	@Override
	public void insertTodoWorkBySys(Alonework alonework, MultipartFile file,String lowstaff)
			throws Exception {
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		int uid = activeUser.getUserid();
		String staNumber = aloneWorkMapper.findStaNumberByStaid(uid);
		Staff staff = new Staff();
		staff.setStanumber(staNumber);
		List<Staff> lowsta = aloneWorkMapper.findStaByStaid(staff);
		int lowstaid = 0;
		 for(int i = 0 ; i<lowsta.size();i++){
			if(lowstaff.equals(lowsta.get(i).getStaname())){
				lowstaid = lowsta.get(i).getStaid();
			}
		}
		alonework.setStaId(lowstaid);
		
		
		Date date  = new Date();
		alonework.setTodoCreate(date);
		alonework.setCreateAuthor(activeUser.getUsername());
		alonework.setTodoType("1");
		if(!file.isEmpty()){
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\";
				//获取每一个原始文件的文件名
				String OriginalFilename = file.getOriginalFilename();
				alonework.setTodoFile(OriginalFilename);
				//新的文件名
				String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				alonework.setTodoServerName(newFileName);
				//新文件
				File newFile = new File(file_path+newFileName);
				//将内存中的数据写入磁盘
				file.transferTo(newFile);
		}else{
			alonework.setTodoFile("无附件");
			alonework.setTodoServerName("无附件");
		}
		aloneWorkMapper.insertTodoWork(alonework);
	}
*/
}
