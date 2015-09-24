package cn.itcast.core.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

/**
 * 测试
 * 
 * @author wqk
 *
 */
@Controller
public class TestController {
	@RequestMapping(value="/test/list.do")
	public String list(String name) {
		System.out.println(name);
		return "";
	}
	/**
	 * 日期格式化（局部的）
	 * @param binder
	 * @param request
	 */
	@InitBinder
	public void  initBinder(WebDataBinder binder,WebRequest request){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		
		
	}

}