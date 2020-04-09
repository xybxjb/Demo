package cn.model;

public class King {
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
	
	public King() {
		super();
		// TODO Auto-generated constructor stub
	}
	public King(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "king [id=" + id + ", name=" + name + "]";
	}
	
	
}
