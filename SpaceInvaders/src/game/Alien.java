package game;

import javax.swing.ImageIcon;

public class Alien extends Actor {
	private int health;
	
	public Alien(int h, ImageIcon a){
		super(a);
		health=h;
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
