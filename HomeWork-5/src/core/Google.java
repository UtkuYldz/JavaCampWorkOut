package core;

import business.concretes.UserManager;
import dataAccess.concretes.CheckUserManager;
import entities.User;

public class Google  extends UserManager{
	
	@Override
	public void add(User user,User[] users) {
		CheckUserManager checkUserManager = new CheckUserManager();
		
		if( checkUserManager.checkEmail(user) && checkUserManager.checkPassword(user) && !checkUserManager.checkEmailAgain(user,users) && checkUserManager.checkName(user)) {
			System.out.println("Kullanıcı eklendi.\n");
			System.out.println("'" + user.getEmail()+ "'" +" adresine doğrulama kodu gönderildi.\n");
			System.out.println("Verdiğiniz kod doğru !! Hesabınız doğrulanmıştır..\n");
			System.out.println("[Hesabınız Google ile oluşturulmuştur..]");
		}else{
			System.out.println("Kullanıcı eklenemedi.\nTekrar Deneyiniz..");
		}
		
	}
	
	

}
