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
public class LocadoraCopiaFilme {
private List<String> idLocadora;
private List<String> idFilmes;

    public LocadoraCopiaFilme() {
    }


    /**
     * @return the idLocadora
     */
    public List<String> getIdLocadora() {
        return idLocadora;
    }

    /**
     * @param idLocadora the idLocadora to set
     */
    public void setIdLocadora(List<String> idLocadora) {
        this.idLocadora = idLocadora;
    }

    /**
     * @return the idFilmes
     */
    public List<String> getIdFilmes() {
        return idFilmes;
    }

    /**
     * @param idFilmes the idFilmes to set
     */
    public void setIdFilmes(List<String> idFilmes) {
        this.idFilmes = idFilmes;
    }

    
    
}
