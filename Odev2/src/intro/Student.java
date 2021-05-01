package intro;

public class Student extends Users {

	private String studentNumber;
	
	public Student(int id, String name, String lastname,String nationalNumber,String studentNumber) {
		setId(id);
		setName(name);
		setLastname(lastname);
		setNationalNumber(nationalNumber);
		this.studentNumber = studentNumber;
		
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}
