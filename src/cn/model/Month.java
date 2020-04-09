package cn.model;

public class Month {
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
	
	public Month() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Month(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "month [id=" + id + ", name=" + name + "]";
	}
	
	
}
