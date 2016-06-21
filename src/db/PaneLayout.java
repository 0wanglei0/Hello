package db;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PaneLayout extends JFrame {

    private String[] contents = {"list1", "list2", "list3", "list4"};
    private JComboBox jcb = new JComboBox();
    private JButton jb = new JButton("upload");
    int count = 0;

    public PaneLayout() {
        setVisible(true);
        setSize(300, 500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(jb);
        cp.add(jcb);
        jcb.addItem("please input or click");
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(count < contents.length) {
                    jcb.addItem(contents[count]);
                    count++;
                }
            }
        });
    }

    public static void main(String[] args) {
        new PaneLayout();
    }
}
