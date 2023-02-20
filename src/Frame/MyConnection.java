/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luz
 */
public class MyConnection {
    public static Connection getConnection(){
    
     Connection con = null;
    
     
     
     try {
     
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funeraria","root","1234");
     
     } catch (ClassNotFoundException | SQLException ex){
     
         System.out.println(ex.getMessage());
     
     }
      return con;
}

    Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
