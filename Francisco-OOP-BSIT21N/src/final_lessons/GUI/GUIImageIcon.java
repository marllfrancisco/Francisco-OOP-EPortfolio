package final_lessons.GUI;

import java.awt.*;
import javax.swing.*;

public class GUIImageIcon{

	public static void main(String[] args) {

		JFrame fr = new JFrame("My GUI");
		//JLabel lbl = new JLabel("This is Label");
		JLabel puplbl = new JLabel("PUP Logo");
		// Font font = new Font("Consolas", Font.BOLD, 20);
		ImageIcon pupicon = new ImageIcon("src/final_lessons/logo200.png");
	//  ImageIcon ppicon = new ImageIcon(GUILesson.class.getResource("logo200.png"));
		
		
		puplbl.setIcon(pupicon);
		
		puplbl.setVerticalTextPosition(SwingConstants.CENTER);
		puplbl.setHorizontalTextPosition(SwingConstants.LEFT);
		
		puplbl.setVerticalAlignment(SwingConstants.CENTER);
		puplbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		fr.add(puplbl);
		
		
		fr.setSize(400,300);
		fr.setBackground(Color.BLUE);
		fr.setForeground(Color.YELLOW);
		
		//lbl.setBackground(null);
		//lbl.setOpaque(true);
		
		//fr.add(lbl);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}
