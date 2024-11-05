package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftdrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            public double total;
            @Override
            public void actionPerformed(ActionEvent e) {
                total = 0;
                if (cPizza.isSelected()) total += 100;
                if (cBurger.isSelected()) total += 80;
                if (cFries.isSelected()) total += 65;
                if (cSoftdrinks.isSelected()) total += 55;
                if (cTea.isSelected()) total += 50;
                if (cSundae.isSelected()) total += 40;
                if (rb5.isSelected()) total *= 0.95;
                if (rb10.isSelected()) total *= 0.90;
                if (rb15.isSelected()) total *= 0.85;
                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.pMain);
        app.setTitle("Food Ordering System");
        app.setSize(400, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
