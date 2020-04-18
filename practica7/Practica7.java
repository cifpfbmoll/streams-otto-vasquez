/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Practica7 {

    static int contador = 0;
    static String[] encabezados = {"-----------------------\nCARTELERA CIFP FBMOLL\n-----------------------\n",
        "----", "\nAño: ", "\nDirector: ", "\nDuracion (en minutos): ",
        "\nSinopsis: ", "\nReparto: ", "\nSesión: ", "horas"};

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);

    public static void lecturaByte(String origen, String destino) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(origen);
            fout = new FileOutputStream(destino);
            fout.write(encabezados[0].getBytes()); //escribo el encabezado
            fout.write("\n".getBytes());
            fout.write(encabezados[1].getBytes());
            do {
                i = fin.read();
                System.out.print((char) i);
                if (i != -1) {
                    switch ((char) i) { //switch para el resto de encabezados
                        case '#':
                            switch (contador) {
                                case 0:
                                    fout.write(encabezados[1].getBytes());
                                    fout.write(encabezados[2].getBytes());
                                    break;
                                case 1:
                                    fout.write(encabezados[3].getBytes());
                                    break;
                                case 2:
                                    fout.write(encabezados[4].getBytes());
                                    break;
                                case 3:
                                    fout.write(encabezados[5].getBytes());
                                    break;
                                case 4:
                                    fout.write(encabezados[6].getBytes());
                                    break;
                                case 5:
                                    fout.write(encabezados[7].getBytes());
                                    break;
                            }
                            contador++;
                            break;
                        case '{':
                            fout.write("\n\n".getBytes());
                            fout.write(encabezados[1].getBytes());
                            contador = 0;
                            break;
                        default:
                            if ((int) i != -1) {
                                fout.write(i);
                            }
                            break;
                    }
                } else {
                    fout.write("\n\n-----------------------".getBytes());
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error al abrir el archivo de entrada");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo de salida");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1 - Lectura y escritura del fichero de cartelera byte a byte");
            System.out.println("2 - Lectura y escritura del fichero de cartelera caracter a caracter");
            System.out.println("3 - Lectura y escritura del fichero linea a linea con buffers");
            System.out.println("4 - Salir");
            System.out.println("");
            System.out.println("Introduzca una opcion:");
            opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la ruta del archivo de origen:");
                    String origen = lector.nextLine();
                    System.out.println("Introduzca la ruta del archivo de destino");
                    String destino = lector.nextLine();
                    lecturaByte(origen, destino);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    salir = true;
                    break;

            }
        }
    }

}
