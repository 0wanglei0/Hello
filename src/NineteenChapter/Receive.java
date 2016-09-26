package NineteenChapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Receive extends JFrame implements Runnable, ActionListener {

    private static final long serialVersionUID = 1L;
    int port;
    InetAddress group = null;
    MulticastSocket  socket = null;
    JButton ince = new JButton("receive");
    JButton stopButton = new JButton("stop");
    JTextArea inceAr = new JTextArea(10, 10);
    JTextArea inced = new JTextArea(10, 10);
    Thread thread;
    boolean b = false;

    public Receive() {
        super("data");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);
        ince.addActionListener(this);
        stopButton.addActionListener(this);
        inceAr.setForeground(Color.BLUE);
        JPanel north = new JPanel();
        north.add(ince);
        north.add(stopButton);
        add(north, BorderLayout.NORTH);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(1, 2));
        center.add(inceAr);

        final JScrollPane scrollPane = new JScrollPane();
        center.add(scrollPane);
        scrollPane.setViewportView(inced);
        add(center, BorderLayout.CENTER);
        validate();
        port = 1992;
        try {
            group = InetAddress.getByName("192.168.196.170");
            socket = new MulticastSocket(port);
            socket.joinGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(100, 50, 360, 380);
        setVisible(true);
    }

    public void run() {
        while (true) {
            byte data[] = new byte[1024];
            DatagramPacket packet = null;
            packet = new DatagramPacket(data, data.length, group, port);
            try {
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                inceAr.setText("Receiving ... \n" + message);
                inced.append(message + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (b == true) {
                break;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ince) {
            ince.setBackground(Color.red);
            stopButton.setBackground(Color.yellow);
            if (!(thread.isAlive())) {
                thread = new Thread(this);
            }
            thread.start();
            b = false;
        }
        if (e.getSource() == stopButton) {
            ince.setBackground(Color.yellow);
            stopButton.setBackground(Color.red);
            b = true;
        }
    }
    public static void main(String[] args) {
        Receive rec = new Receive();
        rec.setSize(460, 200);
    }

}
