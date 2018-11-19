/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIL
 */
public class Locadora {
    private int codigo;
    private String nome;
    List<Socio> listaSocio= new ArrayList<Socio>();
    private List<LocadoraCopiaFilme> filmeCopia = new ArrayList<>() ;
    
    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
