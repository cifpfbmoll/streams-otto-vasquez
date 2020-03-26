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
public class Cono implements Figuras {

    static Scanner lector = new Scanner(System.in);
    private float radio;
    private float altura;

    public Cono(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public Cono() {
    }

    public static Scanner getLector() {
        return lector;
    }

    public static void setLector(Scanner lector) {
        Cono.lector = lector;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() throws NumberFormatException {
        float area;
        float generatriz;
        System.out.println("Introduzca la altura del cono en cm:");
        this.setAltura(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduzca el radio de la base en cm:");
        this.setRadio(Integer.parseInt(lector.nextLine()));
        generatriz = (float) Math.sqrt(Math.pow(this.getAltura(), 2) + Math.pow(this.getRadio(), 2));
        area = (float) ((Math.PI * this.getRadio() * generatriz) + (Math.PI * Math.pow(this.getRadio(), 2)));
        return area;
    }

    @Override
    public float calcularVolumen() {
        float volumen;
        System.out.println("Introduzca la altura del cono en cm:");
        try {
            this.setAltura(Integer.parseInt(lector.nextLine()));

        } catch (Exception NumberFormatException) {
        }
        System.out.println("Introduzca el radio de la base en cm:");
        try {
            this.setRadio(Integer.parseInt(lector.nextLine()));

        } catch (Exception NumberFormatException) {
        }
        volumen = (float) (1 / 3 * Math.PI * Math.pow(this.getRadio(), 2)) * this.getAltura();
        return volumen;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Caracteristicas:");
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

}
