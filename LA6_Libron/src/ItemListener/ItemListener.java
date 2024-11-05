package ItemListener;

import javax.swing.*;
import java.awt.event.ItemEvent;

public class ItemListener extends JFrame {
    private JPanel pMain;
    private JCheckBox cC;
    private JCheckBox cCpp;
    private JCheckBox cCSharp;
    private JCheckBox cJava;
    private JCheckBox cPython;
    private JComboBox cbProficiency;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;

    ItemListener() {
        cC.setName("c");
        cCpp.setName("C++");
        cCSharp.setName("C#");
        cJava.setName("Java");
        cPython.setName("Python");
        languageLabel.setText("My Favorite Languages: ");
        proficiencyLabel.setText("Proficiency: ");

        cC.addItemListener(e -> updateLanguageLabel(e, cC));
        cCpp.addItemListener(e -> updateLanguageLabel(e, cCpp));
        cCSharp.addItemListener(e -> updateLanguageLabel(e, cCSharp));
        cJava.addItemListener(e -> updateLanguageLabel(e, cJava));
        cPython.addItemListener(e -> updateLanguageLabel(e, cPython));

        cbProficiency.addItemListener(e -> updateProficiencyLabel(e));

    }

    private void updateLanguageLabel(ItemEvent e, JCheckBox checkBox) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (languageLabel.getText().charAt(languageLabel.getText().length()-1) == ' ') {
                languageLabel.setText(languageLabel.getText() + checkBox.getName());
            }
            else languageLabel.setText(languageLabel.getText() + ", " + checkBox.getName());
        } else {
            if (checkBox.getName().charAt(checkBox.getName().length()-1) == languageLabel.getText().charAt(languageLabel.getText().length()-1)) {
                languageLabel.setText(languageLabel.getText().replace(", " + checkBox.getName(), ""));
                languageLabel.setText(languageLabel.getText().replace(checkBox.getName(), ""));
            }
            else languageLabel.setText(languageLabel.getText().replace(checkBox.getName() + ", ", ""));
        }
    }

    private void updateProficiencyLabel(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String proficiency = (String) cbProficiency.getSelectedItem();
            proficiencyLabel.setText("Proficiency: " + proficiency);
        }
    }


    public static void main(String[] args) {
        ItemListener app = new ItemListener();
        app.setContentPane(app.pMain);
        app.setTitle("Item Listener");
        app.setSize(400, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
