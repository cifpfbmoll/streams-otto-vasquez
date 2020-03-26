/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Practica52 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector=new Scanner(System.in);
    
    public static void taxiLibre(ArrayList listaVehiculos) {
        int i = 0;
        boolean disp = false;
        
        while (i < listaVehiculos.size() && disp == false) {
            if (listaVehiculos.get(i) instanceof Taxi && ((Taxi) listaVehiculos.get(i)).isEstado() == true) {
                System.out.println("ID: "+((Taxi)listaVehiculos.get(i)).getId()+ " Matricula: "+((Taxi)listaVehiculos.get(i)).getMatricula());
                disp = true;
                ((Taxi) listaVehiculos.get(i)).setEstado(false);
                System.out.println("Se ha cambiado el estado a: ocupado");
            }
            i++;
        }
    }
    
    public static void buscarTaxi(ArrayList listaVehiculos){
        System.out.println("Introduce un ID");
        int id=(Integer.parseInt(lector.nextLine()));
        int i=0;
        boolean estado=false;
        
        while (i < listaVehiculos.size() && estado == false) {
            if (listaVehiculos.get(i) instanceof Taxi && ((Taxi) listaVehiculos.get(i)).getId()==id) {
                System.out.println("ID: "+((Taxi)listaVehiculos.get(i)).getId()+ " Matricula: "+((Taxi)listaVehiculos.get(i)).getMatricula());
                estado = true;
                ((Taxi) listaVehiculos.get(i)).setEstado(true);
                System.out.println("Se ha cambiado el estado a: libre");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        boolean salir=false;
        ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();
        
        while(!salir){
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1 - Alta taxi");
            System.out.println("2 - Alta VTC");
            System.out.println("3 - Alta Autobuses");
            System.out.println("4 - Busqueda pr ID");
            System.out.println("5 - Busqueda por matricula");
            System.out.println("6 - Buscar primer taxi libre");
            System.out.println("7 - Buscar taxi concreto por ID");
            System.out.println("8 - Mostrar todos los vehiculos");
            System.out.println("9 - Salir");
            System.out.println("");
            System.out.println("Elija una opcion: ");
            opcion=(Integer.parseInt(lector.nextLine()));
            
            switch(opcion){
                case 1:
                    Taxi t1=new Taxi();
                    t1.darAlta();
                    listaVehiculos.add(t1);
                    break;
                case 2:
                    Autobus a1=new Autobus();
                    a1.darAlta();
                    listaVehiculos.add(a1);
                    break;
                case 3:
                    VTC vtc1=new VTC();
                    vtc1.darAlta();
                    listaVehiculos.add(vtc1);
                    break;
                case 4:
                    System.out.println("Introduzca una ID");
                    int id=(Integer.parseInt(lector.nextLine()));
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        if (listaVehiculos.get(i)==listaVehiculos.get(id)) {
                            listaVehiculos.get(i).mostrarAtributos();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Introduzca una ID");
                    int matricula=(Integer.parseInt(lector.nextLine()));
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        if (listaVehiculos.get(i)==listaVehiculos.get(matricula)) {
                            listaVehiculos.get(i).mostrarAtributos();
                        }
                    }
                    break;
                case 6:
                    taxiLibre(listaVehiculos);
                    break;
                case 7:
                    buscarTaxi(listaVehiculos);
                    break;
                case 8:
                    for (int i = 0; i < listaVehiculos.size(); i++) {
                        System.out.println(listaVehiculos.get(i).getId()+" "+listaVehiculos.get(i).getMatricula()+" "+listaVehiculos.get(i).getModelo());
                    }
                    break;
                case 9:
                    salir=true;
                    break;
            }
        }
    }
    
}
