/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import modelo.Empresa;

/**
 *
 * @author karlylvg
 */
public class EmpresaServiceImpl implements EmpresaService {

    private static List<Empresa> empresaList = new ArrayList<>();

    @Override
    public void crear(Empresa empresa) {

        this.empresaList.add(empresa);
    }

    @Override
    public List<Empresa> listar() {
        return this.empresaList;
    }

    @Override
    public void modificar(Empresa empresa, int codigo) {

        var indice = -1;
        for (var empresas : this.empresaList) {
            indice++;
            if (codigo == empresas.getCodigo()) {
                this.empresaList.set(indice, empresa);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var empresas : this.empresaList) {
            indice++;
            if (codigo == empresas.getCodigo()) {
                this.empresaList.remove(indice);
            }
            

        }
    }

    @Override
    public Empresa EmpresaCodigo(int codigo) {
       Empresa retorno = null;
        for (var empresa : this.empresaList) {
            if (codigo == empresa.getCodigo()) {
                retorno = empresa;
                break;

            }
        }
        return retorno;
    }

}
