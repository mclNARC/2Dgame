package game.map;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Player {
	private int x,y ;
	private int dx, dy;
	private Image img;
	private int height , width;
	
	
	public Player () {
		this.x = 100;
		this.y = 100;
		
	}

	
	public void load () {
		 ImageIcon ref = new ImageIcon  ("res\\player.png");
		 img = ref.getImage();
		 
		 height = img.getHeight(null);
		 width = img.getWidth(null);
	}
	
	public void update () {
		y += dy;
		x += dx;
	}
	
	
	public void keyPress (KeyEvent key) {
		int code = key.getKeyCode();
		
		switch (code) {
		case KeyEvent.VK_UP :
		dy = -3;
		break;
		
		case KeyEvent.VK_DOWN :
			dy = 3;
			break;
			
		case KeyEvent.VK_LEFT :
			dx = -3;
			break;
			
		case KeyEvent.VK_RIGHT :
			dx = 3;
			break ;
		}
	}
		public void keyRelease (KeyEvent key) {
			int code = key.getKeyCode();
			
			switch (code) {
			case KeyEvent.VK_UP :
			dy = 0;
			break;
			
			case KeyEvent.VK_DOWN :
				dy = 0;
				break;
				
			case KeyEvent.VK_LEFT :
				dx = 0;
				break;
				
			case KeyEvent.VK_RIGHT :
				dx = 0;
				break;
			}
	}


		public int getX() {
			return x;
		}


		public int getY() {
			return y;
		}


		public Image getImg() {
			return img;
		}


		


}
