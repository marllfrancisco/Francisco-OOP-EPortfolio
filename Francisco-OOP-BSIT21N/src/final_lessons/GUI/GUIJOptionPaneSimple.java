package final_lessons.GUI;

import javax.swing.*;

public class GUIJOptionPaneSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null, "Your are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
		JOptionPane.showMessageDialog(null, "Your are " + height + " cm tall");
	}

}
