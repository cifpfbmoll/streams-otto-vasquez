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
public class Vehiculo {

    static Scanner lector = new Scanner(System.in);
    private static int contador;
    private int id;
    private String matricula;
    private String modelo;
    private int potencia;

    public Vehiculo() {
    }

    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Vehiculo(Vehiculo v1) {
        this.id = v1.id;
        this.matricula = v1.matricula;
        this.modelo = v1.modelo;
        this.potencia = v1.potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = contador;
        contador++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = matricula.substring(0).toUpperCase();
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void mostrarAtributos() {
        System.out.println("ID: " + this.getId());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Potencia: " + this.getPotencia());
    }

    public void darAlta() {
        this.setId(id++);
        System.out.println("Introduzca los siguientes datos: ");
        System.out.println("Matricula: ");
        this.setMatricula(lector.nextLine());
        System.out.println("Modelo: ");
        this.setModelo(lector.nextLine());
        System.out.println("Potencia: ");
        this.setPotencia(Integer.parseInt(lector.nextLine()));
    }

    
}
