package business.concretes;

import dataAccess.concretes.CheckUserManager;
import entities.User;

public class UserManager {
	
	public void add(User user,User[] users) {
		CheckUserManager checkUserManager = new CheckUserManager();
		
		if( checkUserManager.checkEmail(user) && checkUserManager.checkPassword(user) && !checkUserManager.checkEmailAgain(user,users) && checkUserManager.checkName(user)) {
			System.out.println("Kullanıcı eklendi.\n");
			System.out.println("'" + user.getEmail()+ "'" +" adresine doğrulama kodu gönderildi.\n");
			System.out.println("Verdiğiniz kod doğru !! Hesabınız doğrulanmıştır..");
		}else{
			System.out.println("Kullanıcı eklenemedi.\nTekrar Deneyiniz..");
		}
		
	}
	public void login(User user) {
		
		System.out.println("Hesabınıza giriş başarılı !");
		
	}
	public void delete(User user) {
		System.out.println("Hesabınız silinmiştir..");
	}
	public void update(User user) {
		System.out.println("Hesabınız günellenmiştir..");
	}
	

}
