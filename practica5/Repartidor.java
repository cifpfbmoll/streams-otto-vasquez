/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author Otto
 */
public final class Repartidor extends Empleado{
    static Scanner lector=new Scanner(System.in);
    private int horas_trabajadas;
    private String zona;

    public Repartidor(int horas_trabajadas, String zona) {
        this.horas_trabajadas = horas_trabajadas;
        this.zona = zona;
    }
    
    public Repartidor(Repartidor r1) {
        this.horas_trabajadas = r1.horas_trabajadas;
        this.zona = r1.zona;
    }

    public Repartidor() {
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Horas trabajadas: "+this.getHoras_trabajadas());
        System.out.println("Zona: "+this.getZona());
    }
    
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        System.out.println("Horas trabajadas: ");
        this.setHoras_trabajadas(Integer.parseInt(lector.nextLine()));
        System.out.println("Zona: ");
        this.setZona(lector.nextLine());
    }
    
}
