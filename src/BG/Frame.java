package BG;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame
{
    public Frame()
    {

//        JLabel label = new JLabel();
//        lable.setText("User: ");
//        lable.setForeground(new Color(0xFFFFFF));
//        lable.setFont(new Font("Montserrat",Font.BOLD,14));
//        lable.setBounds(748,597,206,39);


        this.setSize(1920,1080);
        this.setTitle("Medicine Inventory ");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        ImageIcon Logo = new ImageIcon("Logo.png");
        this.setIconImage(Logo.getImage());
        this.getContentPane().setBackground(new Color(0x08081E));
        this.setVisible(true);
        //this.pack();



    }
}
