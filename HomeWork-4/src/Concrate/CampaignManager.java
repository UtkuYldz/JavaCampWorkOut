package Concrate;

import Abstract.ICampaignService;
import Entities.Game;

public class CampaignManager implements ICampaignService{

	@Override
	public void rpg(Game game) {
		System.out.println("Tebrikler rpg oyunlarýmýza özel %15 indirim !!");
		double eject = 0.15*game.getPrice();
		double lastprice = game.getPrice() - eject;
		game.setPrice(lastprice);
		
		
	}

	@Override
	public void fps(Game game) {
		System.out.println("Tebrikler fps oyunlarýmýza özel %30 indirim !!");
		double eject = 0.30*game.getPrice();
		double lastprice = game.getPrice() - eject;
		game.setPrice(lastprice);
		
	}

	@Override
	public void input() {
		System.out.println("\nKampanya giriþi yapýldý.");
		
	}

	@Override
	public void update() {
		System.out.println("Kampanya Güncellendi.");
	}

	@Override
	public void delete() {
		System.out.println("Kampanya silindi.");
		
	}

}
