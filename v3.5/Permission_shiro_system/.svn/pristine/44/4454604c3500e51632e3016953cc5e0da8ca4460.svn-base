package cn.luo.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.luo.ssm.po.Staff;
import cn.luo.ssm.service.StaffManmgerService;
/**
 * 员工管理控制类
 * @author Administrator
 *
 */
@Controller
public class StaffManagerController {
	@Autowired
	private StaffManmgerService  staffManmgerService;
	//前往我的信息页面
	@RequestMapping("/toMyInfoPage")
	public String toMyInfoPage(Model model)throws Exception{
		Staff staff = staffManmgerService.selectStaffBySid();
		model.addAttribute("staff",staff);
		return "myInfoPage";
	}
}
