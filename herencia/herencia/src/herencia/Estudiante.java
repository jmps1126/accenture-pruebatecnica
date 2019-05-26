/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author juan.pulgarin
 */
public class Estudiante extends Persona {

    private String carrera;
    private int semestre;
    private String facultad;
    private double notaUno;
    private double notaDos;
    private double notaTres;
    private double notaCuatro;
    private double notaCinco;
    private double notaDefinitiva;

    public Estudiante(String carrera, int semestre, String facultad, double notaUno, double notaDos, double notaTres, double notaCuatro, double notaCinco, int cc, String nombre, int telefono, String email) {
        super(cc, nombre, telefono, email);
        this.carrera = carrera;
        this.semestre = semestre;
        this.facultad = facultad;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
        this.notaCuatro = notaCuatro;
        this.notaCinco = notaCinco;
    }

    public double getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(double notaUno) {
        this.notaUno = notaUno;
    }

    public double getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(double notaDos) {
        this.notaDos = notaDos;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double getNotaCuatro() {
        return notaCuatro;
    }

    public void setNotaCuatro(double notaCuatro) {
        this.notaCuatro = notaCuatro;
    }

    public double getNotaCinco() {
        return notaCinco;
    }

    public void setNotaCinco(double notaCinco) {
        this.notaCinco = notaCinco;
    }

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    public void setNotaDefinitiva(double notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void mostrarDatosEstudiante() {
        JOptionPane.showMessageDialog(null, "Cedula:" + getCc() + "\nNombre: " + getNombre()
                + "\nTelefono: " + getTelefono() + "\nE-mail: " + getEmail() + "\n"
                + "\nFacultad:" + this.facultad + "\nCarrera:" + this.carrera
                + "\nSemestre: " + this.semestre, "Datos del estudiante", JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void MostrarNotas() {

        this.notaDefinitiva = (this.notaUno + this.notaDos + this.notaTres + this.notaCuatro + this.notaCinco)/5;

       JOptionPane.showMessageDialog(null,  "\nNota 1:" + this.notaUno
                + "\nNota 2:" + this.notaDos
                + "\nNota 3:" + this.notaTres
                + "\nNota 4:" + this.notaCuatro
                + "\nNota 5:" + this.notaCinco
                + "\nNota Definitiva: " + this.notaDefinitiva,
                 "Notas del estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

}
