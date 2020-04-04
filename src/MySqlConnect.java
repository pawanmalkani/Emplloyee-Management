
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class MySqlConnect {
    
    public static Connection connectDB(){
        try {
              // getConnection("jdbc:mysql://servername:portnumber/database name");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","tarun","tarun123");
            JOptionPane.showMessageDialog(null,"Connection successful:" + conn,"COnnection",JOptionPane.INFORMATION_MESSAGE);
            return conn;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Connection unsuccessful" + e.getMessage(),"COnnection",JOptionPane.ERROR_MESSAGE);
            
            return null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Connection unsuccessful","COnnection",JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    } 
}
