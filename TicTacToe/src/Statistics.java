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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Statistics {
	/**/
	TTTConnect TTTObj = new TTTConnect();
	
	Player player[] = new Player[100];
	
	/*	the label to hold the background image	*/
	JLabel lblBackground;
	JLabel lblData;
	JTable dataTable;// = new JTable(10, 4);
	DefaultTableModel model;
	String column[] = {"Player", "Matches", "Wins", "Defeats"};
	
	Statistics(){
		JFrame statisticsFrm = new JFrame();
		
		statisticsFrm.setVisible(true);
		statisticsFrm.setTitle("Statistics");
		statisticsFrm.setSize(new Dimension(400, 500));
		statisticsFrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		/*	sets the frame's layout	*/
		statisticsFrm.setLayout(new BorderLayout());
		
	/*	lblBackground	*/
		/*	creates a new JLabel and set its background image	*/
		lblBackground = new JLabel(new ImageIcon("src/images/backGroundImg01.jpg"));
		/*	adds that JLabel(above created "lblBackgdound") to the gameWindowFrm	*/
		statisticsFrm.add(lblBackground);
		
		/*	sets the layout of the JLabel, "lblBackground", to Flow Layout	*/
		lblBackground.setLayout(new FlowLayout());
		
		model = new DefaultTableModel(column, 10);
		dataTable = new JTable(model){@Override
			public boolean isCellEditable(int arg0, int arg1){
			return false;
		}
		};
		lblBackground.add(dataTable);
		
		player = TTTObj.getList();
		System.out.println("Name: "+player[0].name);
		
	}
}







