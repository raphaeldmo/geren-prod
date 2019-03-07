/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author raphael.dmorlandi
 */
public class Categoria {
    
    //Atributos
    private int id;
    private String nome;
    
    //Contrutores
    public Categoria(){
        
    }
    public Categoria(int cId, String cNome){
        this.id = cId;
        this.nome = cNome;
    }

    // Get and Set
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
