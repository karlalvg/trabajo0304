/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Empresa;
import servicio.EmpresaServiceImpl;


/**
 *
 * @author karlylvg
 */
public class EmpresaControl {

    private EmpresaServiceImpl empresaServiceImpl = new EmpresaServiceImpl();

    public String crear(String[] data) {
        var retorno = "No se puede crear ";

        var nombre = data[0];
        var duenio = data[1];
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var numeroEmpleados = Integer.valueOf(data[5]).intValue();
        var ingresosMensuales = Double.valueOf(data[6]).doubleValue();
        var codigo = Integer.valueOf(data[7]).intValue();
        
        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                } else {
                    if (numeroEmpleados < 0) {
                        retorno += " No es valido ";
                    } else {
                        if (ingresosMensuales < 0) {
                            retorno += " Es incorrecto ";
                        } else {
                            var empresa = new Empresa(nombre, duenio, 
                                    LocalDate.of(year, mes, dia), numeroEmpleados, 
                                    ingresosMensuales, codigo);
                            this.empresaServiceImpl.crear(empresa);
                            retorno = "Creado correctamente ";
                        }

                    }

                }

            }

        }
        return retorno;

    }

    public List<Empresa> listar() {
        return this.empresaServiceImpl.listar();
    }

    public String modificar(String[] data) {
        var retorno = "No se puede crear ";

        var nombre = data[0];
        var duenio = data[1];
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var numeroEmpleados = Integer.valueOf(data[5]).intValue();
        var ingresosMensuales = Double.valueOf(data[6]).doubleValue();
        var codigo = Integer.valueOf(data[7]).intValue();
        var empresaModificada = Integer.valueOf(data[8]).intValue();

        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                } else {
                    if (numeroEmpleados < 0) {
                        retorno += " El numero de empleados debe ser mayor a 0 ";
                    } else {
                        if (ingresosMensuales < 0) {
                            retorno += "Los gastos debe ser mayor a 0 ";
                        } else {
                            var empresa = new Empresa(nombre, duenio, 
                                    LocalDate.of(year, mes, dia), numeroEmpleados, 
                                    ingresosMensuales, codigo);
                            this.empresaServiceImpl.modificar(empresa, 
                                    empresaModificada);
                            retorno = "modificado ";

                        }

                    }

                }

            }

        }
        return retorno;

    }

    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.empresaServiceImpl.eliminar(codigo);

    }
}
