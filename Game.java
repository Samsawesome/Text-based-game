import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game implements ActionListener {

	//Initializing objects
	//JFrame
	JFrame j = new JFrame();
	//Menu Buttons
	JButton menuButton = new JButton("Start");
	//Menu JPanels
	Menu menu = new Menu();
	//Objects of classes
	RunningGame rg = new RunningGame();
	//JLabels
	JLabel opening = new JLabel("You wake up after crash landing on an unknown planet. You were a holy crusader attempting to conquer the holy land of Martakis. However, you were shot down during battle.");;;
	
	
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
		rg.add(opening);
		opening.setBounds(100, 100, 1200, 100);
		
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
