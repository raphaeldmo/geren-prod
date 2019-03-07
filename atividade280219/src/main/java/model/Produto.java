package model;
import java.util.Date;

public class Produto {

    //Atributos
    private int id;
    private String nome;
    private String descricao;
    private double preco_compra;
    private double preco_venda;
    private int quantidade;
    private boolean diponivel;
    private Date data_cadastro;

    //Construtores
    public Produto(int pId, String pNome, String pDescricao, double pPreco_Compra,
            double pPreco_Venda, int pQuantidade) {
        this.id = pId;
        this.nome = pNome;
        this.descricao = pDescricao;
        this.preco_compra = pPreco_Compra;
        this.preco_venda = pPreco_Venda;
        this.quantidade = pQuantidade;
    }

    public Produto() {
    }
    
    //Get and Set
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

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco_compra
     */
    public double getPreco_compra() {
        return preco_compra;
    }

    /**
     * @param preco_compra the preco_compra to set
     */
    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    /**
     * @return the preco_venda
     */
    public double getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the diponivel
     */
    public boolean isDiponivel() {
        return diponivel;
    }

    /**
     * @param diponivel the diponivel to set
     */
    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }

    /**
     * @return the data_cadastro
     */
    public Date getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    

}
