/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_previa_cero;

import java.util.Scanner;

/**
 *
 * @author Willy MJ
 */
public class Bucles_Repaso { //Inicio clase
    
    public static void main(String[] args) { // Inicio main
        
        /*
        BUCLES---------
        *WHILE
        *DO-WHILE
        *FOR
        *FOR-EACH
            */
      
        // 1) While sintaxis
        /*
        while(condicion){
            sentencia de codigo
        }
        1) se necesita inicializar el contador
        2) condicion
        3) actualizacion del contador
        */
        //ejemplo
        /*
        System.out.println("\n");
       int contador  = 0;
       while (contador<10){
           System.out.println("*");
           contador++;
        
          }// fin while
        */
        
        /*
        DO-WHILE
         do{
        
        }while(condicion);
        */
        //ejemplo
        
        /*
        Scanner tc = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Salir");
            opc = tc.nextInt();
        }while(opc !=2);
           */
       
       int contador  = 2;
       while (contador<32){
           System.out.println(contador+ "contador");
           contador= contador +2;
        
          }
    
       
        
        
    } //Fin main
    
} //Fin clase
