package com.mycompany.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect {
    
    String host = "jdbc:mysql://localhost/db_control_escolar";
    String username = "root";
    String password = "admin";
    Connection conn;
    
    public Connect(){
        conn = startConnection();
    }
    
    public Connection startConnection(){
        
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(host, username, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
    }
    
}
