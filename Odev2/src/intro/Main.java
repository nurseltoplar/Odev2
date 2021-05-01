package intro;



public class Main {
	public static void main (String []args) {
		
	UserManager userManager = new UserManager();
	
	Student student  =new Student(1, "Nursel", "Toplar","2020","2030");
	StudentManager studentManager= new StudentManager();
	
	userManager.entireSystem(student);
	
	studentManager.addStudent(student);
	studentManager.attendance(student);
	
	
	
	
	Instructor instructor = new Instructor(1, "Engin", "Demirog", "2222", "Computer Science", "Java");
	InstructorManager instructorManager= new InstructorManager();
	
	userManager.entireSystem(instructor);
	
	instructorManager.getLessons(instructor);
	
	
	
	
	
	}

}
