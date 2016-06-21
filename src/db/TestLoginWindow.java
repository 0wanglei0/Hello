package db;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TestLoginWindow extends JFrame {

    public static void main(String[] args) {
        new TestLoginWindow();
    }

    public TestLoginWindow() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        JLabel jl = new JLabel("userName");
        final JTextField jt = new JTextField("", 16);
        JLabel jl1 = new JLabel("password");
        final JTextField jt1 = new JTextField("", 16);
        JButton jb = new JButton("login");
        JButton jb1 = new JButton("reset");
        jp.add(jl);
        jp.add(jt);
        jp1.add(jl1);
        jp1.add(jt1);
        cp.add(jp);
        cp.add(jp1);
        cp.add(jb);
        cp.add(jb1);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jt.getText().equals("mr") && jt1.getText().equals("mrsoft")) {
                    JOptionPane.showMessageDialog(new JFrame().getContentPane(), "login successed");
                } else {
                    JOptionPane.showMessageDialog(new JFrame().getContentPane(), "user or password is wrong");
                    jt.setText("");
                    jt1.setText("");
                }
            }
        });

        jb.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {
                // TODO 自動生成されたメソッド・スタブ
                
            }

            public void keyPressed(KeyEvent e) {
                // TODO 自動生成されたメソッド・スタブ
                if(e.getKeyChar() == e.VK_ENTER) {
                    if(jt.getText().equals("mr") && jt1.getText().equals("mrsoft")) {
                        JOptionPane.showMessageDialog(new JFrame().getContentPane(), "login successed");
                    } else {
                        JOptionPane.showMessageDialog(new JFrame().getContentPane(), "user or password is wrong");
                        jt.setText("");
                        jt1.setText("");
                    }
                }
            }

            public void keyReleased(KeyEvent e) {
                // TODO 自動生成されたメソッド・スタブ
                
            }
            
        });
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jt1.setText("");
            }
        });
    }

}
