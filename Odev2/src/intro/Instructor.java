package intro;

public class Instructor extends Users{
	
	private String departments;
	private String lessons;
	
	public Instructor(int id, String name, String lastname, String nationalNumber, String departments, String lessons ) {
		setName(name);
		setLastname(lastname);
		setId(id);
		setNationalNumber(nationalNumber);
		this.departments =departments;
		this.lessons=lessons;
  	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public String getLessons() {
		return lessons;
	}
	public void setLessons(String lessons) {
		this.lessons = lessons;
	}
	

}
