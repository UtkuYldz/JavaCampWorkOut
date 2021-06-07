package dataAccess.concretes;



import java.util.regex.Pattern;

import dataAccess.abstracts.ICheckUser;
import entities.User;

public class CheckUserManager implements ICheckUser{

	@Override
	public boolean checkPassword(User user) {
		
		return user.getPassword().length()>=6;
	
		
	}
	
	@Override
	public boolean checkEmail(User user) {
		
		return Pattern.matches("([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.[a-zA-Z]{2,}", user.getEmail());
		
			
	}

	@Override
	public boolean checkEmailAgain(User checkuser,User[] users) {	
		
		for(User user:users) {
			if(user.getEmail().equals(checkuser.getEmail())) {
				return true;
			}
			
		}
		return false;
		
	}

	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}
		return false;
	}
	
}
