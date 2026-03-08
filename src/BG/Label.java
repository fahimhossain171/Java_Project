package BG;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel 
{
    public Label()
    {
        JLabel letter = new JLabel();
        letter.setText("Medicine Inventory");
        letter.setForeground(Color.white);
        letter.setFont(new Font("Arial",Font.BOLD,50));
        letter.setBounds(659,41,601,99);


        ImageIcon shop =new ImageIcon("shop.png");
        JLabel shop_logo= new JLabel();
        shop_logo.setIcon(shop);
        shop_logo.setBounds(750,234,293,192);


        add(letter);
        add(shop_logo);
    }

}
