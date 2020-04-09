package cn.model;

public class Grade {
	private Integer id;
	private Classroom classroom;
	private Student student;
	private King king;
	private	Month month;
	private Integer grede;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public King getKing() {
		return king;
	}
	public void setKing(King king) {
		this.king = king;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public Integer getGrede() {
		return grede;
	}
	public void setGrede(Integer grede) {
		this.grede = grede;
	}
	
	@Override
	public String toString() {
		return "Grade [id=" + id + ", classroom=" + classroom + ", student=" + student + ", king=" + king + ", month="
				+ month + ", grede=" + grede + "]";
	}
	
	
}
