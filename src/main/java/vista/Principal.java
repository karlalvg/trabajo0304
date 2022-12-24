/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author karlylvg
 */
public class Principal {

    public static void main(String[] args) {
        var ventanaUniversidad = new VentanaEmpresa();
        var ventanaCarrera = new VentanaDepartamento();
        var ventanaAsignatura = new VentanaEmpleado();
        ventanaUniversidad.setVisible(true);
        
        ventanaCarrera.setVisible(true);
        ventanaAsignatura.setVisible(true);

    }

}
