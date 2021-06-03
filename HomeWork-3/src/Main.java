
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, 20, "Utku", "Yıldız", "utkuy166@gmail.com", "123", "Öğrenci");
		Instructor instructor = new Instructor(1, 20, "Engin", "Demiroğ", "engin@gmail.com", "123", "Eğitmen","admin","123","JAVA");

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
