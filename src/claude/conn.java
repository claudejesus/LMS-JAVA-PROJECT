/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claude;
import java.io.PrintStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
/**
 *
 * @author CLAUDE
 */   
public class conn {
    static conn connectdb() throws ClassNotFoundException{
     conn con =null; 
        try {
         java.lang.Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection conn;
         conn = DriverManager.getConnection("jdbc:derby://localhost:1527/JESUS","JESUS","JESUS");
         PrintStream printf;
         printf = System.out.printf("ooops! Connected to database!");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    static PreparedStatement prepareStatement(String LOGIN) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
}       
