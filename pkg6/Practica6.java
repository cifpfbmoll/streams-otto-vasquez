/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6;

import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("MENU");
            System.out.println("1 - Esfera");
            System.out.println("2 - Cubo");
            System.out.println("3 - Cono");
            System.out.println("4 - Salir");
            System.out.println("");
            System.out.println("Introduce una opcion");
            opcion = (Integer.parseInt(lector.nextLine()));

            switch (opcion) {
                case 1:
                    Esfera e1 = new Esfera();
                    try {
                        e1.imprimirCaracteristicas();
                    } catch (Exception NumberFormatException) {
                        System.out.println("Tipo de dato no valido");
                    }
                    break;
                case 2:
                    Cubo c1 = new Cubo();
                    try {
                        c1.imprimirCaracteristicas();

                    } catch (Exception NumberFormatException) {
                        System.out.println("Tipo de dato no valido");
                    }
                    break;
                case 3:
                    Cono co1 = new Cono();
                    try {
                        co1.imprimirCaracteristicas();

                    } catch (Exception NumberFormatException) {
                        System.out.println("Tipo de dato no valido");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }

}
