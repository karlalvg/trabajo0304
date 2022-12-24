/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Departamento;
import modelo.Empresa;

/**
 *
 * @author karlylvg
 */
public class DepartamentoServiceImpl implements DepartamentoService {

    public static List<Departamento> departamentoList = new ArrayList<>();

    public DepartamentoServiceImpl() {

    }

    @Override
    public void crear(Departamento departamento) {
        this.departamentoList.add(departamento);
    }

    @Override
    public List<Departamento> listar() {
        return this.departamentoList;
    }

   
    @Override
    public void modificar(Departamento departamento, int codigo) {
        var indice = -1;
        for (var empresas : this.departamentoList) {
            indice++;
            if (codigo == empresas.getCodigo()) {
                this.departamentoList.set(indice, departamento);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var departamentos : this.departamentoList) {
            indice++;
            if (codigo == departamentos.getCodigo()) {
                this.departamentoList.remove(indice);

            }

        }

    }

    @Override
    public Departamento DepartamentoCodigo(int codigo) {
        Departamento retorno = null;
        for (var departamento : this.departamentoList) {
            if (codigo == departamento.getCodigo()) {
                retorno = departamento;
              

            }
        }
        return retorno;
        
        
    }

}
