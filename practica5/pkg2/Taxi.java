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
public class Taxi extends Vehiculo{
    private int numeroLicencia;
    private boolean estado;
    private int usuariosLicencia;

    public Taxi() {
    }

    public Taxi(int numeroLicencia, boolean estado, int usuariosLicencia, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
        this.estado = estado;
        this.usuariosLicencia = usuariosLicencia;
    }

    public Taxi(Taxi t1) {
        super((Vehiculo)t1);
        this.numeroLicencia = numeroLicencia;
        this.estado = estado;
        this.usuariosLicencia = usuariosLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getUsuariosLicencia() {
        return usuariosLicencia;
    }

    public void setUsuariosLicencia(int usuariosLicencia) {
        this.usuariosLicencia = usuariosLicencia;
    }
   
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Número de licencia: "+this.getNumeroLicencia());
        if (this.isEstado()) {
            System.out.println("Libre");
        } else{
            System.out.println("Ocupado");
        }
        System.out.println("Usuarios de la licencia: "+this.getUsuariosLicencia());
    }
    
    @Override
    public void darAlta(){
        super.darAlta();
        System.out.println("Número de licencia: ");
        this.setNumeroLicencia(Integer.parseInt(lector.nextLine()));
        System.out.println("Usuarios de la licencia: ");
        this.setUsuariosLicencia(Integer.parseInt(lector.nextLine()));
        this.setEstado(true);
    }
}
