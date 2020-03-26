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
public class Cubo implements Figuras{
    static Scanner lector=new Scanner(System.in);
    private float lado;

    public Cubo() {
    }

    public Cubo(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() throws NumberFormatException{
        float area;
        System.out.println("Introduzca la longitud del lado en cm:"); 
        this.setLado(Integer.parseInt(lector.nextLine()));
        area=(6*this.getLado());
        return area;
    }

    @Override
    public float calcularVolumen() {
        float volumen;
        System.out.println("Introduzca el valor del lado en cm:");
        try {
                    this.setLado(Integer.parseInt(lector.nextLine()));

        } catch (Exception NumberFormatException) {
            calcularVolumen();
        }
        volumen=(float) Math.pow(this.getLado(), 3);
        return volumen;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Caracteristicas:");
        System.out.println("Area: "+calcularArea());
        System.out.println("Volumen: "+calcularVolumen());
    }
    
    
}
