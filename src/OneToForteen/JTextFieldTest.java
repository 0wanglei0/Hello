package OneToForteen;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JTextFieldTest extends JFrame{

    public JTextFieldTest() {
        Container c = getContentPane();
        final JTextField jt = new JTextField("aaa", 20);
        final JButton jb = new JButton("clear");
        JPasswordField jp = new JPasswordField(10);
        jp.setEchoChar('#');
        c.setLayout(new FlowLayout());
        c.add(jt);
        c.add(jb);
        c.add(jp);
        jt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.setText("action is acted");
            }
        });
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jt.requestFocus();
            }
        });
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JTextFieldTest();
    }
}