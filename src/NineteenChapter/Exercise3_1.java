package NineteenChapter;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise3_1 extends JFrame {

    private static final long serialVersionUID = 1L;
    TextArea taContent = new TextArea();
    JTextField tfTxt = new JTextField(20);
    JButton send = new JButton("send");
    JButton connect = new JButton("connect");
    JButton clear = new JButton("clear");
    boolean live = false;
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    Socket s = null;
    DataOutputStream dos = null;
    DataInputStream dis = null;
    boolean isConnected = false;
    Thread t = new Thread(new RecToServer());

    private void launchFrame() {
        taContent.setEditable(false);
        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        p2.add(send);
        p2.add(connect);
        p2.add(clear);
        Container con = this.getContentPane();
        con.add(taContent, "North");
        con.add(tfTxt, "Center");
        con.add(p2, "South");
        this.setSize(300, 350);
        this.setLocation(400, 200);
        this.setTitle("Chat Client");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        connect.addActionListener(new Connect());
        send.addActionListener(new SendMsg());
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                taContent.setText("");
            }
        });
    }

    private void connectToServer() {
        try {
            s = new Socket("192.168.196.170", 8888);
            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());
            isConnected = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void disConnect() {
        try {
            if (s != null) {
                s.close();
            }
            if (dos != null) {
                dos.close();
            }
            if (dis != null) {
                dis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exercise3_1 tc = new Exercise3_1();
        tc.launchFrame();
    }

    private class Connect implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand() == "connect") {
                connectToServer();
                t.start();
                connect.setText("disable");
            } else if (e.getActionCommand() == "disable") {
                disConnect();
                connect.setText("connect");
            }
        }
    }

    private class SendMsg implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (connect.getActionCommand() == "connect") {
                JOptionPane.showMessageDialog(Exercise3_1.this, "no server", "error", 1);
            } else {
                String str = tfTxt.getText();
                tfTxt.setText("");
                try {
                    dos.writeUTF(str);
                    dos.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    private class RecToServer implements Runnable {
        public void run() {
            try {
                while (isConnected) {
                    String str;
                    str = dis.readUTF();
                    taContent.append(str + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
