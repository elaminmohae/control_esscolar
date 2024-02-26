package com.mycompany.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect {
    
    String host = "jdbc:mysql://localhost/bd1";
    String username = "root";
    String password = "admin";
    Connection conn;
    
    public void startConnection(){
        
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(host, username, password);
            
            System.out.println("Connexion completa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
