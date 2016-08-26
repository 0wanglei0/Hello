package EighteenChapter;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame {
    private Thread ta;
    private Thread tb;
    final JProgressBar pb1 = new JProgressBar();
    final JProgressBar pb2 = new JProgressBar();
    int count = 0;
    public static void main(String[] args) {
        init(new JoinTest(), 100, 100);
    }
    public static void init(JFrame frame, int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    public JoinTest() {
        super();
        getContentPane().add(pb1, BorderLayout.NORTH);
        getContentPane().add(pb2, BorderLayout.SOUTH);
        pb1.setStringPainted(true);
        pb2.setStringPainted(true);
        ta = new Thread(new Runnable() {
            int count = 0;
            public void run() {
                while(true) {
                    pb1.setValue(++count);
                    try {
                        Thread.sleep(100);
                        tb.join();
                    } catch (InterruptedException e) {
                        // TODO 自動生成された catch ブロック
                        e.printStackTrace();
                    }
                }
            }
        });
        ta.start();
        tb = new Thread(new Runnable() {
            int count = 0;
            public void run() {
                while(true) {
                    pb2.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO 自動生成された catch ブロック
                        e.printStackTrace();
                    }
                    if(count == 100) {
                        break;
                    }
                }
            }
        });
        tb.start();
    }
}
