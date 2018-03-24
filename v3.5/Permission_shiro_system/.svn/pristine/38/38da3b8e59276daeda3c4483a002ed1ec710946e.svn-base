
package cn.luo.ssm.controller;

import java.util.List;

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
import cn.luo.ssm.po.Alonework;
import cn.luo.ssm.po.Noticetype;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.service.AloneWorkService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 待办事项
 *<p>Title:AloneWorkController </p>
 * <p>Description: </p>
 * <p>Company:康佳集团有限责任公司 </p> 
 * @author :罗康元
 * @date2017-4-4
 */
@Controller
public class AloneWorkController {
	@Autowired
	private AloneWorkService aloneWorkService;
	//去事项查看页面
	@RequestMapping("/toShowTodoList")
	public String toShowTodoList()throws Exception{
		return "todoShowList";
	}
	//加载待办事项
	@RequestMapping("/loadTodoList")
	public void loadTodoList(Alonework alonework,String page,String rows,HttpServletResponse response)throws Exception{
		int curreatePage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		PageHelper.startPage(curreatePage, pageSize);
		List<Alonework> todoList = aloneWorkService.selectAllAloneWork(alonework);
		PageInfo<Alonework> pageInfo = new PageInfo<Alonework>(todoList);
		//总记录数
		Long count = pageInfo.getTotal();
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(todoList);
		String json = "{\"total\":"+count+",\"rows\":"+str+"}";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//自己添加待办事项
	@RequestMapping("/insertTodoWorkByMe")
	public void insertTodoWorkByMe(Alonework alonework, @RequestParam("file") MultipartFile file)throws Exception{
		aloneWorkService.insertTodoWork(alonework, file);
	}
	//去事项管理页面
	@RequestMapping("/toTodoManagerList")
	public String toTodoManagerList()throws Exception{
		return "todoManagerList";
	}
	//加载事项管理的事项列表
	@RequestMapping("/loadTodoManagerList")
	public void loadTodoManagerList(Alonework alonework,String page,String rows,HttpServletResponse response)throws Exception{
		Staff staff = aloneWorkService.findStaffBySid();
		int curreatePage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		PageHelper.startPage(curreatePage, pageSize);
		List<Alonework> todoList = aloneWorkService.selectSysAllAloneWork(staff);
		PageInfo<Alonework> pageInfo = new PageInfo<Alonework>(todoList);
		//总记录数
		Long count = pageInfo.getTotal();
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(todoList);
		String json = "{\"total\":"+count+",\"rows\":"+str+"}";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//加载当前用户的下属员工信息
	@RequestMapping("/loadlowStaff")
	public void loadlowStaff(HttpServletResponse response)throws Exception{
		List<Staff> staList = aloneWorkService.selectStaffList();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(staList);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//管理员为其员工添加待办事项
	@RequestMapping("/insertTodoWorkBysystem")
	public void insertTodoWorkBysystem(Alonework alonework,HttpServletResponse response, @RequestParam("file") MultipartFile file ,String lowstaff)throws Exception{
		aloneWorkService.insertTodoWorkBySys(alonework, file, lowstaff);
		String json = "ok";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	//管理员修改待办事项记录
	@RequestMapping("/edittodo")
	public void edittodo(Alonework alonework,HttpServletResponse response, @RequestParam("file") MultipartFile file,String lowstaff)throws Exception{
		aloneWorkService.updateTodpWorkById(alonework,file,lowstaff);
		String json = "ok";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	@RequestMapping("/deletetodo")
	public void deletetodo(String idlist,HttpServletResponse response)throws Exception{
		String [] id = idlist.split(",");
		for(int i = 0; i<id.length; i++){
			int nid = Integer.parseInt(id[i]);
			//根据删除系统公告
			aloneWorkService.deleteTodoWorkByID(nid);
		}
	}

}
