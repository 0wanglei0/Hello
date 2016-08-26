package OneToForteen;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class interfaceInner extends JFrame {
    public interfaceInner() {
        Container c = getContentPane();
        final JPanel jp = new JPanel();
        final JButton jb = new JButton("click");
        jb.setBounds(10, 10, 100, 30);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jb.setText("hello world");
            }
        });
        c.add(jb);
        setSize(300,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new interfaceInner();
    }
}