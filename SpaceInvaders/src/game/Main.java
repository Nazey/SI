package game;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {
	
	public static Bcomponent ayy= new Bcomponent();

	public static JFrame frame = new JFrame("Sick meme!");
	
	public static Player memeboy= new Player(new ImageIcon("Images/spaceman.png"));
	
	public static void main(String[] args){
		
	frame.setVisible(true);
	frame.setPreferredSize(new Dimension(1280,1024));
	frame.setBounds(0, 0, 1280, 1024);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.repaint();
	frame.revalidate();
	frame.setResizable(false);
	frame.add(ayy);
	ayy.setOwner(frame);
	
	Sprite s = new Sprite(100,100,50,50);
	
	ayy.addDraw(s);
	ayy.addDraw(memeboy);
	
	
	}
}
