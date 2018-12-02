package Player;
import Board.Board;;

class Player {
	
	String name;
	int xPos,yPos;
	final int breite=Board.getX();
	boolean[] walls=null;
	
	/**
	 * sets starting position on the board
	 * @param xPos
	 * @param yPos
	 */
	public Player(int xPos,int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
		walls=Board.changePosition(breite*yPos+xPos);
	}
	
	/**
	 * moves x,y in given direction and saves walls at position
	 * @param direction
	 * @return true if move is possible
	 */
	public boolean move(String direction) {
		
		if(direction.toLowerCase().equals("north")&& walls[0]==true) {
			yPos+=1;
			walls=Board.changePosition(breite*yPos+xPos);
			return true;
		}
		else if(direction.toLowerCase().equals("south")&& walls[1]==true) {
			yPos-=1;
			walls=Board.changePosition(breite*yPos+xPos);
			return true;
		}	
		else if(direction.toLowerCase().equals("west")&& walls[2]==true) {
			xPos-=1;
			walls=Board.changePosition(breite*yPos+xPos);
			return true;
		}	
		else if(direction.toLowerCase().equals("east")&& walls[3]==true){
			xPos+=1;
			walls=Board.changePosition(breite*yPos+xPos);
			return true;
		}
		return false;
	}
	
	

}

