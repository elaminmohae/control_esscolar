package com.mycompany.main;

import com.mycompany.db.Connect;
import java.util.Scanner;



public class Control_escolarProgram {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opciones = 0;
        Connect connect = new Connect();
        connect.startConnection();
        
        GestorCarreras gestorCarreras = new GestorCarreras();
        gestorCarreras.menuCarreras();
        opciones = scan.nextInt();
        gestorCarreras.eleccionesMenu(opciones);
              
    }
    
    public void menuPrincipal(){
        System.out.println("1.- Carreras");
        System.out.println("2.- Carreras");
        System.out.println("3.- Carreras");
        System.out.println("4.- Carreras");
        System.out.println("5.- Carreras");
        System.out.println("6.- Carreras");
    }
}
