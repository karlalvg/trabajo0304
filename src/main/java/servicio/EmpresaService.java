/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Empresa;

/**
 *
 * @author karlylvg
 */
public interface EmpresaService {

    public Empresa EmpresaCodigo(int codigo);

    public void crear(Empresa empresa);

    public void modificar(Empresa empresa, int codigo);

    public void eliminar(int codigo);

    public List<Empresa> listar();

}
