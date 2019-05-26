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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int cc = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar cedula",JOptionPane.QUESTION_MESSAGE));
     String nombre = JOptionPane.showInputDialog(null,"Ingresar nombre",JOptionPane.QUESTION_MESSAGE);
     int telefono = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar teléfono",JOptionPane.QUESTION_MESSAGE));
     String email = JOptionPane.showInputDialog(null,"Ingresar e-mail",JOptionPane.QUESTION_MESSAGE);
     String carrera = JOptionPane.showInputDialog(null,"Ingresar carrera",JOptionPane.QUESTION_MESSAGE);
     int semestre = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Semestre",JOptionPane.QUESTION_MESSAGE));
     String facultad = JOptionPane.showInputDialog(null,"Ingresar facultad",2);
     double notaUno = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar nota 1",JOptionPane.QUESTION_MESSAGE));
     double notaDos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar nota 2",JOptionPane.QUESTION_MESSAGE));
     double notaTres = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar nota 3",JOptionPane.QUESTION_MESSAGE));
     double notaCuatro = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar nota 4",JOptionPane.QUESTION_MESSAGE));
     double notaCinco = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar nota 5",JOptionPane.QUESTION_MESSAGE));

    Estudiante estudiante = new Estudiante(carrera, semestre, facultad, notaUno, notaDos, notaTres, notaCuatro, notaCinco, cc, nombre, telefono, email);
    
    estudiante.mostrarDatosEstudiante();
    estudiante.MostrarNotas();
}

}
