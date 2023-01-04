/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Empleado;
import modelo.Departamento;

import servicio.EmpleadoServiceImpl;
import servicio.DepartamentoServiceImpl;

/**
 *
 * @author karlylvg
 */
public class EmpleadoControl {

    private EmpleadoServiceImpl empleadoServiceImpl = new EmpleadoServiceImpl();
    private DepartamentoServiceImpl departamentoServiceImpl = new DepartamentoServiceImpl();

    public EmpleadoControl() {
        this.empleadoServiceImpl = new EmpleadoServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "No se puede crear:";
        var nombre = data[0];
        var tituloUniversitario = data[1];
        var horasDiariasTrabajadas = Integer.valueOf(data[2]).intValue();
        var horasMensuales = Integer.valueOf(data[3]).intValue();
        var costoHoras = Double.valueOf(data[4]).doubleValue();
        var numeroActividadesMes = Integer.valueOf(data[5]).intValue();
        var departamento = this.departamentoServiceImpl.DepartamentoCodigo(Integer.valueOf(data[6]));
        var genero = data[7];
        var codigo = Integer.valueOf(data[8]).intValue();

        if (horasDiariasTrabajadas < 0) {
            retorno += " El numero debe ser mayor a 0 ";
        } else {
            if (horasMensuales <= 0 || horasMensuales > 160) {
                retorno += " El numero de horas es incorrecto ";
            } else {
                if (costoHoras < 0) {
                    retorno += " El costo debe ser mayor a 0";
                } else {
                    if (numeroActividadesMes < 0) {
                        retorno += " Las actividades debe ser mayor a 0";
                    } else {
                        if (departamento == null) {
                            retorno += " Empresa no registrada ";
                        } else {
                            var empleado = new Empleado(nombre, tituloUniversitario, 
                                    horasDiariasTrabajadas, horasMensuales, costoHoras, 
                                    numeroActividadesMes, departamento, genero, codigo);
                            this.empleadoServiceImpl.crear(empleado);
                            retorno = "Creado correctamente ";

                        }

                    }

                }

            }

        }

        return retorno;
    }

    public String modificar(String[] data) {
        var retorno = "No se a creado";
        var nombre = data[0];
        var docente = data[1];
        var numHoras = Integer.valueOf(data[2]).intValue();
        var horasSemanales = Integer.valueOf(data[3]).intValue();
        var costoHoras = Double.valueOf(data[4]).doubleValue();
        var numeroActividadesMes = Integer.valueOf(data[5]).intValue();
        var departamento = this.departamentoServiceImpl.DepartamentoCodigo(Integer.valueOf(data[6]));
        var modalidad = data[7];
        var codigo = Integer.valueOf(data[8]).intValue();
        var modificar = Integer.valueOf(data[9]).intValue();

        if (numHoras < 0) {
            retorno += " El numero de noras debe ser mayor a 0 ";
        } else {
            if (horasSemanales <= 0 || horasSemanales > 24) {
                retorno += " El numero de horas mal ingresadas ";
            } else {
                if (costoHoras < 0) {
                    retorno += " El costo debe ser mayor a 0";
                } else {
                    if (numeroActividadesMes < 0) {
                        retorno += " Las actividades debe ser mayor a 0 ";
                    } else {
                        if (departamento == null) {
                            retorno += " Universidad fuera del registro ";
                        } else {
                            var empleado = new Empleado(nombre, docente, 
                                    numHoras, horasSemanales, costoHoras, 
                                    numeroActividadesMes, departamento, modalidad, codigo);
                            this.empleadoServiceImpl.modificar(empleado, modificar);
                            retorno = "Modificado Satisfactoriamente ";

                        }

                    }

                }

            }

        }

        return retorno;

    }

    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.empleadoServiceImpl.eliminar(codigo);

    }

    public List<Empleado> listar() {
        return this.empleadoServiceImpl.listar();

    }
}
