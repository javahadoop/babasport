package cn.itcast.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台搭建
 * @author wqk
 *
 */
@Controller
@RequestMapping(value="/controller")
public class CenterController {
	//入口
	@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}
	@RequestMapping(value="/top.do")
	public String top(){
		
		return "top";
	}
	
	@RequestMapping(value="/main.do")
	public String main(){
		
		return "main";
	}

}
