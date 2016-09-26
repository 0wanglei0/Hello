package NineteenChapter;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TCPClient extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextArea taContent = new TextArea();
	JTextField tfTxt = new JTextField(20);
	
	JButton send = new JButton("����");
	JButton connect = new JButton("����");
	JButton clear = new JButton("���");
	
	boolean live = false;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	Socket s = null;
	DataOutputStream dos = null;
	DataInputStream dis = null;
	
	boolean bConnected = false;
	
	Thread t = new Thread(new RecToServer());
	
	public void launchFrame() {
		
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
	
	public void connectToServer() {
		try {
			
			s = new Socket("127.0.0.1", 8888);
			dos = new DataOutputStream(s.getOutputStream());
			dis = new DataInputStream(s.getInputStream());
			
			bConnected = true;
			
		} catch (BindException e) {
			System.out.println("�Ҳ���ָ���ķ�����");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void disConnect() {
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		TCPClient tc = new TCPClient();
		tc.launchFrame();
	}
	
	private class Connect implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "����") {
				
				connectToServer();
				try {
					t.start();
				} catch (IllegalThreadStateException ex) {
					
				}
				
				connect.setText("�Ͽ�����");
				
			} else if (e.getActionCommand() == "�Ͽ�����") {
				disConnect();
				connect.setText("����");
			}
			
		}
	}
	
	private class SendMsg implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (connect.getActionCommand() == "����") {
				JOptionPane.showMessageDialog(TCPClient.this,
						"û���ҵ�ָ���ķ�����", "������ʾ", 1);
			} else {
				String str = tfTxt.getText();
				tfTxt.setText("");
				
				try {
					dos.writeUTF(str);
					dos.flush();
				} catch (SocketException ex) {
					System.out.println("û���ҵ�ָ���ķ�����");
					JOptionPane.showMessageDialog(TCPClient.this,
							"û���ҵ�ָ���ķ�����", "������ʾ", 1);
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
		}
	}
	
	private class RecToServer implements Runnable {
		public void run() {
			try {
				while (bConnected) {
					String str = dis.readUTF();
					// System.out.println(str);
					
					taContent.append(str + "\n");
				}
			} catch (SocketException e) {
				System.out.println("�������ѹر�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}