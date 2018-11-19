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
public class FilmeCopia extends Filme {
    private int numeroCopia;
    private List<LocadoraCopiaFilme> filmeCopia = new ArrayList<>() ;

    /**
     * @return the numeroCopia
     */
    public int getNumeroCopia() {
        return numeroCopia;
    }

    /**
     * @param numeroCopia the numeroCopia to set
     */
    public void setNumeroCopia(int numeroCopia) {
        this.numeroCopia = numeroCopia;
    }
    
}
