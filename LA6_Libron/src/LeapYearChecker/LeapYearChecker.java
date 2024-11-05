package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JTextField tfYear;
    private JPanel pMain;
    private JButton btnCheckYear;

    LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Integer.parseInt(tfYear.getText()) % 4 == 0 && Integer.parseInt(tfYear.getText()) % 100 != 0)
                        || Integer.parseInt(tfYear.getText()) % 400 == 0) {
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.pMain);
        app.setTitle("Leap Year Checker");
        app.setSize(400, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}




