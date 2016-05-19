package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Bcomponent extends JLabel {

	private JFrame owner;
	private ArrayList<Sprite> draws = new ArrayList<Sprite>();
	
	public Bcomponent(){
		super();
	}
	
	public void paint(Graphics g){
		
		if (owner != null)
			setBounds(0,0,owner.getWidth(),owner.getHeight());
		
		for (int i = 0; i< draws.size(); i++){
			Sprite s = draws.get(i);
			if(draws.get(i).getImage()==null)
				
			{g.drawRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());}
			else{
				g.drawImage(draws.get(i).getImage().getImage(),draws.get(i).getX(), draws.get(i).getY(), null);
			}
		}
		
		super.paint(g);
	}
	
	public void addDraw(Sprite s){
		this.getDraws().add(s);
	}

	public JFrame getOwner() {
		return owner;
	}

	public void setOwner(JFrame owner) {
		this.owner = owner;
	}

	public ArrayList<Sprite> getDraws() {
		return draws;
	}

	public void setDraws(ArrayList<Sprite> draws) {
		this.draws = draws;
	}
}
