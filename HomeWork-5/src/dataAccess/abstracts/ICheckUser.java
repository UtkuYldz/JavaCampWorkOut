package dataAccess.abstracts;

import entities.User;

public interface ICheckUser {
	boolean checkPassword(User user);
	boolean checkEmail(User users);
	boolean checkEmailAgain(User user,User[] users);
	boolean checkName(User user);
	
	
	
	

}
