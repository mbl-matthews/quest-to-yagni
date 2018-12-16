/**
 * @author: Timo K
   @author: Lukas H
 */

package Event;

import Board.Board;
import Player.Player;

public class Teleportevent extends Event{

	  public Teleportevent(int id,String name){
	        super(id,name);
	    }
	  
	@Override
	public String triggerEvent(Player p,Board b) {
		return teleportEvent(p);
	}
	/**
	 * teleport the player to a set position
	 * @param the player of the game
	 */
	public String teleportEvent(Player p) {
		p.setPosition(new int [] {0,2});
		return ("You got Teleported");
	}
}
