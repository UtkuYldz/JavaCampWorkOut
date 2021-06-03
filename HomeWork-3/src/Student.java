
public class Student extends User {
	
	
	public Student(int id, int birthDay, String name, String lastName, String mail, String password, String userType) {
		super(id, birthDay, name, lastName, mail, password, userType);
		
	}

	private String enrolledCourse;

	public String getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	

}
