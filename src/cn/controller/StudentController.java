package cn.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.model.Classroom;
import cn.model.Grade;
import cn.model.King;
import cn.model.Month;
import cn.model.Student;
import cn.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/index")
	public String find1() {
		return "index";
	}

	@RequestMapping("/findPage")
	public String findPage() {
		return "find1";
	}

	@RequestMapping("/findAll")
	public String findStudent(String name,String classroom,String month, Model m) {
		System.out.println("123");
		System.out.println(name);
		System.out.println(classroom);
		System.out.println(month);
		List<Grade> list = studentservice.findStudent(name, classroom, month);
		System.out.println(list);
		m.addAttribute("s", list);
		return "ok";

	}

	@RequestMapping("/addForm")
	public String addForm(Model model) {
		List<Student> s = studentservice.getStudent();
		List<Classroom> c = studentservice.getClassroom();
		List<King> k = studentservice.getKing();
		List<Month> m = studentservice.getMonth();
		model.addAttribute("s", s);
		model.addAttribute("c", c);
		model.addAttribute("m", m);
		model.addAttribute("k", k);
		return "add";
	}

	@RequestMapping("/add")
	public String add(Grade s) {
		int a = studentservice.add(s);
		return "redirect:/findAll";
	}

//	@RequestMapping("/addPage")
//	public String addPage() {
//		return "rediret:/addForm";
//	}
	

//	@RequestMapping("/find")
//	public String find() {
//		List<Grade> find = studentservice.find();
//		return "ok";
//	}
	
}
