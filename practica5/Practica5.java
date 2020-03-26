/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        int opcion;
        boolean salir=false;
        ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
        
        while (!salir){
            System.out.println("");
            System.out.println("MENÚ");
            System.out.println("1 - Pedir alta empleado");
            System.out.println("2 - Pedir alta comercial");
            System.out.println("3 - Pedir alta repartidor");
            System.out.println("4 - Mostrar atributos");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.println("Introduzca una opcion: ");
            opcion=(Integer.parseInt(lector.nextLine()));
            
            switch (opcion) {
                case 1:
                    Empleado e1=new Empleado();
                    e1.pedirAlta();
                    listaEmpleados.add(e1);
                    break;
                case 2:
                    Comercial c1=new Comercial();
                    c1.pedirAlta();
                    listaEmpleados.add(c1);
                    break;
                case 3:
                    Repartidor r1=new Repartidor();
                    r1.pedirAlta();
                    listaEmpleados.add(r1);
                    break;
                case 4:
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        System.out.println(i+" - "+listaEmpleados.get(i).getNombre()+" "+listaEmpleados.get(i).getApellido1());                        
                    }
                    System.out.println("Seleccione un trabajador: ");
                    int trabajador=(Integer.parseInt(lector.nextLine()));
                    listaEmpleados.get(trabajador).mostrarAtributos();
                    break;
                case 5:
                    salir=true;
                    break;
            }
        }
    }
    
}
