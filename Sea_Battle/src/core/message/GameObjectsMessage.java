//package core.message;
//
//import core.mapObject.SeaMap;
//import commons.Player;
//import core.scanner.ConsoleScanner;

public class GameObjectsMessage extends Message {
	public SeaMap[] maps;
	public Player[] players;
	public int gameMode;
	public int maxOfShips;
	public ConsoleScanner in;
	
	public GameObjectsMessage(Object sender, SeaMap[] maps, Player[] players, int gameMode, int maxOfShips, ConsoleScanner in) {
		super(sender);
		this.maps = maps;
		this.players = players;
		this.gameMode = gameMode;
		this.maxOfShips = maxOfShips;
		this.in = in;
	}
}
