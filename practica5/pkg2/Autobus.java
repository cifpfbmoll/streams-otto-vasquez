/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg2;


/**
 *
 * @author Otto
 */

public class Autobus extends Vehiculo{
    private int numeroPlazas;
    private int numeroParadas;

    public Autobus() {
    }

    public Autobus(int numeroPlazas, int numeroParadas, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
        this.numeroParadas = numeroParadas;
    }

    public Autobus(Autobus a1) {
        super((Vehiculo)a1);
        this.numeroPlazas = numeroPlazas;
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }
 
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Número de plazas: "+this.getNumeroPlazas());
        System.out.println("Número de paradas: "+this.getNumeroParadas());
    }
    
    @Override
    public void darAlta(){
        super.darAlta();
        System.out.println("Número de plazas: ");
        this.setNumeroPlazas(Integer.parseInt(lector.nextLine()));
        System.out.println("Numero de paradas");
        this.setNumeroParadas(Integer.parseInt(lector.nextLine()));
    }
}
