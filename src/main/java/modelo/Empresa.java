/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author karlylvg
 */
public class Empresa {

    private String nombre;
    private String duenio;
    private LocalDate anioCreacion;
    private int numeroEmpleados;
    private double ingresosMensuales;
    private int codigo;

    public Empresa(String nombre, String duenio, LocalDate anioCreacion, 
            int numeroEmpleados, double ingresosMensuales, int codigo) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.anioCreacion = anioCreacion;
        this.numeroEmpleados = numeroEmpleados;
        this.ingresosMensuales = ingresosMensuales;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public LocalDate getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(LocalDate anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", duenio=" + duenio + 
                ", anioCreacion=" + anioCreacion + ", numeroEmpleados=" + 
                numeroEmpleados + ", ingresosMensuales=" + ingresosMensuales 
                + ", codigo=" + codigo + ", años de creacion=" 
                + this.creacionEmpresa() + ", Ingresos por Matriculas=" + 
                this.egresoSueldos() + '}';
    }

    


    public int creacionEmpresa() {
        var years = LocalDate.now().getYear() - this.anioCreacion.getYear();
        if (this.anioCreacion.getMonthValue() < LocalDate.now().getMonthValue()) {
            years -= 1;
        }
        if (this.anioCreacion.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (this.anioCreacion.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                years -= 1;
            }

        }
        return years;
    }

    public double egresoSueldos() {
        return this.ingresosMensuales * this.numeroEmpleados;
    }

}
