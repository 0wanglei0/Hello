package ChapterSixth;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exercise_02 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public static void main(String[] args) throws Exception{
        Exercise_02 frame = new Exercise_02();
        frame.setVisible(true);
    }

    public Exercise_02() {
        super();
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        getContentPane().add(panel, BorderLayout.CENTER);

        final JLabel label = new JLabel();
        label.setText("name : ");
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panel.add(label, gridBagConstraints);
        textField1 = new JTextField();
        textField1.setName("name");
        textField1.setColumns(20);
        final GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 0;
        panel.add(textField1, gridBagConstraints1);

        final JLabel label1 = new JLabel();
        label1.setText("sex : ");
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.gridx = 0;
        panel.add(label1, gridBagConstraints2);
        final JPanel panel1 = new JPanel();
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridy = 1;
        gridBagConstraints3.gridx = 1;
        panel.add(panel1, gridBagConstraints3);
        final JRadioButton radioButton= new JRadioButton();
        radioButton.setText("male");
        panel1.add(radioButton);
        final JRadioButton radioButton1 = new JRadioButton();
        radioButton1.setText("female");
        panel1.add(radioButton1);

        final JLabel label2 = new JLabel();
        label2.setText("birth : ");
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridy = 2;
        gridBagConstraints4.gridx = 0;
        panel.add(label2, gridBagConstraints4);
        textField2 = new JTextField();
        textField2.setName("birth");
        textField2.setColumns(20);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridy = 2;
        gridBagConstraints5.gridx = 1;
        panel.add(textField2, gridBagConstraints5);

        final JLabel label3 = new JLabel();
        label3.setText("ID : ");
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridx = 0;
        panel.add(label3, gridBagConstraints6);
        textField3 = new JTextField();
        textField3.setName("ID");
        textField3.setColumns(20);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridy = 3;
        gridBagConstraints7.gridx = 1;
        panel.add(textField3, gridBagConstraints7);

        final JButton button = new JButton();
        button.setText("ok");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Field[] fields = Exercise_02.class.getDeclaredFields();
                for(int i = 0; i < fields.length; i++) {
                    Field field = fields[i];
                    if(field.getType().equals(JTextField.class)) {
                        field.setAccessible(true);
                        JTextField textField = null;
                        try {
                            textField = (JTextField) field.get(Exercise_02.this);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        if(textField.getText().trim().length() == 0) {
                            String info = "please input " + textField.getName() + "!";
                            JOptionPane.showConfirmDialog(null, info, "friend tips ", JOptionPane.INFORMATION_MESSAGE);
                            textField.requestFocus();
                            return;
                        }
                    }
                }
            }
        });

        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridy = 4;
        gridBagConstraints8.gridx = 1;
        panel.add(button, gridBagConstraints8);
    }
}
