
public class User {
	private int id;
	private int birthDay;
	private String name;
	private String lastName;
	private String mail;
	private String password;
	private String userType;

	
	
	
	public User(int id, int birthDay, String name, String lastName, String mail, String password, String userType) {
		super();
		this.id = id;
		this.birthDay = birthDay;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
