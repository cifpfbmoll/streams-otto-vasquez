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
public class Comercial extends Empleado{
    static Scanner lector=new Scanner(System.in);
    private int ventas_realizadas;
    private int comision;

    public Comercial(int ventas_realizadas, int comision) {
        this.ventas_realizadas = ventas_realizadas;
        this.comision = comision;
    }

    public Comercial(Comercial c1) {
        this.ventas_realizadas = c1.ventas_realizadas;
        this.comision = c1.comision;
    }
     
    public Comercial() {
    }

    public int getVentas_realizadas() {
        return ventas_realizadas;
    }

    public void setVentas_realizadas(int ventas_realizadas) {
        this.ventas_realizadas = ventas_realizadas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Ventas realizadas: "+this.getVentas_realizadas());
        System.out.println("Comisión: "+this.getComision());
    }
            
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        System.out.println("Ventas realizadas: ");
        this.setVentas_realizadas(Integer.parseInt(lector.nextLine()));
        System.out.println("Comisión: ");
        this.setComision(Integer.parseInt(lector.nextLine()));
    }
}
