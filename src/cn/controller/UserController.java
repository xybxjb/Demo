package cn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.model.User;
import cn.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/add")
	public String add(ModelMap m,User user){
		userService.add(user);
		return "redirect:find";
	}
	@RequestMapping("/addUser")
	public String addUser(){
		return "addUser";
	}
	@RequestMapping("/find")
	public String find(ModelMap m){
		List<User> list = userService.findAll();
		m.addAttribute("list", list);
		return "find";
	}
	@RequestMapping("/delete")
	public String delete(ModelMap m,Integer id){
		userService.delete(id);
		return "redirect:find";
	}
	@RequestMapping("/update1")
	public String update1(ModelMap m,Integer id){
		User u=userService.update1(id);
		m.addAttribute("u", u);
		return "update";
	}
	@RequestMapping("/update2")
	public String update2(ModelMap m,User user){
		userService.update2(user);
		return "redirect:find";
	}
}
