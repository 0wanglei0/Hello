package OneToForteen;

import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SimpleEvent extends JFrame{

    private JButton jb = new JButton("I'm button");
    public SimpleEvent() {
        Container c = getContentPane();
        setSize(500,600);
        JComboBox jc = new JComboBox();
        jc.addItem("xiao hong");
        jc.addItem("xiao ming");
        jc.addItem("li hua");
        jc.setSize(500, 100);
        c.add(jc);
        c.setLayout(getLayout());
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SimpleEvent se = new SimpleEvent();
    }
    public void actionPerformed(ActionEvent e) {
        // TODO 自動生成されたメソッド・スタブ
        
    }

}
