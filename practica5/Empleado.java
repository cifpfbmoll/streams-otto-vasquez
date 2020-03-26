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
public class Empleado {
    static Scanner lector=new Scanner(System.in);
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }
    
    public Empleado(Empleado e1) {
        this.nombre = e1.nombre;
        this.apellido1 = e1.apellido1;
        this.apellido2 = e1.apellido2;
        this.nif = e1.nif;
        this.edad = e1.edad;
        this.salario = e1.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        while (!Character.isUpperCase(nombre.charAt(0))){
            System.out.println("Inserta el nombre con la inicial en mayuscula: ");
            nombre=lector.nextLine();
        }
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        while(!Character.isUpperCase(apellido1.charAt(0))){
            System.out.println("Inserta el apellido con la inicial en mayuscula: ");
            apellido1=lector.nextLine();
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        while(!Character.isUpperCase(apellido2.charAt(0))){
            System.out.println("Inserta el apellido con la inicial en mayuscula: ");
            apellido2=lector.nextLine();
        }
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while(edad<=16){
            System.out.println("La edad debe de ser mayor o igual a 16");
            edad=(Integer.parseInt(lector.nextLine()));
        }
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    public void mostrarAtributos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Primer apellido: "+this.getApellido1());
        System.out.println("Segundo apellido: "+this.getApellido2());
        System.out.println("NIF: "+this.getNif());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Salario: "+this.getSalario());
    }
    
    public void pedirAlta(){
        System.out.println("Introduzca los siguientes datos.");
        System.out.println("Nombre: ");
        this.setNombre(lector.nextLine());
        System.out.println("Primer apellido: ");
        this.setApellido1(lector.nextLine());
        System.out.println("Segundo apellido: ");
        this.setApellido2(lector.nextLine());
        System.out.println("NIF: ");
        this.setNif(lector.nextLine());
        System.out.println("Edad: ");
        this.setEdad(Integer.parseInt(lector.nextLine()));
        System.out.println("Salario: ");
        this.setSalario(Integer.parseInt(lector.nextLine()));
    }
}
