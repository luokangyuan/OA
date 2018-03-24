package cn.luo.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 案例管理
 * @author Administrator
 *
 */
@Controller
public class ExampleManagerController {
	@RequestMapping("/exampleManager")
	public String toexampleManagerPage()throws Exception{
		return "exampleManager";
	}
}
