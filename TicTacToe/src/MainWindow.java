import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	JButton btn = new JButton("Test");
	/*		main method      */
	public static void main(String args[]) throws IOException{
		
		/*  creates an instance from MainWindow class  */
		MainWindow mainWindowObj = new MainWindow();
		
		/*  sets that above created instance(frame) visible  */
		mainWindowObj.setVisible(true);
	}
	
	/*		constructor method		*/
	MainWindow() throws IOException {
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new GameWindow();
				
			}
		});
		
		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("src/backGroundImg01.jpg"));
		add(background);
		background.setLayout(new FlowLayout());
		background.add(btn);
		
//		add(new MainWindow_Support());
//		setSize(400, 500);
	}
	
	
}
