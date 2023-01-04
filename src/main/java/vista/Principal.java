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
        var ventanaEmpresa = new VentanaEmpresa();
        var ventanaDepartamento= new VentanaDepartamento();
        var ventanaEmpleado = new VentanaEmpleado();
        ventanaEmpresa.setVisible(true);
        
        ventanaDepartamento.setVisible(true);
        ventanaEmpleado.setVisible(true);

    }

}
