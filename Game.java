import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game implements ActionListener {

	//Initializing objects
	//JFrame
	JFrame j = new JFrame();
	//Menu Button
	JButton menuButton = new JButton("Start");
	//Menu JPanel
	Menu menu = new Menu();
	//Running Game
	RunningGame rg = new RunningGame();
	
	
	public static void main(String[] args) {
		Game run = new Game();
		run.go();
		

	}
	
	//Runs code in this method when a certain button is clicked
	@Override
	public void actionPerformed(ActionEvent e) {

		menu.setVisible(false);
		j.add(rg);
		rg.setVisible(true);
		rg.setLayout(null);
		
		
	}

	public void go()
	{

		
		//Settings for JFrame
		j.setVisible(true);
		j.setSize(1300, 1300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.add(menu);
		menu.setLayout(null);
		menu.add(menuButton);
		menuButton.setBounds(550, 400, 200, 50);
		//Adds the current action listener method
		menuButton.addActionListener(this);
		
		
	}
	
}
