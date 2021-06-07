package core;

import business.concretes.UserManager;
import dataAccess.concretes.CheckUserManager;
import entities.User;

public class Google  extends UserManager{
	
	@Override
	public void add(User user,User[] users) {
		CheckUserManager checkUserManager = new CheckUserManager();
		
		if( checkUserManager.checkEmail(user) && checkUserManager.checkPassword(user) && !checkUserManager.checkEmailAgain(user,users) && checkUserManager.checkName(user)) {
			System.out.println("Kullanýcý eklendi.\n");
			System.out.println("'" + user.getEmail()+ "'" +" adresine doðrulama kodu gönderildi.\n");
			System.out.println("Verdiðiniz kod doðru !! Hesabýnýz doðrulanmýþtýr..\n");
			System.out.println("[Hesabýnýz Google ile oluþturulmuþtur..]");
		}else{
			System.out.println("Kullanýcý eklenemedi.\nTekrar Deneyiniz..");
		}
		
	}
	
	

}
