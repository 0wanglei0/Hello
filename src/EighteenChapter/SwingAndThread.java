package EighteenChapter;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndThread extends JFrame {
    private JLabel j1 = new JLabel();
    private int count = 0;
    private static Thread t;
    private Container container = getContentPane();

    public SwingAndThread() {
        setBounds(300, 200, 250, 100);
        container.setLayout(null);
        URL url = SwingAndThread.class.getResource("/resource/1.gif");
        Icon icon = new ImageIcon(url);
        j1.setIcon(icon);
        j1.setHorizontalAlignment(SwingConstants.LEFT);
        j1.setBounds(10, 10, 200, 50);
        j1.setOpaque(true);
        t = new Thread(new Runnable() {
            public void run() {
                while(count <= 200) {
                    j1.setBounds(count, 10, 200, 50);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO 自動生成された catch ブロック
                        e.printStackTrace();
                    }
                    count += 4;
                    if(count == 200) {
                        count = 10;
                    }
                }
            }
        });
        t.start();
        container.add(j1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingAndThread();
    }
}
