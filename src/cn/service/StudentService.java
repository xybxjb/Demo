package cn.service;

import cn.model.*;

import java.util.List;

public interface StudentService {
	
	List<Grade> findStudent(String name,String classroom,String month);
	
	int add(Grade u);

	List<Student> getStudent();

	List<Classroom> getClassroom();

	List<King> getKing();

	List<Month> getMonth();
	
	List<Grade> find();
}
