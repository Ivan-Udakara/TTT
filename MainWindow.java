import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
/////	JFrame mainWindow = new JFrame();
	/*     main method      */
	public static void main(String args[]) throws IOException{
		/*  creates an instance from MainWindow class  */
		MainWindow mainWindowObj = new MainWindow();
		/*  sets that above created instance(frame) visible  */
		mainWindowObj.setVisible(true);
	}
	
	/*  creates buttons for the main window  */
	
	JButton btnPlay = new JButton("Play");
	JButton btnStatistics = new JButton("Statistics");
	JButton btnExit = new JButton("Exit");
	
	
	MainWindow() throws IOException {
		add(new MainWindow_Support());
		setSize(400, 500);
//		add(new MainWindow_Design());
//		setSize(100, 100);
		
/*		JPanel buttonPanel = new JPanel();
		buttonPanel.setMaximumSize(new Dimension(100, 100));
		buttonPanel.setLayout(new GridLayout(3, 1));
		
		/*  adds created buttons on to the interface  */
/*		btnPlay.setPreferredSize(new Dimension(50, 30));
		buttonPanel.add(btnPlay);
//		btnStatistics.setPreferredSize(new Dimension(100, 100));
//		buttonPanel.add(btnStatistics);
//		buttonPanel.add(btnExit);
		add(buttonPanel);*/
		
	}
	
	
}
