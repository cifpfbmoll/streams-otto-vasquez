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
public class Esfera implements Figuras {

    static Scanner lector = new Scanner(System.in);
    private float radio;

    public Esfera() {
    }

    public Esfera(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() throws NumberFormatException {
        float area;
        System.out.println("Introduzca el radio de la esfera en cm:");
        this.setRadio(Integer.parseInt(lector.nextLine()));
        area = (float) (4 * Math.PI * Math.pow(this.getRadio(), 2));
        return area;
    }

    @Override
    public float calcularVolumen() {
        float volumen;
        System.out.println("Introduzca el radio de la esfera en cm:");
        try {
            this.setRadio(Integer.parseInt(lector.nextLine()));
        } catch (Exception NumberFormatException) {
            calcularVolumen();
        }
        volumen = (float) ((4 / 3) * Math.PI * Math.pow(this.getRadio(), 3));
        return volumen;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Caracteristicas:");
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

}
