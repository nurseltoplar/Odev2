package intro;

public class StudentManager {
	
	public void addStudent(Student student) {
		
		System.out.println(student.getStudentNumber()+" numaralı" +" "+ student.getName()+" "+ student.getLastname()+" isimli ögrenci sisteme eklenmistir.");
		
	}


	public void  attendance(Student student) {
		System.out.println(student.name +" "+student.lastname+" yoklamanız alindi.");
	}
}
