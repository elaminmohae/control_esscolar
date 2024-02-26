
package com.mycompany.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Querys {
    
    public static void updateQuery(Connection conn, String nombre, String apellido, String email){
        
        try{
            String insert = "INSERT INTO clientes (nombre, apellido, email) VALUES (?,?,?)";
            PreparedStatement st = conn.prepareStatement(insert);
            st.setString(1, nombre);
            st.setString(2, apellido);
            st.setString(3, email);
            System.out.println(st.toString());
             
            st.executeUpdate();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }        
    }
}
