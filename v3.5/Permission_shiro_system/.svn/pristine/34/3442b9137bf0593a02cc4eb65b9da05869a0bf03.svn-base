package cn.luo.ssm.controller;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.luo.ssm.po.ActiveUser;
import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Notice;
import cn.luo.ssm.po.NoticeVO;
import cn.luo.ssm.po.Noticebulletins;
import cn.luo.ssm.po.Noticetype;
import cn.luo.ssm.service.SystemNoticeService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 系统公告
 * @author Administrator
 *
 */
@Controller
public class SystemNoticeController {
	@Autowired
	SystemNoticeService systemNoticeService;
	
	//前往公告管理页面
	@RequestMapping("/noticeManager")
	public String toNoticeManager()throws Exception{
		return "noticeList";
	}
	//加载公告
	@RequestMapping("/loadNotice")
	public void loadNoticeList(NoticeVO noticeVO,String page,String rows,HttpServletResponse response)throws Exception{
		
		int curreatePage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		PageHelper.startPage(curreatePage, pageSize);
		List<NoticeVO> noticeList = systemNoticeService.findAllNotice(noticeVO);
		PageInfo<NoticeVO> pageInfo = new PageInfo<NoticeVO>(noticeList);
		//总记录数
		Long count = pageInfo.getTotal();
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(noticeList);
		String json = "{\"total\":"+count+",\"rows\":"+str+"}";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//加载公告类型
	@RequestMapping("/selecttype")
	public void selecttype(HttpServletResponse response,Noticetype noticetype)throws Exception{
		List<Noticetype> noticeList = systemNoticeService.selectNoticeType(noticetype);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(noticeList);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//加载公告权限
	@RequestMapping("/selectpersi")
	public void selectPersi(HttpServletResponse response)throws Exception{
		List<DeptVO> persiList = systemNoticeService.findAllPersi();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(persiList);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
		
	}
	//添加公告
	@RequestMapping("/addNotice")
	public void addNotice(Notice notice, @RequestParam("file") MultipartFile file,String [] noticeAreas)throws Exception{
		for(int i = 0; i<noticeAreas.length; i++){
			
			//公告附件对象
			Noticebulletins noticebulletins = new Noticebulletins();
			//获取用户信息
			//从shiro的session中取出activeUser
			Subject subject = SecurityUtils.getSubject();
			//取出身份信息
			ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
			int uid = activeUser.getUserid();
			notice.setStaId(uid);
			notice.setNoticecontent(notice.getNoticeTitle());
			notice.setNoticeArea(noticeAreas[i]);
			notice.setNoticetime(new Date());
			if(!file.isEmpty()){
				String file_path = "E:\\myeclipse10\\upload\\temp\\file\\";
					//获取每一个原始文件的文件名
					String OriginalFilename = file.getOriginalFilename();
					noticebulletins.setBullName(OriginalFilename);
					//新的文件名
					String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
					noticebulletins.setBullServerName(newFileName);
					//新文件
					File newFile = new File(file_path+newFileName);
					//将内存中的数据写入磁盘
					file.transferTo(newFile);
					//如果包含文件
					noticebulletins.setBullcreate(new Date());
					long size = file.getSize();
					String si = size+"KB";
					noticebulletins.setBullsize(si);
					noticebulletins.setBullType(file.getContentType());
			}else{
				notice.setNoticeAttachs(0);
				noticebulletins.setBullcreate(new Date());
				noticebulletins.setBullName("无附件");
				noticebulletins.setBullType("无附件");
				noticebulletins.setBullServerName("无附件");
				noticebulletins.setBullsize("无附件");
			}
			//插入公告数据
			systemNoticeService.insertNotice(notice);
			int nid = systemNoticeService.getNoticeId();
			noticebulletins.setNoticeId(nid);
			systemNoticeService.insertNoticeBull(noticebulletins);
			//添加公告操作
			//根据用户操作给对应的人添加一条公告，同时
		}
		
	}
	//修改用户信息
	@RequestMapping("/editNotice")
	public void editNotice(Notice notice, @RequestParam("file") MultipartFile file,Integer bullId,String noticeAreas)throws Exception{
		notice.setNoticeArea(noticeAreas);
		//修改系统公告页面
		systemNoticeService.updateNotice(notice);
		if(!file.isEmpty()){
			systemNoticeService.updateNoticeBull(bullId,file);
		}
	}
	//删除系统公告
	@RequestMapping("/deleteNotice")
	public void deleteNotice(String idlist,HttpServletResponse response)throws Exception{
		String [] id = idlist.split(",");
		for(int i = 0; i<id.length; i++){
			int nid = Integer.parseInt(id[i]);
			//根据删除系统公告
			systemNoticeService.deleteNoticeBull(nid);
			systemNoticeService.deleteNotice(nid);
		}
	}
	//前往部门管理页面
	@RequestMapping("/deptManager")
	public String toDeptManager()throws Exception{
		return "deptList";
	}
	//加载部门列表数据
	@RequestMapping("/loadDept")
	public void loadDeptList(HttpServletResponse response)throws Exception{
		List<DeptVO> deptList = systemNoticeService.findAllDepts();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(deptList);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//加载部门名称
	@RequestMapping("/selectDeptName")
	public void selectDeptName(HttpServletResponse response)throws Exception{
		List<DeptVO> deptList = systemNoticeService.findAllDepts();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(deptList);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//前往公告类别页面
	@RequestMapping("/toNoticeType")
	public String toNoticeType()throws Exception{
		return "noticetype";
	}
	
	@RequestMapping("/noticetypeList")
	public void findnoticetypeList(Noticetype noticetype,String page,String rows,HttpServletResponse response)throws Exception{
		
		int curreatePage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		PageHelper.startPage(curreatePage, pageSize);
		List<Noticetype> noticeList = systemNoticeService.selectNoticeType(noticetype);
		PageInfo<Noticetype> pageInfo = new PageInfo<Noticetype>(noticeList);
		//总记录数
		Long count = pageInfo.getTotal();
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(noticeList);
		String json = "{\"total\":"+count+",\"rows\":"+str+"}";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//前往公告查看页面
	@RequestMapping("/toShowNotice")
	public String toShowNotice()throws Exception{
		return "showNotice";
	}
	//添加公告类型
	@RequestMapping("/addNoticeType")
	public void addNoticeType(Noticetype noticetype)throws Exception{
		systemNoticeService.insertNoticeType(noticetype);
	}
	//修改公告类型
	@RequestMapping("/editNoticeType")
	public void updateNoticeType(Noticetype noticetype)throws Exception{
		systemNoticeService.updateNoticeType(noticetype);
	}
	//删除公告类型
	@RequestMapping("/deleteNoticeType")
	public void deleteNoticeType(String idlist,HttpServletResponse response)throws Exception{
		String [] id = idlist.split(",");
		for(int i = 0; i<id.length; i++){
			int nid = Integer.parseInt(id[i]);
			systemNoticeService.deleteNoticeType(nid);
		}
	}
	//加载公告查看列表
	@RequestMapping("/loadNoticeToShow")
	public void loadNoticeToShow(NoticeVO noticeVO,String page,String rows,HttpServletResponse response)throws Exception{
		int curreatePage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		PageHelper.startPage(curreatePage, pageSize);
		List<NoticeVO> noticeList = systemNoticeService.selectNoticeToShow(noticeVO);
		PageInfo<NoticeVO> pageInfo = new PageInfo<NoticeVO>(noticeList);
		//总记录数
		Long count = pageInfo.getTotal();
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(noticeList);
		String json = "{\"total\":"+count+",\"rows\":"+str+"}";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
}
