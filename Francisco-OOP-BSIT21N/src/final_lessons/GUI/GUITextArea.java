package final_lessons.GUI;

import java.awt.*;
import javax.swing.*;

public class GUITextArea {

	public static void main(String[] args) {

		JFrame fr = new JFrame("My GUI");
		fr.setSize(400,300);
		fr.setBackground(Color.BLUE);
		fr.setForeground(Color.YELLOW);
		
		Font font = new Font("Consolas", Font.BOLD, 20);
		
		JLabel lbl = new JLabel("enter your msg: ");
		lbl.setBackground(Color.black);
		lbl.setForeground(Color.white);
		lbl.setOpaque(true);
		lbl.setFont(font);
	
		JTextArea txta = new JTextArea(10, 30);
		txta.setColumns(25);
		txta.setRows(8);
		txta.setText("Type ur msg here: ");
		txta.setLineWrap(true);
		txta.setWrapStyleWord(true);
		
		JScrollPane scrpnl = new JScrollPane(txta);
		
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(_ -> {
			String msg = txta.getText();
			JTextArea outa = new JTextArea(10,30);
			
			outa.setText("Remarks entered:\n" + msg);
			outa.setLineWrap(true);
			outa.setWrapStyleWord(true);
			outa.setEditable(false);
			
			// Or use Non-scrollable Message Dialog
				//JOptionPane.showMessageDialog(fr, "Remarks entered:\n" + msg);
			
			JScrollPane outscrpnl = new JScrollPane(outa);
			
			JOptionPane.showMessageDialog(
					fr, 
					outscrpnl, 
					"Scrollable Remarks",
					JOptionPane.INFORMATION_MESSAGE);

		});
		
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new FlowLayout());
		pnl.add(lbl);
		pnl.add(txta);
		pnl.add(scrpnl);
		pnl.add(btn);
		
		
		fr.add(pnl);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
