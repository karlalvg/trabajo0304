/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Empleado;

/**
 *@author karlylvg
 */
public interface EmpleadoService {

    public void crear(Empleado empleado);

    public void modificar(Empleado empleado, int codigo);

    public void eliminar(int codigo);

    public List<Empleado> listar();
}
