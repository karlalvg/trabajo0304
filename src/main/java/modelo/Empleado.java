/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author karlylvg
 */
public class Empleado {

    private String nombre;
    private String tituloUniversitario;
    private int horasDiariasTrabajadas;
    private int horasMensuales;
    private double costoHoras;
    private int numeroActividadesMes;
    private Departamento Departamento;
    private String genero;
    private int codigo;

    public Empleado(String nombre, String tituloUniversitario, 
            int horasDiariasTrabajadas, int horasMensuales, double costoHoras, 
            int numeroActividadesMes, Departamento Departamento, String genero, 
            int codigo) {
        this.nombre = nombre;
        this.tituloUniversitario = tituloUniversitario;
        this.horasDiariasTrabajadas = horasDiariasTrabajadas;
        this.horasMensuales = horasMensuales;
        this.costoHoras = costoHoras;
        this.numeroActividadesMes = numeroActividadesMes;
        this.Departamento = Departamento;
        this.genero = genero;
        this.codigo = codigo;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public int getHorasDiariasTrabajadas() {
        return horasDiariasTrabajadas;
    }

    public void setHorasDiariasTrabajadas(int horasDiariasTrabajadas) {
        this.horasDiariasTrabajadas = horasDiariasTrabajadas;
    }

    public int getHorasMensuales() {
        return horasMensuales;
    }

    public void setHorasMensuales(int horasMensuales) {
        this.horasMensuales = horasMensuales;
    }

    public double getCostoHoras() {
        return costoHoras;
    }

    public void setCostoHoras(double costoHoras) {
        this.costoHoras = costoHoras;
    }

    public int getNumeroActividadesMes() {
        return numeroActividadesMes;
    }

    public void setNumeroActividadesMes(int numeroActividadesMes) {
        this.numeroActividadesMes = numeroActividadesMes;
    }

    public Departamento getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(Departamento Departamento) {
        this.Departamento = Departamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



    public double costoSueldo() {
        return this.costoHoras * this.horasDiariasTrabajadas;

    }

    public String periodoDuracion() {
        var months = (this.horasDiariasTrabajadas / this.horasMensuales);

        return "Tiene una duracion= " + months + " meses";

    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", titulo Universitario=" + 
                tituloUniversitario + ", horas trabajadas diarias=" + horasDiariasTrabajadas + ", horas al mes=" 
                + horasMensuales + ", costoHoras=" + costoHoras + ", "
                + "actividades mensuales=" + numeroActividadesMes + ", con un costo "
                + "total de=" + this.costoSueldo() + this.periodoDuracion() 
                + ", de genero=" + this.genero+ "\n, Departamento=" 
                + Departamento.getNombre() + 
                ", Codigo=" + this.codigo + '}';
    }

}
