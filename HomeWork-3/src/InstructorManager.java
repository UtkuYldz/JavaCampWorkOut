
public class InstructorManager extends UserManager {
	public void openCourse(Instructor instructor) {
		System.out.println(instructor.getOpenedCourseName() + " isimli Kurs baþlatýldý.");
	}
	
	public void setHomeWork(String homeworkName) {
		System.out.println(homeworkName + " isimli ödev verildi.");
	}
	
}
