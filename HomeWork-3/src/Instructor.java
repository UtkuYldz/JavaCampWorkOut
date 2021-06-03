
public class Instructor extends User {
	
	private String adminName;
	private String adminPassword;
	private String openedCourseName;
	
	public Instructor(int id, int birthDay, String name, String lastName, String mail, String password, String userType,
			String adminName, String adminPassword, String openedCourseName) {
		super(id, birthDay, name, lastName, mail, password, userType);
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.openedCourseName = openedCourseName;
	}
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getOpenedCourseName() {
		return openedCourseName;
	}
	public void setOpenedCourseName(String openedCourseName) {
		this.openedCourseName = openedCourseName;
	}


}
