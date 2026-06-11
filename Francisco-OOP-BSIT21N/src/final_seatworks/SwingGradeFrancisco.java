// Francisco, Marl Louie T. | BSIT 2-1N
// Final Seatwork Set B / Batch B
package final_seatworks;

import javax.swing.*;
import java.awt.GridLayout;

public class SwingGradeFrancisco {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Swing Grade Computation Form");
        
        JPanel pnl = new JPanel(new GridLayout(5, 2, 5, 5));
        
        JLabel lblStudName, lblPrelimGrd, lblMidtGrd, lblFinalGrd;
        lblStudName = new JLabel("Student Name:");
        lblPrelimGrd = new JLabel("Prelim Grade:");
        lblMidtGrd = new JLabel("Midterm Grade:");
        lblFinalGrd = new JLabel("Final Grade:");

        lblStudName.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrelimGrd.setHorizontalAlignment(SwingConstants.CENTER);
        lblMidtGrd.setHorizontalAlignment(SwingConstants.CENTER);
        lblFinalGrd.setHorizontalAlignment(SwingConstants.CENTER);
        
        JTextField txtStudName, txtPrelimGrd, txtMidtGrd, txtFinalGrd;
        txtStudName = new JTextField(15);
        txtPrelimGrd = new JTextField(10);
        txtMidtGrd = new JTextField(10);
        txtFinalGrd = new JTextField(10);

        JButton btnCompGrd = new JButton("Compute Grade");

        pnl.add(lblStudName);
        pnl.add(txtStudName);

        pnl.add(lblPrelimGrd);
        pnl.add(txtPrelimGrd);

        pnl.add(lblMidtGrd);
        pnl.add(txtMidtGrd);

        pnl.add(lblFinalGrd);
        pnl.add(txtFinalGrd);

        pnl.add(btnCompGrd);

        
        btnCompGrd.addActionListener(e -> {

            String name = txtStudName.getText();

            double prelim = Double.parseDouble(txtPrelimGrd.getText());
            double midterm = Double.parseDouble(txtMidtGrd.getText());
            double finals = Double.parseDouble(txtFinalGrd.getText());

            double ave = (prelim + midterm + finals) / 3;

            String remark;
            if (ave >= 90)  {
                remark = "Excellent";
            } else if (ave >= 80){
                remark = "Good";
            } else if (ave >= 75) {
                remark = "Fair";
            } else {
                remark = "Failed";
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Student Name: " + name +
                    "\nPrelim Grade: " + prelim +
                    "\nMidterm Grade: " + midterm +
                    "\nFinal Grade: " + finals +
                    "\nAverage Grade: " + String.format("%.2f", ave) +
                    "\nRemark: " + remark
            );

        });

        fr.add(pnl);
        fr.setSize(400, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
