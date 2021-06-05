package Entities;

import java.time.LocalDate;


public class Customer {
	
	private String firstName;
	private String lastName;
	private String NationalNum;
	private LocalDate localdate;
	private int level;
	private String gamertype;
	private double money;
	
	public Customer(String firstName, String lastName, String nationalNum, LocalDate localdate, int level,
			String gamertype,double money) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		NationalNum = nationalNum;
		this.localdate = localdate;
		this.level = level;
		this.gamertype = gamertype;
		this.money = money;
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
		return NationalNum;
	}

	public void setNationalNum(String nationalNum) {
		NationalNum = nationalNum;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getGamertype() {
		return gamertype;
	}

	public void setGamertype(String gamertype) {
		this.gamertype = gamertype;
	}
	
	public double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
	
}