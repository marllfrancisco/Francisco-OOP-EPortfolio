package final_lessons.GUI;

import javax.swing.*;

public class GUIJOptionPane {

	public static void main(String[] args) {

		String cust = JOptionPane.showInputDialog(null, "Enter Customer Name: ");
		String item = JOptionPane.showInputDialog(null, 
				"Choose an Item:\n" + 
				"1 - Burger = 50\n" +
				"2 - Fries = 30\n" +
				"3 - Softdrinks = 20\n" );
		String qtyIn = JOptionPane.showInputDialog(null, "Enter quantity: ");
		
		int qty = Integer.parseInt(qtyIn);
		int price = 0;
		String itemName;
		
		if (item.equals("1")){
			itemName = "Burger";
			price = 50;
		} else if (item.equals("2")){
			itemName = "Fries";
			price = 30;
		} else if (item.equals("3")){
			itemName = "Softdrinks";
			price = 20;
		} else {
			JOptionPane.showMessageDialog(null, "Invalid item selected");
			return; //this exits the program
		}
		
		int total = price * qty;
		
		JOptionPane.showMessageDialog(null, 
				"Order Summary" +
				"\nCustomer Name: " + cust +
				"\nItem: " + itemName +
				"\nPrice: " + price +
				"\nQuantity: " + qty +
				"\nTotal Amount: " + total 
				);
		
		int confirm = JOptionPane.showConfirmDialog(null, 
				"Do you want to confirm your order?",
				"Confirm Order",
				JOptionPane.YES_NO_OPTION);
		
		if (confirm == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, 
					"Order Confirmed. Thank you",
					"Confirmed",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, 
					"Order Cancelled",
					"Cancelled",
					JOptionPane.WARNING_MESSAGE);
		}
		
		
	}

}
