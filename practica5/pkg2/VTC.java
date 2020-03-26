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
public class VTC extends Vehiculo{
    private int maxHoras;
    private int radioAccion;
    private String ciudad;

    public VTC() {
    }

    public VTC(int maxHoras, int radioAccion, String ciudad, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.maxHoras = maxHoras;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }


    public VTC(VTC vtc1) {
        super((Vehiculo)vtc1);
        this.maxHoras = maxHoras;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }

    public int getMaxHoras() {
        return maxHoras;
    }

    public void setMaxHoras(int maxHoras) {
        this.maxHoras = maxHoras;
    }

    public int getRadioAccion() {
        return radioAccion;
    }

    public void setRadioAccion(int radioAccion) {
        this.radioAccion = radioAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Horas máximas: "+this.getMaxHoras());
        System.out.println("Radio de acción: "+this.getRadioAccion());
        System.out.println("Ciudad: "+this.getCiudad());
    }
    
    @Override
    public void darAlta(){
        super.darAlta();
        System.out.println("Horas máximas:");
        this.setMaxHoras(Integer.parseInt(lector.nextLine()));
        System.out.println("Radio de acción: ");
        this.setRadioAccion(Integer.parseInt(lector.nextLine()));
        System.out.println("Ciudad: ");
        this.setCiudad(lector.nextLine());
    }
}
