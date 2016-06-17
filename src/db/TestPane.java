package db;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TestPane extends JFrame{

    private static final long serialVersionUID = 1L;
    private JComboBox comboBox;
    public static void main(String[] args) {
        new TestPane();
    }

    public TestPane() {
        setVisible(true);
        setSize(200,150);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        comboBox = new JComboBox();
        comboBox.addItem("red");
        comboBox.addItem("yellow");
        comboBox.addItem("blue");
        comboBox.addItem("black");
        getContentPane().add(comboBox, BorderLayout.NORTH);

        final JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);

        final JCheckBox checkBox = new JCheckBox();
        checkBox.setText("man");
        panel.add(checkBox);

        final JCheckBox checkBox_1 = new JCheckBox();
        checkBox_1.setText("female");
        panel.add(checkBox_1);

        final JPanel panel_1 = new JPanel();
        getContentPane().add(panel_1, BorderLayout.SOUTH);
        
        final JButton okButton = new JButton();
        okButton.setText("ok");
        panel_1.add(okButton);

        final JButton button_1 = new JButton();
        button_1.setText("unset");
        panel_1.add(button_1);
    }
}
