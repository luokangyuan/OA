package cn.luo.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.luo.ssm.po.DeptVO;
import cn.luo.ssm.po.Staff;
import cn.luo.ssm.service.SystemDeptService;
import cn.luo.ssm.service.SystemNoticeService;
/**
 * 系统部门控制类
 * @author Administrator
 *
 */
@Controller
public class SystemDeptController {
	@Autowired
	private SystemNoticeService systemNoticeService;
	@Autowired
	private SystemDeptService systemDeptService;
	//添加部门
	@RequestMapping("/insertDept")
	public void insertDept(DeptVO deptVO)throws Exception{
		systemDeptService.insertDept(deptVO);
		
		
	}
	//加载新增部门弹框的上级部门信息
	@RequestMapping("/loadSupperDept")
	public void loadSupperDept(HttpServletResponse response)throws Exception{
		List<DeptVO> alldepts = systemNoticeService.findAllDepts();
		List<DeptVO> supdept = new ArrayList<DeptVO>();
		for(int i = 0; i<alldepts.size();i++){
			String deptNumber = alldepts.get(i).getDeptNumber();
			if(deptNumber.length()<5){
				supdept.add(alldepts.get(i));
			}
		}
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(supdept);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
		
	}
	//修改部门
	@RequestMapping("/editDept")
	public void updateEditDept(DeptVO deptVO)throws Exception{
		//根据部门id修改部门名称和部门描述信息
		systemDeptService.updateDeptInfo(deptVO);
		systemDeptService.updateDeptNoChart(deptVO.getDeptId());
		List<Staff> persiList = systemDeptService.findAllStaffByDept(deptVO.getDeptId());
		for(int i = 0 ; i < persiList.size();i++){
			if(persiList.get(i).getStaname().equals(deptVO.getStaName())){
				systemDeptService.updatDdeptChart(persiList.get(i).getStaid());
			}
			
		}
		
		
	}
	//加载部门所有员工
	@RequestMapping("/loadDeptChart")
	public void loadDeptChart(String deptid,HttpServletResponse response)throws Exception{
		int pid = Integer.parseInt(deptid);
		List<Staff> persiList = systemDeptService.findAllStaffByDept(pid);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(persiList);
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
		
	}
	//删除部门
	@RequestMapping("/deletedept")
	public void deletedept(String deptidlist,HttpServletResponse response)throws Exception{
		String [] id = deptidlist.split(",");
		for(int i = 0; i<id.length; i++){
			int pid = Integer.parseInt(id[i]);
			//根据删除部门
			systemDeptService.deleteDept(pid);
		}
		
	}
	
	
}
