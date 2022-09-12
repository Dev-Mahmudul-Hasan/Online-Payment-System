package cse_project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Admin implements ActionListener {

    JTextField t1, t2;
    JLabel a1, a2, a3, a4, a5, a6;
    JButton b1, b2, b3, b4;
    JFrame f = new JFrame("S K Y  C A S H");

    public Admin() throws IOException {

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\project hasanf.png");
        f.setIconImage(icon);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\User\\Downloads\\HOMEPAGE.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panel.add(picLabel);

        b1 = new JButton("ADMIN LOGIN");
        b1.setBounds(650, 60, 200, 60);
        b1.setOpaque(true);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Monospaced", Font.BOLD, 20));
        f.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("USER LOGIN");
        b2.setBounds(850, 60, 200, 60);
        b2.setOpaque(true);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Monospaced", Font.BOLD, 20));
        f.add(b2);
        b2.addActionListener(this);

        b3 = new JButton("SIGN UP");
        b3.setBounds(1030, 60, 200, 60);
        b3.setOpaque(true);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Monospaced", Font.BOLD, 20));
        f.add(b3);
        b3.addActionListener(this);

        b4 = new JButton("DEV:MAHMUDUL HASAN.");
        b4.setBounds(20, 640, 300, 60);
        b4.setOpaque(true);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Monospaced", Font.BOLD, 20));
        f.add(b4);
        b4.addActionListener(this);

        f.add(panel);
        f.setSize(1370, 760);
        f.setVisible(true);
        f.setResizable(false);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            f.dispose();
            try {
                new Admin_login();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (e.getSource() == b2) {
            f.dispose();
            try {
                new Login();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == b3) {
            f.dispose();
            new Registration();

        }

        if (e.getSource() == b4) {

            f.dispose();
            new Hasan();

        }

    }

}
