/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Departamento;
import modelo.Empresa;

/**
 * @author karlylvg
 */
public interface DepartamentoService {

    public void crear(Departamento departamento);

    public void modificar(Departamento departamento, int codigo);

    public void eliminar(int codigo);

    public List<Departamento> listar();

    public Departamento DepartamentoCodigo(int codigo);

}
