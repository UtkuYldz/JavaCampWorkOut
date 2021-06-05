package Concrate;

import Abstract.ISellGameService;
import Entities.Customer;
import Entities.Game;

public class SellGameManager implements ISellGameService{

	@Override
	public void selled(Game game,Customer customer) {
		double lastmoney = customer.getMoney() - game.getPrice();
		customer.setMoney(lastmoney);
		
		System.out.println(game.getGameName()+" satýldý.\nGeri kalan para: "+lastmoney+"\n");
		
	}

}
