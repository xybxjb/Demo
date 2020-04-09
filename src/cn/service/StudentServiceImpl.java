package cn.service;

import cn.dao.StudentMapper;
import cn.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentmapper;

	@Override
	public List<Grade> findStudent(String name, String classroom, String month) {
		List<Grade> list = studentmapper.findStudent(name, classroom, month);
		System.out.println(list);
		return list;
	}

	@Override
	public int add(Grade u) {
		int num = studentmapper.add(u);
		return num;
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentmapper.getStudent();
	}
	@Override
	public List<Classroom> getClassroom() {
		// TODO Auto-generated method stub
		return studentmapper.getClassroom();
	}
	@Override
	public List<King> getKing() {
		// TODO Auto-generated method stub
		return studentmapper.getKing();
	}
	@Override
	public List<Month> getMonth() {
		// TODO Auto-generated method stub
		return studentmapper.getMonth();
	}

	@Override
	public List<Grade> find() {
		// TODO Auto-generated method stub
		return studentmapper.find();
	}

}
