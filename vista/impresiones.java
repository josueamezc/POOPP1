/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static modelo.MenuOPC.MenuOpciones;


/**
 *
 * @author Josue Amezcua
 */
public class impresiones{
    public static void Encabezado(){
        Scanner user = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Map<Integer, Integer> users = new HashMap<Integer, Integer>();
        users.put(317324899,21345213);
        users.put(123456,123456);
        String tab = "\t\t\t";
        int a=0;
        System.out.println(tab+tab+"version 2.2");
        System.out.println(tab+"PSC");
        System.out.println("\n\tBienvenido al Sistema de Servicios Escolares");
        System.out.println("\t\tFacultad de ingenieria");
        while(a==0){
            System.out.println("\n\t   Por favor ingresa tus credenciales");
            System.out.print("\n\tUsuario: ");
            int usuario = user.nextInt();
            if (users.containsKey(usuario)) {
                System.out.print("\n\tContrasenia: ");
                int contrasenia = password.nextInt();
                if (users.containsValue(contrasenia)) {
                    System.out.println("\n"+tab+"Accediendo");
                    a=1;
                    MenuOpciones();//cOMO PASA LA PRUEBA SE EJECUTA EL MENU
                }else{
                    System.err.println("ERROR, revisa tus credenciales");
                }
            }else{
                System.err.println("ERROR, revisa tus credenciales");
            }
        }
        
        
    }
    
    
    public static void numerocuenta(){
    }
    
    public static void encabezadoMenu(){
        System.out.println("\n\t\tServicios Escolares");
        System.out.println("\nSelecciona una opcion, por favor");
        System.out.println("\t1.-Opcion uno 2.-Opcion dos 12.-Cerrar sesion\n");
    }
}
