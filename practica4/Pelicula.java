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
public class Pelicula {
    static Scanner lector=new Scanner(System.in);
    static int almacen=0;
    private int idPelicula;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int año;
    private boolean disponibilidad;
    private int numCopias;
    private int numCopiasReservadas;

    public Pelicula(int idPelicula, String titulo, String director, int duracion, String genero, int año, boolean disponibilidad, int numCopias, int numCopiasReservadas) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.año = año;
        this.disponibilidad = disponibilidad;
        this.numCopias = numCopias;
        this.numCopiasReservadas = numCopiasReservadas;
    }

    public Pelicula() {
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public int getNumCopiasReservadas() {
        return numCopiasReservadas;
    }

    public void setNumCopiasReservadas(int numCopiasReservadas) {
        this.numCopiasReservadas = numCopiasReservadas;
    }
    
    public void añadirPelicula(ArrayList<Pelicula> listaPeliculas, Pelicula peli){
        System.out.println("Introduzca el nombre de la película: ");
        this.setTitulo(lector.nextLine());
        System.out.println("Introduzca la cantidad de copias que desea introducir: ");
        int copias2=lector.nextInt();
        if (copias2>3000||almacen>3000) {
            System.out.println("Imposible almacenar. Limite alcanzado");
            lector.nextLine();
            return;
        } else {
            this.setNumCopias(copias2);
            almacen=almacen+copias2;
        }
        lector.nextLine();
        almacen=almacen+this.getNumCopias();
        System.out.println("Introduzca el director de la película: ");
        this.setDirector(lector.nextLine());
        System.out.println("Introduzca el genero: ");
        this.setGenero(lector.nextLine());
        System.out.println("Introduzca el año de estreno: ");
        this.setAño(lector.nextInt());
        lector.nextLine();
        System.out.println("Introdzca la duración: ");
        this.setDuracion(lector.nextInt());
        lector.nextLine();
        peli.setIdPelicula(idPelicula+1);
        this.setNumCopiasReservadas(numCopiasReservadas=0);
        this.setDisponibilidad(true);
        listaPeliculas.add(peli);
        System.out.println("");
    }   
    
    public void reservarPelicula(ArrayList<Pelicula> listaPeliculas){
        listarPeliculas(listaPeliculas);
        System.out.println("introduzca el ID del titulo que desea reservar: ");
        int ID=lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getIdPelicula()==ID) {
                if (listaPeliculas.get(i).isDisponibilidad()!=false) {
                    System.out.println("Quedan "+(listaPeliculas.get(i).getNumCopias()-listaPeliculas.get(i).getNumCopiasReservadas())+" disponibles");
                    System.out.println("Cuantas copias desea reservar de la pelicula '"+listaPeliculas.get(i).getTitulo()+"' ?");
                    int reserva=lector.nextInt();
                    lector.nextLine();
                    if (reserva<=(listaPeliculas.get(i).getNumCopias()-listaPeliculas.get(i).getNumCopiasReservadas())) {
                        listaPeliculas.get(i).setNumCopiasReservadas(numCopiasReservadas+reserva);
                        System.out.println("Reservada correctamente.");
                        if (listaPeliculas.get(i).getNumCopiasReservadas()==listaPeliculas.get(i).getNumCopias()) {
                            listaPeliculas.get(i).setDisponibilidad(false);
                        }
                    } else {
                        System.out.println("Cantidad no disponible.");
                    }
                } else {
                    System.out.println("El titulo seleccionado está agotado.");
                }
            }
        }
    }
    
    public void listarPeliculas(ArrayList<Pelicula> listaPeliculas){
        for (int i = 0; i < listaPeliculas.size(); i++) {
            listaPelicula(listaPeliculas.get(i));
        }
    }
    
    public void listaPelicula(Pelicula pelicula){
        System.out.println("ID: "+pelicula.getIdPelicula());
        System.out.println("Nombre pelicula: "+pelicula.getTitulo());
        System.out.println("Numero de copias: "+pelicula.getNumCopias());
        System.out.println("Director/a: "+pelicula.getDirector());
        System.out.println("Genero: "+pelicula.getGenero());
        System.out.println("Año estreno: "+pelicula.getAño());
        System.out.println("Duracion: "+pelicula.getDuracion());
        if (pelicula.isDisponibilidad()) {
            System.out.println("Disponible");
        } else {
            System.out.println("No disponible");
        }
        System.out.println("");
    }
    
    public void buscarPelicula(ArrayList<Pelicula> listaPeliculas){
        //contains
        boolean salirBusqueda=false;
        while(!salirBusqueda){
        System.out.println("");
        System.out.println("MENU BUSQUEDA");
        System.out.println("1 - por titulo");
        System.out.println("2 - por director");
        System.out.println("3 - por genero");
        System.out.println("4 - por año");
        System.out.println("5 - por duracion");
        System.out.println("6 - Volver");
        System.out.println("");
        System.out.println("¿Qué tipo de busqueda deseas realizar?");
        int opcion=lector.nextInt();
        lector.nextLine();
            switch(opcion){
                case 1:
                    buscarTitulo(listaPeliculas);
                    break;
                case 2:
                    break;
                case 6:
                    salirBusqueda=true;
                    break;
            }
        }
    }
    
    
    public void buscarTitulo(ArrayList<Pelicula> listaPeliculas){
        System.out.println("Introduzca el titulo de la pelicula que busca");
        String titulo1=lector.nextLine();
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getTitulo().contains(titulo1)) {
                listaPelicula(listaPeliculas.get(i));
            }
        }
    }
    
    public void buscarDirector(ArrayList<Pelicula> listaPeliculas){
        
    }
}
