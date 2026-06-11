package final_lessons.GUI;

import java.awt.*;
import javax.swing.*;

public class GUILesson {

	public static void main(String[] args) {
		
		//module-info.java.
		/* some IDEs required this class with a source code:
		 * 		module final_lessons {
		 *      	requires.desktop }
		*/
		
		JFrame fr = new JFrame("My GUI");
		JLabel lbl = new JLabel("This is Label");
		Font font = new Font("Consolas", Font.BOLD, 20);
		
		
		fr.setSize(400,300);
		fr.setBackground(Color.BLUE);
		fr.setForeground(Color.YELLOW);
		
		lbl.setBackground(Color.black);
		lbl.setForeground(Color.white);
		lbl.setOpaque(true);
		lbl.setFont(font);
		
		fr.add(lbl);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
