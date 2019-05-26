/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author juan.pulgarin
 */
public class Persona {

    private int cc;
    private String nombre;
    private int telefono;
    private String email;

    public Persona(int cc, String nombre, int telefono, String email) {
        this.cc = cc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
