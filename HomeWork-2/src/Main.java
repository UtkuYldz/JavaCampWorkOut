
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yaz�l�m Geli�tirme(JAVA + REACT)",2.50);
		Course course2 = new Course(2,"Yaz�l�m Geli�tirme(PYTHON)",1.50);
		
		CourseManager courseManager = new CourseManager();

		
		Course[] courses = {course1,course2};
		
		for(Course course:courses) {
			 courseManager.EnterToCourse(course);
			 courseManager.EnterToCourse2(course);
			 System.out.println("");
			
		}
		
		
			
		
		
		
		

	}

}
