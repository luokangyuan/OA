package cn.luo.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.luo.ssm.po.Alonework;
import cn.luo.ssm.po.RoleVo;
import cn.luo.ssm.po.SysperTreeVO;
import cn.luo.ssm.po.Sysrole;
import cn.luo.ssm.service.PerAndRoleService;

/**
 * 权限控制类
 * @author Administrator
 *
 */
@Controller
public class PermissionController {
	@Autowired
	private PerAndRoleService perAndRoleService;
	//前往系统角色权限页面
	@RequestMapping("/toperAndRolPage")
	public String toperAndRolPage(Model model)throws Exception{
		List<RoleVo> perslist = perAndRoleService.selectAllRoleAndPer();
		model.addAttribute("pers",perslist);
		return "perAndRole";
	}
	//前往系统角色页面
	@RequestMapping("/toSysRole")
	public String toSysRolePage()throws Exception{
		return "sysRoleList";
	}
	@RequestMapping("/loadRoleList")
	public void loadRoleList(String page,String rows,HttpServletResponse response)throws Exception{
		int curreatePage = Integer.parseInt(page);
		int pageSize = Integer.parseInt(rows);
		PageHelper.startPage(curreatePage, pageSize);
		List<Sysrole> roleList = perAndRoleService.selectAllRole();
		PageInfo<Sysrole> pageInfo = new PageInfo<Sysrole>(roleList);
		//总记录数
		Long count = pageInfo.getTotal();
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(roleList);
		String json = "{\"total\":"+count+",\"rows\":"+str+"}";
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(json);
	}
	@RequestMapping("/loadPerTree")
	public void loadPerTree(String id,HttpServletResponse response)throws Exception{
		//id为父节点的主键，根据id查找子节点
		List<SysperTreeVO> trees = perAndRoleService.selectPerByPid(id);
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(trees);
		
		response.setContentType("text/javascript; charset=UTF-8");
		response.getWriter().write(str);
	}
	
}
