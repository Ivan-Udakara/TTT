import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainWindow_Support extends JPanel {
	
	/*  creates an Image variable to keep the back ground image  */
	Image backGroundImg = null;
	
	/*  creates buttons for the MainWindow  */
	JButton btnPlay = new JButton("Paly");
	JButton btnStatistics = new JButton("Statistics");
	JButton btnExit = new JButton("Exit");
	
	
	/*  constructor method  */
	MainWindow_Support() throws IOException{
		
		MediaTracker mediaTrackerObj = new MediaTracker(this);
		
		/*  assigns the back ground image to the Image variable  */
		backGroundImg = Toolkit.getDefaultToolkit().getImage("src/backGroundImg01.jpg");
		mediaTrackerObj.addImage(backGroundImg, 0);
		
		try{
			mediaTrackerObj.waitForAll();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		/*  creates buttons for the main window  */
//		BufferedImage btnImage1 = ImageIO.read(new File("src/notification_error.png"));
		/*---------------------------------------*/
//		JButton btnPlay = new JButton(new ImageIcon(btnImage1));
//		btnPlay.setBorder(BorderFactory.createEmptyBorder());
//		btnPlay.setContentAreaFilled(false);
		
		
		
		
		add(btnPlay);
		add(btnStatistics);
		add(btnExit);
		
		setFunctions();
	}
	
	/*  draws the back ground image on the interface  */
	private void doDrawing(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(backGroundImg, 1, 1, null);
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		doDrawing(g);
		int width = backGroundImg.getWidth(null);
		int height = backGroundImg.getHeight(null);
//		g.drawImage(backGroundImg, 1, 1, null);
	}
	
/*  sets the functionalities for the buttons  */
	public void setFunctions(){
		/*  functionality of btnPlay  */
		btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("This button works properly--Play");
				
				/*------------*/
				MainWindow_Support MWobj;
				try {
					MWobj = new MainWindow_Support();
					MWobj.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				GameWindow GMobj = new GameWindow();
				
				
				
			}
		});
		
		/*  functionality of btnStatistics  */
		btnStatistics.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("This button works properly--Statistics");
				
			}
		});
		
		/*  functionality of btnExit  */
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("This button works properly--Exit");
				
			}
		});
		
	}
	
}
