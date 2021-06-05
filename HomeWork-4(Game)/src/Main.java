import java.time.LocalDate;

import Adapters.Edevlet;
import Concrate.CampaignManager;
import Concrate.CustomerManager;
import Concrate.SellGameManager;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Utku", "Yýldýz", "12312312312", LocalDate.of(1992,10,5), 5, "RPG",50);
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		
		
		Edevlet edevlet = new Edevlet();
		edevlet.CheckPerson(customer);
		
		Game game1 = new Game("Arma3","RPG",20);
		Game game2 = new Game("PUBG","FPS",30);
		
		CampaignManager campaign = new CampaignManager();
		SellGameManager sellgame = new SellGameManager();
		campaign.input();
		campaign.rpg(game1);
		sellgame.selled(game1, customer);
		
		
		
		

	}

}
