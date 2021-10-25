package game.map;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.ImageIcon;


public class Map extends JPanel implements ActionListener {
	private Image background;
	private Player player;
	private Timer timer;
	
	
	public Map () {
		setFocusable(true);
		setDoubleBuffered(true);
		
		ImageIcon reference = new ImageIcon("res\\black800x600.png");
		background = reference.getImage();
		
		player = new Player ();
		player.load();
		addKeyListener(new KeyboardAdpt());
		 
		 timer = new Timer(5, this);
		 timer.start();
		 
		
	}

public void paint (Graphics graph) {
	Graphics2D graphic = (Graphics2D) graph;
	graphic.drawImage(background, 0, 0, null);
	graphic.drawImage(player.getImg(), player.getX(), player.getY(), this);
	graphic.dispose();
}

@Override
public void actionPerformed(ActionEvent e) {
	player.update();
	repaint();
	
}

private class KeyboardAdpt extends KeyAdapter {
	@Override
	public void keyPressed(KeyEvent e) {
		player.keyPress(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		player.keyRelease(e);
	}
	
	
}

}
