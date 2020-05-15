package chap17.hashSet;

public class MyStudent {
	private String name;
	private int grade;
	
	public MyStudent() {
		this("이순산", 2);
	}
	public MyStudent(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "이름은: "+ name + "학년은 " + grade;
				
	}
}
