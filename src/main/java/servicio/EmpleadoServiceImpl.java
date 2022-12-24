/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author karlylvg
 */
public class EmpleadoServiceImpl implements EmpleadoService {

    public List<Empleado> empleadoList;

    public EmpleadoServiceImpl() {
        this.empleadoList = new ArrayList<>();
    }

    @Override
    public void crear(Empleado empleado) {
        this.empleadoList.add(empleado);
    }

    @Override
    public List<Empleado> listar() {
        return this.empleadoList;
    }

    @Override
    public void modificar(Empleado empleado, int codigo) {
        var indice = -1;
        for (var empleados : this.empleadoList) {
            indice++;
            if (codigo == empleados.getCodigo()) {
                this.empleadoList.set(indice, empleado);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var empleado : this.empleadoList) {
            indice++;
            if (codigo == empleado.getCodigo()) {
                this.empleadoList.remove(indice);

            }

        }
    }

}
