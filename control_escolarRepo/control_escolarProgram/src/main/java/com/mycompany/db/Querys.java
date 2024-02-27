package com.mycompany.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mycompany.db.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Querys{
    
    Connect connect = new Connect();
    Connection con = connect.conn;
    
    public void añadirCarrera(String nombre){
        try {
            String query = "INSERT INTO carreras (nombre) VALUES (?)";
            PreparedStatement st =  con.prepareStatement(query);
            st.setString(1, nombre);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarCarrera(String nombre, String nuevoNombre){
        try {
            String query = "UPDATE carreras SET nombre = ? WHERE nombre = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nuevoNombre);
            st.setString(2, nombre);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void mostrarCarreras(){
        try {
            String query = "SELECT * FROM carreras";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet resultSet;
            resultSet = st.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Nombre: " + resultSet.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mostrarCarrera(String nombre){
        try {
            String query = "SELECT * FROM carreras WHERE nombre = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nombre);
            ResultSet resultSet;
            resultSet = st.executeQuery();
            
            while(resultSet.next()){
                System.out.println("Nombre: " +  resultSet.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCarrera(String nombre){
        try {
            String query = "DELETE FROM carreras WHERE nombre = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, nombre);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
