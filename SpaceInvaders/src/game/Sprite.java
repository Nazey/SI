package game;

import javax.swing.ImageIcon;

public class Sprite {

	public Sprite(int a,int b,int c,int d){
		x=a;
		y=b;
		Width=c;
		Height=d;
	}
	
	private ImageIcon image;
	
	private int x, y, Width, Height;
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
}
