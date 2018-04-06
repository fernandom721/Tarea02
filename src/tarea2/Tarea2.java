/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Fernando Martínez
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("------Bienvenido a su Base de Datos------");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1) Agregar Producto");
        System.out.println("2) Eliminar Producto");
        System.out.println("3) Modificar Producto");
        System.out.println("4) Salir");
        System.out.print(":");
        int x=input.nextInt();
        
        while (x<4)
        {
            switch (x)
            {
                case 1:
                    System.out.println("ingrese el nombre del producto:");
                    String nombre=input.next();
                    System.out.println("Ingrese el nombre del proveedor:");
                    String proveedor=input.next();
                    System.out.println("Ingrese la cantidad del producto:");
                    int cant=input.nextInt();
                    Producto p1=new Producto(nombre, proveedor, cant);
                    break;
            }
        }
        
        
    }
    
}
