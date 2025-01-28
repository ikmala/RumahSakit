package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect_sql {
    private static Connection con;
    public static Connection getConnection(){
        if ( con == null){
            try{
                String url = "jdbc:MySQL://localhost:3306/rumah_sakit";
                String user = "root";
                String pass ="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                con = (Connection) DriverManager.getConnection(url,user,pass);
            } catch (Exception e){
                Logger.getLogger(Connect_sql.class.getName()).log(Level.SEVERE, null, e);
            }
        }return con;
    }
}
