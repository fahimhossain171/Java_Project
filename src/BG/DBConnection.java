package BG;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
    private static final String url = "jdbc:mysql://localhost:3306/login_db";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection()
    {
        try
        {
                return DriverManager.getConnection(url,user,password);
        }catch (Exception e)
        {
                e.printStackTrace();
                return null;
        }
    }
}
