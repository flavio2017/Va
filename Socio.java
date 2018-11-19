/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DIL
 */
public class Socio {
    private String nome;
    private String endereco;
    private int telefone;
    private String rg;
    private String cpf;
    private Date dataAdesao;
    List<FilmeCopia> alocaFilme;

    public Socio() {
        this.alocaFilme = new ArrayList<FilmeCopia>();
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

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataAdesao
     */
    public Date getDataAdesao() {
        return dataAdesao;
    }

    /**
     * @param dataAdesao the dataAdesao to set
     */
    public void setDataAdesao(Date dataAdesao) {
        this.dataAdesao = dataAdesao;
    }
    
}
