package game.area;
import javax.swing.*;

import game.map.Map;
import game.map.Player;


public class Area extends JFrame {

	public Area () {
		add (new Map());
		setTitle ("2Dgame");
		setSize (800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(true);
		setVisible(true);
		
	}
	
	
	public static void main ( String []args) {
		new Area ();
		
	}
	
}
