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
public class Filme {
    private String titulo;
    private int duracao;
    private String anoLancamento;
    List<FilmeCopia> temCopiaFilme;
    
    List<String> ListAtor = new ArrayList<String>();

    public Filme() {
    }
    private String formato;
    private String nomeAtor;

    public String getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the duracao
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @param anoLancamento the anoLancamento to set
     */
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * @return the nomeAtor
     */
    public String getNomeAtor() {
        return nomeAtor;
    }

    /**
     * @param nomeAtor the nomeAtor to set
     */
    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }
    
    
    
    
    
    
    
    
    
}
