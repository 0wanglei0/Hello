package NineteenChapter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercise2_1 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JTextField portField;
    private JTextField hostField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Exercise2_1 frame = new Exercise2_1();
                frame.setVisible(true);
            }
        });
    }

    public Exercise2_1() {
        super();
        setBounds(100, 100, 500, 212);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        getContentPane().add(panel, BorderLayout.NORTH);

        final JLabel label = new JLabel();
        label.setText("connect the host: ");
        panel.add(label);
        hostField = new JTextField();
        hostField.setText("localhost");
        panel.add(hostField);

        final JLabel label_1 = new JLabel();
        label_1.setText("port :");
        panel.add(label_1);

        portField = new JTextField();
        portField.setText("8001");
        panel.add(portField);

        final JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                final String hostName = hostField.getText();
                String portNum = portField.getText();
                final int port = Integer.parseInt(portNum);
                new Thread() {
                    public void run() {
                        try {
                            final InetAddress host = InetAddress.getByName(hostName);
                            Socket socket = new Socket(host, port);
                            final InputStream is = socket.getInputStream();
                            InputStreamReader reader = new InputStreamReader(is);
                            int data = 0;
                            while ((data = reader.read()) != -1) {
                                textArea.append((char)data + "");
                                textArea.revalidate();
                            }
                        } catch (IOException e) {
                            textArea.append(e.toString());
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });
        button.setText("connect");
        panel.add(button);
        final JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        scrollPane.setViewportView(textArea);
    }
}
