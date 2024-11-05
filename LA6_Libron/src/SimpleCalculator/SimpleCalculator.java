package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalculator extends JFrame {

    private JComboBox cbOp;
    private JTextArea taResult;
    private JTextField tfNum1;
    private JTextField tfNum2;
    private JButton btnComp;
    private JPanel pMain;

    SimpleCalculator() {
        btnComp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taResult.setText("");
                if (Objects.equals(cbOp.getSelectedItem(), "+")) {
                    taResult.append(String.valueOf(Integer.parseInt(tfNum1.getText()) + Integer.parseInt(tfNum2.getText())));
                } else if (Objects.equals(cbOp.getSelectedItem(), "-")) {
                    taResult.append(String.valueOf(Integer.parseInt(tfNum1.getText()) - Integer.parseInt(tfNum2.getText())));
                }  else if (Objects.equals(cbOp.getSelectedItem(), "*")) {
                    taResult.append(String.valueOf(Integer.parseInt(tfNum1.getText()) * Integer.parseInt(tfNum2.getText())));
                }  else {
                    taResult.append(String.valueOf(Integer.parseInt(tfNum1.getText()) / Integer.parseInt(tfNum2.getText())));
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.pMain);
        app.setTitle("Simple Calculator");
        app.setSize(400, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

