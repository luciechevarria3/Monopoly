package edu.ncsu.monopoly;

public class RailRoadCell extends Cell {
	private static int baseRent;
	public static String COLOR_GROUP = "RAILROAD";
	private static int price;
	private Player currentPlayer;

	public static void setBaseRent(int baseRent) {
		RailRoadCell.baseRent = baseRent;
	}

	public static void setPrice(int price) {
		RailRoadCell.price = price;
	}

	
	public int getPrice() {
		return RailRoadCell.price;
	}

	public int getRent() {
		return RailRoadCell.baseRent * (int)Math.pow(2, propietary.numberOfRR() - 1.0);
	}
	
	public void playAction() {
		currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(propietary != currentPlayer) {
				currentPlayer.payRentTo(propietary, getRent());
			}
		}
	}
}
