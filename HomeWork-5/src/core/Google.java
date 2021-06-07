package core;

import business.concretes.UserManager;
import dataAccess.concretes.CheckUserManager;
import entities.User;

public class Google  extends UserManager{
	
	@Override
	public void add(User user,User[] users) {
		CheckUserManager checkUserManager = new CheckUserManager();
		
		if( checkUserManager.checkEmail(user) && checkUserManager.checkPassword(user) && !checkUserManager.checkEmailAgain(user,users) && checkUserManager.checkName(user)) {
			System.out.println("Kullan�c� eklendi.\n");
			System.out.println("'" + user.getEmail()+ "'" +" adresine do�rulama kodu g�nderildi.\n");
			System.out.println("Verdi�iniz kod do�ru !! Hesab�n�z do�rulanm��t�r..\n");
			System.out.println("[Hesab�n�z Google ile olu�turulmu�tur..]");
		}else{
			System.out.println("Kullan�c� eklenemedi.\nTekrar Deneyiniz..");
		}
		
	}
	
	

}
