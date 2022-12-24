/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import servicio.DepartamentoServiceImpl;
import modelo.Departamento;
import servicio.EmpresaServiceImpl;

/**
 *
 * @author karlylvg
 */
public class DepartamentoControl {

    private DepartamentoServiceImpl departamentoServiceImpl = new DepartamentoServiceImpl();
    private EmpresaServiceImpl empresaServiceImpl = new EmpresaServiceImpl();

    public String crear(String[] data) {
        var retorno = "No se puede crear ";

        var nombre = data[0];
        var jefeDepartamental = data[1];
        var sueldosDepar = Double.valueOf(data[2]).doubleValue();;
        var numeroEmpleados = Integer.valueOf(data[3]).intValue();
        var year = Integer.valueOf(data[4]).intValue();
        var mes = Integer.valueOf(data[5]).intValue();
        var dia = Integer.valueOf(data[6]).intValue();
        var empresa = this.empresaServiceImpl.EmpresaCodigo(Integer.valueOf(data[7]));
        var codigo = Integer.valueOf(data[8]).intValue();

        if (sueldosDepar < 0) {
            retorno += " Los sueldos debe ser mayor a 0 ";
        } else {
            if (numeroEmpleados <0) {
                retorno += " El numero de empleados debe ser mayor a 0 ";
            } else {
                if (year > LocalDate.now().getYear()) {
                    retorno += " El año no es valido ";
                } else {
                    if (mes < 1 || mes > 12) {
                        retorno += " El mes no es valido ";
                    } else {
                        if (dia < 0 || dia > 31) {
                            retorno += " El dia no es valido ";
                        } else {
                            if (empresa == null) {
                                retorno += " Empresa no registrada ";
                            } else {
                                var carrera = new Departamento(nombre, 
                                jefeDepartamental,sueldosDepar, numeroEmpleados, 
                                        LocalDate.of(year, mes, dia), empresa, codigo);
                                this.departamentoServiceImpl.crear(carrera);
                                retorno = "Creado Satisfactoriamente ";

                            }

                        }

                    }

                }

            }
        }

        return retorno;
    }

    public String modificar(String[] data) {
        var retorno = "No se puede crear Universidad:";

        var nombre = data[0];
        var jefeDepartamental = data[1];
        var sueldosDepar = Double.valueOf(data[2]).doubleValue();;
        var numeroEmpleados = Integer.valueOf(data[3]).intValue();
        var year = Integer.valueOf(data[4]).intValue();
        var mes = Integer.valueOf(data[5]).intValue();
        var dia = Integer.valueOf(data[6]).intValue();
        var empresa = this.empresaServiceImpl.EmpresaCodigo(Integer.valueOf(data[7]));
        var codigo = Integer.valueOf(data[8]).intValue();
        var modificar = Integer.valueOf(data[9]).intValue();

        if (sueldosDepar < 0) {
            retorno += " El costo del ciclo no es valido ";
        } else {
            if (numeroEmpleados < 0) {
                retorno += " El numero de empleados debe ser mayor a 0 ";
            } else {
                if (year > LocalDate.now().getYear()) {
                    retorno += " El año no es valido ";
                } else {
                    if (mes < 1 || mes > 12) {
                        retorno += " El mes no es valido ";
                    } else {
                        if (dia < 0 || dia > 31) {
                            retorno += " El dia no es valido ";
                        } else {
                            if (empresa == null) {
                                retorno += " Empresa no registrada ";
                            } else {
                                var departamento = new Departamento(nombre, jefeDepartamental, 
                                        sueldosDepar, numeroEmpleados, LocalDate.of(year, mes, dia), empresa, codigo);
                                this.departamentoServiceImpl.modificar(departamento, modificar);
                                retorno = "Modificado Satisfactoriamente ";

                            }

                        }

                    }

                }

            }
        }

        return retorno;

    }

    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.departamentoServiceImpl.eliminar(codigo);

    }

    public List<Departamento> listar() {
        return this.departamentoServiceImpl.listar();
    }

}
