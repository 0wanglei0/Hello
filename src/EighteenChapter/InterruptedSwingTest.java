package EighteenChapter;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class InterruptedSwingTest extends JFrame {
    Thread t;
    public static void main(String[] args) {
        init(new InterruptedSwingTest(), 100, 100);
    }
    public InterruptedSwingTest() {
        super();
        final JProgressBar pb = new JProgressBar();
        getContentPane().add(pb, BorderLayout.SOUTH);
        pb.setStringPainted(true);
        t = new Thread(new Runnable() {
            int count = 0;
            public void run() {
                while(true) {
                    pb.setValue(++count);
                    try {
                        t.sleep(50000);
                    } catch (InterruptedException e) {
                        System.out.println("This Thread is interrupted");
                        break;
                    }
                }
            }
        });
        t.start();
        t.interrupt();
    }
    public static void init(JFrame frame, int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
