package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.model.Classroom;
import cn.model.Grade;
import cn.model.King;
import cn.model.Month;
import cn.model.Student;

public interface StudentMapper {
	
	List<Grade> findStudent(@Param("name")String name,@Param("classroom")String classroom,@Param("month")String month);
	
	int add(Grade u);

	List<Student> getStudent();

	List<Classroom> getClassroom();

	List<King> getKing();

	List<Month> getMonth();
	
	List<Grade> find();
}
