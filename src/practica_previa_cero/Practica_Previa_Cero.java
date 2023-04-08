/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_previa_cero;

import java.util.Scanner;

/**
 *
 * @author Willy MJ
 */
public class Practica_Previa_Cero {// Inico clase

    public static void main(String[] args) {// Inicion Main
        
        //Prueva de variables de color
        
        String verde = "\033[32m";
        String celeste = "\033[36m";
        String fgris = "\033[45m7";
        
        //Declaracion de variables globales
        int user = 0;
        int pasword = 0;
        
        // variable para opcion del menu
        byte opc =0;
        byte opc1 =0;
      
        // Declaracion de clase scanner
        Scanner tc = new Scanner(System.in);
        do{
        //Inicio de secion
        System.out.println(verde +"Bienvenido ");
        System.out.println(verde + "1) Inicio de sesion ");
        System.out.println(verde + "2) Salir ");
        System.out.println("_____________________________________________________");
        opc1 =tc.nextByte();

      
        
        do{
        if(opc1==1){
          //Validacion de usuario
        System.out.println(celeste + " Ingrese su usuario: ");
        user = tc.nextInt();
         
            if(user==54321){//Inicio if 1
            
            System.out.println("Usuario correcto");  
            System.out.println(" ");
            System.out.println(celeste + "Ingrese su contraseña: ");
              pasword = tc.nextInt();
              
            if(pasword == 12345){ //Inicio if 2
             
                System.out.println("Contraseña correcta ");
                System.out.println(" ");
                
                System.out.println("___________________________________________________");
                
                //Desglose del menu disponible
                 System.out.println("Seleccione una opcion del menu: ");
                 System.out.println("MENU:------------------");
                 System.out.println("1) Pollo azado \n 2) Carne a la plancha \n 3) Pezcado");
                 opc= tc.nextByte();
                 
                 //Switch para  la elecion de casos de menu
                 switch(opc){
                    
                    case 1:
                        System.out.println("Usted a seleccionado pollo azado, buen provecho...");
                        break;
                        
                    case 2:
                        System.out.println("Usted a seleccionado carne a la plancha, buen provecho...");
                        break;
                   
                    case 3:
                        System.out.println("Usted a seleccionado pezcado, buen provecho...");
                        break;
                        
                    default:
                        System.out.println("Seleccione una opcion valida ;/ ");
                        break;
                           
                    }//Fin switch
             
               
               }// fin if 2
                

                else{ //Inicio else 2
                        System.out.println("Constraseña incorrecta :( ");
                    } //fin elese 2
            
        }//Fin if 1
        else{ //Inicio else 1
            System.out.println("Usuario incorrecto :( "); 
             }// Fin else 1  
           
        }
        }while(opc!=2);
     }while(opc1!=2);     
    }//Fin main
   
}// Fin clase
