package Fifth;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileReaderTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextArea jTextArea = null;
    private JPanel controlPanel = null;
    private JButton openButton = null;
    private JButton closeButton = null;
    private JScrollPane scrollPane = null;

    private JTextArea getJTextArea() {
        if(jTextArea == null) {
            jTextArea = new JTextArea();
        }
        return jTextArea;
    }

    private JPanel getControlPanel() {
        if(controlPanel == null) {
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setVgap(1);
            controlPanel = new JPanel();
            controlPanel.setLayout(flowLayout);
            controlPanel.add(getOpenButton(), null);
            controlPanel.add(getCloseButton(), null);
        }
        return controlPanel;
    }

    private JButton getOpenButton() {
        if(openButton == null) {
            openButton = new JButton();
            openButton.setText("write into file");
            openButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    FileWriter out;
                    try {
                        out = new FileWriter(file);
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    private JButton getCloseButton() {
        if(closeButton == null) {
            closeButton = new JButton();
            closeButton.setText("read file");
            closeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    try {
                        FileReader in  = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = in.read(byt);
                        jTextArea.setText(new String(byt, 0, len));
                        in.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    public FileReaderTest() {
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    private JPanel getJContentPane() {
        if(jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getScrollPane(), BorderLayout.CENTER);
            jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    protected JScrollPane getScrollPane() {
        if(scrollPane == null) {
            scrollPane = new JScrollPane();
            scrollPane.setViewportView(getJTextArea());
        }
        return scrollPane;
    }
    public static void main(String[] args) throws IOException {
        FileReaderTest frt = new FileReaderTest();
        frt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frt.setVisible(true);
    }
}
