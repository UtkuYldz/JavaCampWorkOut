
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, 20, "Utku", "Y�ld�z", "utkuy166@gmail.com", "123", "��renci");
		Instructor instructor = new Instructor(1, 20, "Engin", "Demiro�", "engin@gmail.com", "123", "E�itmen","admin","123","JAVA");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp();
		instructorManager.signIn(student);
		instructorManager.openCourse(instructor);
		instructorManager.setHomeWork("Java 1");
		instructorManager.quit();
		StudentManager studentManager = new StudentManager();
		studentManager.signUp();
		studentManager.signIn(instructor);
		studentManager.openCourse();
		studentManager.finishHomeWork("Java 1");
		studentManager.quit();
		
		
		
		
		
	}

}
