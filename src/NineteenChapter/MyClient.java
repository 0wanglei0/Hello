package NineteenChapter;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyClient extends JFrame {
    private static final long serialVersionUID = 1L;
    private PrintWriter writer;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;

    public MyClient(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc = this.getContentPane();

        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf, "South");
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                writer.println(tf.getText());
                ta.append(tf.getText() + '\n');
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });
    }

    private void connect() {
        ta.append("connection test \n");
        try {
            socket = new Socket("192.168.196.170", 5678);
            writer = new PrintWriter(socket.getOutputStream(), true);
            ta.append("connction completed\n");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClient mc = new MyClient("TO SERVER");
        mc.setSize(200, 200);
        mc.setVisible(true);
        mc.connect();
    }
}
