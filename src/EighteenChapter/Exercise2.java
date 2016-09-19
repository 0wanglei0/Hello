package EighteenChapter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise2 extends JFrame {

    private static final long serialVersionUID = 1L;
    JPanel jPanel1 = new JPanel();
    JButton startButton = new JButton();
    JButton stopButton = new JButton();
    MyThread thread = null;
    private boolean isContinue = false;

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
        e2.setBounds(300, 300, 300, 80);
        e2.setVisible(true);
    }

    public Exercise2() {
        try {
            init();
        } catch (Exception e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }

    public void init() throws Exception{
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startButton.setText("start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startButton_actionPerformed(e);
            }
        });
        stopButton.setText("stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopButton_actionPerformed(e);
            }
        });
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);
        jPanel1.add(startButton);
        startButton.setBounds(36, 105, 82, 30);
        jPanel1.add(stopButton);
        stopButton.setBounds(160, 108, 100, 31);
    }

    private void startButton_actionPerformed(ActionEvent e) {
        if (thread != null) {
            isContinue = false;
        }
        thread = new MyThread();
        thread.start();
    }

    private void stopButton_actionPerformed(ActionEvent e) {
        if (thread != null) {
            isContinue = false;
        }
        thread = null;
    }

    private final class MyThread extends Thread {
        public MyThread() {
            isContinue = true;
        }

        public void run() {
            System.out.println("\n\n");
            while (true && isContinue) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("llllllll");
            }
        }
    }
}
