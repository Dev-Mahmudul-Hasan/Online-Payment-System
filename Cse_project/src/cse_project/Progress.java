
package cse_project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;


public class Progress {
    JFrame f = new JFrame("S K Y  C A S H");
    JLabel a2;
    JProgressBar jb,jb1,jb2;
    int i = 0,k=0,j=0, num = 0;
    Progress() throws IOException {
         
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\project hasanf.png");
        f.setIconImage(icon);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\User\\Downloads\\wellcome page.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panel.add(picLabel);
       /* a2 = new JLabel("GREEN UNIVERSITY OF BANGLADESH");
        a2.setBounds(270, 200, 900, 50);
        a2.setForeground(Color.WHITE);
        a2.setFont(new Font("Monospaced", Font.BOLD,45));
        f.add(a2);*/
        
        jb = new JProgressBar(0, 2000);
        jb.setBounds(100, 500, 550, 30);
        jb.setForeground(Color.GREEN);
        jb.setBackground(Color.white);
        jb.setStringPainted(true);
        f.add(jb);
        
        jb1 = new JProgressBar(0, 2000);
        jb1.setBounds(100, 550, 550, 30);
        jb1.setForeground(Color.red);
        jb1.setBackground(Color.white);
        jb1.setStringPainted(true);
        f.add(jb1);
        
        jb2 = new JProgressBar(0, 2000);
        jb2.setBounds(100, 600, 550, 30);
        jb2.setForeground(Color.blue);
        jb2.setBackground(Color.white);
        jb2.setStringPainted(true);
        f.add(jb2);
       
        
        f.add(panel);
        f.setSize(1380, 770);
        f.setVisible(true);
        f.setResizable(false);
        
        while (i  <= 2000 || k  <= 2000|| j  <= 2000) {
            jb.setValue(i);
            jb1.setValue(k);
            jb2.setValue(j);
            i += 18;
            k += 10;
            j += 15;
            try {
                Thread.sleep(60);
            } catch (Exception e) {
            }
            if(i==2000 ||j==2000||k==2000)
            {
              f.dispose();
              new Admin(); 
            }
        }
        
         
    }
    
    
}
