package game;

import javax.swing.ImageIcon;

public abstract class Actor extends Sprite {


	
	public Actor(ImageIcon a){
		super(0,0, a.getIconWidth(), a.getIconWidth());
		
	}
}
