package OneToForteen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JPanelTest extends JFrame {
    public JPanelTest() {
        final JTextArea jt = new JTextArea(10, 10);
        jt.setEditable(true);
        JCheckBox jc1 = new JCheckBox("a");
        JCheckBox jc2 = new JCheckBox("b");
        JCheckBox jc3 = new JCheckBox("c");
        Container ct = getContentPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        ct.setLayout(new BorderLayout());
        ct.add(panel1, BorderLayout.NORTH);
        final JScrollPane scrollPane = new JScrollPane(jt);
        panel1.add(scrollPane);
        ct.add(panel2,BorderLayout.SOUTH);
        panel2.add(jc1);
        panel2.add(jc2);
        panel2.add(jc3);
        jc1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.append("a has been selected\n");
            }
        });
        jc2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.append("b is been selected\n");
            }
        });
        jc3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.append("c is been selected\n");
            }
        });
        setTitle("check box test");
        setVisible(true);
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JPanelTest();
    }
}