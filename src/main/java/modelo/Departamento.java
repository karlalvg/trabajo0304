/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Jose
 */
public class Departamento {

    private String nombre;
    private String jefeDepartamento;
    private double sueldo;
    private int numeroEmpleados;
    private LocalDate yearInaguracion;
    private Empresa empresa;
    private int codigo;

    public Departamento(String nombre, String jefeDepartamento, 
            double sueldo, int numeroEmpleados, LocalDate yearInaguracion, 
            Empresa empresa, int codigo) {
        this.nombre = nombre;
        this.jefeDepartamento = jefeDepartamento;
        this.sueldo = sueldo;
        this.numeroEmpleados = numeroEmpleados;
        this.yearInaguracion = yearInaguracion;
        this.empresa = empresa;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefeDepartamento() {
        return jefeDepartamento;
    }

    public void setJefeDepartamento(String jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public LocalDate getYearInaguracion() {
        return yearInaguracion;
    }

    public void setYearInaguracion(LocalDate yearInaguracion) {
        this.yearInaguracion = yearInaguracion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    

    public double costoTotalCarrera() {
        return this.sueldo * this.numeroEmpleados;
    }

    public int anioDepartamento() {
        var years = LocalDate.now().getYear() - this.yearInaguracion.getYear();
        if (this.yearInaguracion.getMonthValue() < LocalDate.now().getMonthValue()) {
            years -= 1;
        }
        if (this.yearInaguracion.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (this.yearInaguracion.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                years -= 1;
            }

        }
        return years;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", jefe departamental=" + 
                jefeDepartamento + ", sueldo=" + sueldo + ", numero empleados=" + 
                numeroEmpleados + ", año de creacion=" + yearInaguracion + ", Costo total=" 
                + this.costoTotalCarrera() + ", año del departamento=" + this.anioDepartamento() 
                + "\n, empresa=" + empresa.getNombre() + '}';
    }
}
