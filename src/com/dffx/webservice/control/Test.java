package com.dffx.webservice.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class Test {

	@RequestMapping("/succ")
	public String test(Model model){
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("sss", "ffff");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(i+"");
		}
		
		model.addAttribute("map",map);
		model.addAttribute("list",list);
		
		return "success";
	}
	
}
