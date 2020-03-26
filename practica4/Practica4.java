    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector=new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir=false;
        int opcion;
        Pelicula peli=new Pelicula();
        ArrayList<Pelicula> listaPeliculas=new ArrayList<Pelicula>();
        
        while (!salir){
            System.out.println("MENU");
            System.out.println("1 - Añadir pelicula");
            System.out.println("2 - Reservar pelicula");
            System.out.println("3 - Buscar pelicula");
            System.out.println("4 - Salir");
            System.out.println("");
            System.out.println("Elija una opcion: ");
            opcion=lector.nextInt();
            lector.nextLine();

            switch (opcion){
                case 1:
                    
                    peli.añadirPelicula(listaPeliculas, peli);
                    break;
                case 2:
                    peli.reservarPelicula(listaPeliculas);
                    break;
                case 3:
                    peli.buscarPelicula(listaPeliculas);
                    
                    break;
                case 4:
                    salir=true;
            }

        }
    }
    
}
