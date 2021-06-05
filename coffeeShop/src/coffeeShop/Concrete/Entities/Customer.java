package coffeeShop.Concrete.Entities;

import java.time.LocalDate;

import coffeeShop.Abstract.IEntitie;

public class Customer implements IEntitie {
	private String firstName;
	private String lastName;
	private String nationalNum;
	private String phoneNum;
	LocalDate localdate;
	
	public Customer(String firstName, String lastName, String nationalNum, 
			LocalDate localdate, String phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalNum = nationalNum;
		this.phoneNum = phoneNum;
		this.localdate = localdate;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalNum() {
		return nationalNum;
	}
	public void setNationalNum(String nationalNum) {
		this.nationalNum = nationalNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

}
