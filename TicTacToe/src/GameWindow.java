import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GameWindow {
	/* -------------only for testing---------- */
	public static void main(String args[]){
		new GameWindow();
	}

	
/*	creates an instance from GameWindow_Support class	*/
	GameWindow_Support gameWindow_supportObj = new GameWindow_Support();
		
/*	creates buttons to be placed on the grid	*/
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	JButton btn9 = new JButton();

/*	the label to hold the background image	*/
	JLabel lblBackground;
/*	the label to hold the grid	*/
	JLabel lblBtn;
	
	
/*  constructor method  */
	public GameWindow() {
		JFrame gameWindowFrm = new JFrame();
		
	/*	gameWindow	*/
		gameWindowFrm.setVisible(true);
		gameWindowFrm.setTitle("Game Window");
		gameWindowFrm.setSize(new Dimension(400, 500));
		gameWindowFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*	sets the frame's layout	*/
		gameWindowFrm.setLayout(new BorderLayout());
		
	/*	lblBackground	*/
		/*	creates a new JLabel and set its background image	*/
		lblBackground = new JLabel(new ImageIcon("src/images/backGroundImg01.jpg"));
		/*	adds that JLabel(above created "lblBackgdound") to the gameWindowFrm	*/
		gameWindowFrm.add(lblBackground);
		
		/*	sets the layout of the JLabel, "lblBackground", to Flow Layout	*/
		lblBackground.setLayout(new FlowLayout());
		
	/*	lblBtn	*/
		lblBtn = new JLabel(new ImageIcon("src/images/background_grid_330x330.jpg"));
		
		/*	adds lblBtn to lblBackground	*/
		lblBackground.add(lblBtn);
		
		/*	sets the layout of the JLabel, "lblBtn", to GridLayout	*/
		lblBtn.setLayout(new GridLayout(3, 3, 6, 6));
		
	/*	adds buttons to the form(adds to the JLabel "lblBtn")	*/
		/*	adds btn1	*/
		lblBtn.add(btn1);
		btn1.setOpaque(false);//
		btn1.setContentAreaFilled(false);//disable the filling of the button
		btn1.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn2	*/
		lblBtn.add(btn2);
		btn2.setOpaque(false);//
		btn2.setContentAreaFilled(false);//disable the filling of the button
		btn2.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn3	*/
		lblBtn.add(btn3);
		btn3.setOpaque(false);//
		btn3.setContentAreaFilled(false);//disable the filling of the button
		btn3.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn4	*/
		lblBtn.add(btn4);
		btn4.setOpaque(false);//
		btn4.setContentAreaFilled(false);//disable the filling of the button
		btn4.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn5	*/
		lblBtn.add(btn5);
		btn5.setOpaque(false);//
		btn5.setContentAreaFilled(false);//disable the filling of the button
		btn5.setBorderPainted(false);//disable the border of the button
		
		/*	adds tbn6	*/
		lblBtn.add(btn6);
		btn6.setOpaque(false);//
		btn6.setContentAreaFilled(false);//disable the filling of the button
		btn6.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn7	*/
		lblBtn.add(btn7);
		btn7.setOpaque(false);//
		btn7.setContentAreaFilled(false);//disable the filling of the button
		btn7.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn8	*/
		lblBtn.add(btn8);
		btn8.setOpaque(false);//
		btn8.setContentAreaFilled(false);//disable the filling of the button
		btn8.setBorderPainted(false);//disable the border of the button
		
		/*	adds btn9	*/
		lblBtn.add(btn9);
		btn9.setOpaque(false);//
		btn9.setContentAreaFilled(false);//disable the filling of the button
		btn9.setBorderPainted(false);//disable the border of the button
		
		
	/*	calls the buttonActions method	*/
		buttonActions();
	}

/*	sets the functionalities to the buttons on the grid	*/
	public void buttonActions(){
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn1");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(1);
				if(imageNumber == 1)
					btn1.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn1.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn2");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(2);
				if(imageNumber == 1)
					btn2.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn2.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn3");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(3);
				if(imageNumber == 1)
					btn3.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn3.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn4");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(4);
				if(imageNumber == 1)
					btn4.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn4.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn5");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(5);
				if(imageNumber == 1)
					btn5.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn5.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn6");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(6);
				if(imageNumber == 1)
					btn6.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn6.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn7");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(7);
				if(imageNumber == 1)
					btn7.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn7.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn8");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(8);
				if(imageNumber == 1)
					btn8.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn8.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed btn9");
				int imageNumber = gameWindow_supportObj.clickMultiPlayer(9);
				if(imageNumber == 1)
					btn9.setIcon(new ImageIcon("src/images/notification_error.png"));
				else if(imageNumber == 2)
					btn9.setIcon(new ImageIcon("src/images/dot.png"));
				
				gameWindow_supportObj.checkGameStatus();
				
			}
		});
		
	}
	
	
}
