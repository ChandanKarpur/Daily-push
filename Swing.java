import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Swing extends JFrame {
    public Swing() {
        //JFrame obj =new JFrame();
        setBounds(100, 100, 400, 300);
        setVisible(true);

        JButton btn = new JButton("Go to Web");
        //n.setText("Login");
        btn.setBounds(150, 120, 100, 30);
        btn.setBackground(Color.yellow);
        add(btn);
        JButton btn1 = new JButton("Click Me");
        btn1.setBounds(150, 160, 100, 30);
        btn1.setBackground(Color.cyan);
        add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the system's desktop instance
                    Desktop desktop = Desktop.getDesktop();

                    // Create the URI for the target web page
                    URI oURL = new URI("https://google.com");

                    // Open the link in the default browser
                    desktop.browse(oURL);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        new Swing();
        System.out.println("Hello World");
    }
}
