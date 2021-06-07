package business.concretes;

import dataAccess.concretes.CheckUserManager;
import entities.User;

public class UserManager {
	
	public void add(User user,User[] users) {
		CheckUserManager checkUserManager = new CheckUserManager();
		
		if( checkUserManager.checkEmail(user) && checkUserManager.checkPassword(user) && !checkUserManager.checkEmailAgain(user,users) && checkUserManager.checkName(user)) {
			System.out.println("Kullanýcý eklendi.\n");
			System.out.println("'" + user.getEmail()+ "'" +" adresine doðrulama kodu gönderildi.\n");
			System.out.println("Verdiðiniz kod doðru !! Hesabýnýz doðrulanmýþtýr..");
		}else{
			System.out.println("Kullanýcý eklenemedi.\nTekrar Deneyiniz..");
		}
		
	}
	public void login(User user) {
		
		System.out.println("Hesabýnýza giriþ baþarýlý !");
		
	}
	public void delete(User user) {
		System.out.println("Hesabýnýz silinmiþtir..");
	}
	public void update(User user) {
		System.out.println("Hesabýnýz günellenmiþtir..");
	}
	

}
