package intro;

public class StudentManager {
	
	public void addStudent(Student student) {
		
		System.out.println(student.getStudentNumber()+" numaral�" +" "+ student.getName()+" "+ student.getLastname()+" isimli �grenci sisteme eklenmistir.");
		
	}


	public void  attendance(Student student) {
		System.out.println(student.name +" "+student.lastname+" yoklaman�z alindi.");
	}
}
