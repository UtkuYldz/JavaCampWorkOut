package Entities;

public class Game {
	private String gameName;
	private String gameType;
	private double price;
	
	public Game(String gameName, String gameType, double price) {
		super();
		this.gameName = gameName;
		this.gameType = gameType;
		this.price = price;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
