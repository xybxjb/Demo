package cn.model;

public class Classroom {
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Classroom(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + "]";
	}
	
	
}
