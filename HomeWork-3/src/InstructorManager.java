
public class InstructorManager extends UserManager {
	public void openCourse(Instructor instructor) {
		System.out.println(instructor.getOpenedCourseName() + " isimli Kurs ba�lat�ld�.");
	}
	
	public void setHomeWork(String homeworkName) {
		System.out.println(homeworkName + " isimli �dev verildi.");
	}
	
}
