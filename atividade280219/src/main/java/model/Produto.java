package model;
import java.util.Date;

public class Produto {

    //Atributos
    private int id;
    private String nome;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;
    private int diponivel;
    public String categoria;
    private Date data_cadastro;

    //Construtores
    public Produto(int pId, String pNome, String pDescricao, double pPrecoCompra,
            double pPrecoVenda, String pCategoria, int pQuantidade) {
        this.id = pId;
        this.nome = pNome;
        this.descricao = pDescricao;
        this.precoCompra = pPrecoCompra;
        this.precoVenda = pPrecoVenda;
        this.quantidade = pQuantidade;
        this.categoria = pCategoria;
    }
    
    public Produto(String pNome, String pDescricao, double pPrecoCompra,
        double pPrecoVenda, int pQuantidade) {
        this.nome = pNome;
        this.descricao = pDescricao;
        this.precoCompra = pPrecoCompra;
        this.precoVenda = pPrecoVenda;
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
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return this.descricao;
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
    public double getPrecoCompra() {
        return this.precoCompra;
    }

    /**
     * @param preco_compra the preco_compra to set
     */
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * @return the preco_venda
     */
    public double getPrecoVenda() {
        return this.precoVenda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return this.quantidade;
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
    public int isDiponivel() {
        return this.diponivel;
    }

    /**
     * @param diponivel the diponivel to set
     */
    public void setDiponivel(int diponivel) {
        this.diponivel = diponivel;
    }

    /**
     * @return the data_cadastro
     */
    public Date getData_cadastro() {
        return this.data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Object getPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCategoria() {
        return this.categoria;
    }
    
    

}
