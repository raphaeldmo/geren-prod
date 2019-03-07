
package model;
public class Produto_Categoria {
    
    //Atributos
    private int id_produto;
    private int id_categoria;
    
    //construtores
    public Produto_Categoria(){
        
    }
    public Produto_Categoria(int pcIdProd, int pcIdCat){
        this.id_produto = pcIdProd;
        this.id_categoria = pcIdCat;
    }
    
    //get and set
    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
}
