
import business.concretes.UserManager;
import core.Google;
import entities.User;


public class Main {

	public static void main(String[] args) {


		User user1 = new User("Utku","Yıldız", "utkuy166@gmail.com", "123456");
		User user2 = new User("Emre","Yıldız", "utkuy166s@gmail.com", "123456");

		final User[] users = {user1};
		
		UserManager usermanager = new Google();
		usermanager.add(user2,users);
		
		
		
		 
		
	

}
}