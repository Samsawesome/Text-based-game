import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game implements ActionListener {

	public static void main(String[] args) {
		Game run = new Game();
		run.go();
		

	}
	
	//Runs code in this method when a certain button is clicked
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	public void go()
	{
		//Initializing objects
		JFrame j = new JFrame();
		//Menu Button
		JButton menuButton = new JButton("Start");
		//Menu JPanel
				Menu menu = new Menu();
		//Settings for JFrame
		j.setVisible(true);
		j.setSize(1300, 1300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.add(menu);
		menu.setLayout(null);
		menu.add(menuButton);
		menuButton.setBounds(560, 400, 200, 50);
		
		
		
	}
	
}
