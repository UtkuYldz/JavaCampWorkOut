package business.concretes;

import dataAccess.concretes.CheckUserManager;
import entities.User;

public class UserManager {
	
	public void add(User user,User[] users) {
		CheckUserManager checkUserManager = new CheckUserManager();
		
		if( checkUserManager.checkEmail(user) && checkUserManager.checkPassword(user) && !checkUserManager.checkEmailAgain(user,users) && checkUserManager.checkName(user)) {
			System.out.println("Kullan�c� eklendi.\n");
			System.out.println("'" + user.getEmail()+ "'" +" adresine do�rulama kodu g�nderildi.\n");
			System.out.println("Verdi�iniz kod do�ru !! Hesab�n�z do�rulanm��t�r..");
		}else{
			System.out.println("Kullan�c� eklenemedi.\nTekrar Deneyiniz..");
		}
		
	}
	public void login(User user) {
		
		System.out.println("Hesab�n�za giri� ba�ar�l� !");
		
	}
	public void delete(User user) {
		System.out.println("Hesab�n�z silinmi�tir..");
	}
	public void update(User user) {
		System.out.println("Hesab�n�z g�nellenmi�tir..");
	}
	

}
