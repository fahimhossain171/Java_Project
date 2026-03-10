package BG;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Lable2 extends JLabel
{
    String checkuser;
    String checkpass;
    public Lable2()
    {
        setLayout(null);


        JLabel user= new JLabel();
        user.setText("User ID");
        user.setForeground(new Color(0xFFFFFF));
        user.setFont(new Font("Montserrat",Font.BOLD,17));
        user.setBounds(560,580,206,39);
        
        JLabel pass = new JLabel();
        pass.setText("Password");
        pass.setForeground(new Color(0xFFFFFF));
        pass.setFont(new Font("Montserrat",Font.BOLD,17));
        pass.setBounds(540,710,206,39);


        JTextField userfield = new JTextField();
        userfield.setBounds(637,566,727,70);
        userfield.setBackground(new Color(0,0,0,0));
        userfield.setForeground(Color.white);
        userfield.setOpaque(false);
        userfield.setFont(new Font("Montserrat",Font.BOLD,25));



        JTextField passfield = new JTextField();
        passfield.setBounds(637,694,727,70);
        passfield.setBackground(new Color(0,0,0,0));
        passfield.setForeground(Color.white);
        passfield.setOpaque(false);
        passfield.setFont(new Font("Montserrat",Font.BOLD,25));

        JButton login_button = new JButton("Login");
        login_button.setBounds(637,867,737,88);
        login_button.setFont(new Font("Montserrat", Font.BOLD, 18));
        login_button.setBackground(Color.white);
        login_button.setFocusable(false);
        login_button.addActionListener(e ->
        {
            checkuser=userfield.getText();
            checkpass=passfield.getText();
            try
            {
                Connection con= DBConnection.getConnection();
                String sql ="SELECT * FROM login_info WHERE username=? AND password=?";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1,checkuser);
                pst.setString(2,checkpass);

                ResultSet rs = pst.executeQuery();

                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
                con.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database Error");
            }
        });


        add(user);
        add(pass);
        add(userfield);
        add(passfield);
        add(login_button);//fahim
    }
}
