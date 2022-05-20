/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;
import static vista.impresiones.encabezadoMenu;

/**
 *
 * @author Josue Amezcua
 */
public class MenuOPC{
    public static void MenuOpciones(){
        int selection;
        Scanner opc = new Scanner(System.in);
        selection=0;

        while(selection!=12){
            encabezadoMenu();
            selection=opc.nextInt();
            switch(selection){
                case 1:
                    System.out.println("Escogiste op 1");
                break;
            
                case 12:
                    System.err.println("\tSESION ACTUAL CERRADA EXITOSAMENTE");
                    selection=12;
                break;
                   
            }
        }
    }
    
    
}
