package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
public class ProdutoDAO 
{
    private static Connection obterConexao() throws ClassNotFoundException, SQLException {
        // 1) Declarar o driver JDBC de acordo com o Banco de dados usado
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2) Abrir a conexão
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/produtobd?useTimezone=true&serverTimezone=UTC",
                "root",
                "");
        return conn;
    }

    public static boolean Salvar(Produto p) {

        return true;
    }

    public static boolean Atualizar(Produto p) {

        //boolean retorno = false;
        if (ProdutoExiste(p.getId())) {
            try {
                Connection Conexao = obterConexao();

                PreparedStatement Update = Conexao.prepareStatement(
                        "UPDATE PRODUTOBD.PRODUTO SET "
                        + "NOME = ?, "
                        + "DESCRICAO = ?, "
                        + "PRECO_COMPRA = ?, "
                        + "PRECO_VENDA = ?,"
                        + "QUANTIDADE = ?,"
                        + "DISPONIVEL = ?,"
                        + "WHERE ID = " + p.getId());

                Update.setString(1, p.getNome());
                Update.setString(2, p.getDescricao());
                Update.setDouble(3, p.getPrecoCompra());
                Update.setDouble(4, p.getPrecoVenda());
                Update.setInt(5, p.getQuantidade());
                Update.setInt(6, p.isDiponivel());

                int linhasAfetadas = Update.executeUpdate();

                if (linhasAfetadas > 0) {
                    return true;
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }

    public static boolean ProdutoExiste(int id) {
        try {
            Connection Conexao = obterConexao();

            PreparedStatement count = Conexao.prepareStatement("Select count(id)from PRODUTODB.PRODUTO where id = " + id);

            int linhasAfetadas = count.executeUpdate();

            if (linhasAfetadas > 0) {
                return true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean Excluir(int id) {

        if (ProdutoExiste(id)) {
            try {
                Connection Conexao = obterConexao();

                PreparedStatement Update = Conexao.prepareStatement(
                        "DELETE FROM produto"
                        + "WHERE ID = " + id);

               
                int linhasAfetadas = Update.executeUpdate();

                if (linhasAfetadas > 0) {
                    return true;
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public static ArrayList<Produto> getProdutos(String nome)
    {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        String query = "SELECT \n" +
        "produto.id,\n" +
        "produto.nome, \n" +
        "produto.descricao,\n" +
        "categoria.nome AS categoria,\n" +
        "produto.preco_compra,\n" +
        "produto.preco_venda,\n" +
        "produto.quantidade,\n" +
        "produto.disponivel,\n" +
        "produto.dt_cadastro\n" +
        "FROM PRODUTO\n" +
        "INNER JOIN produto_categoria ON produto.ID = produto_categoria.id_produto\n" +
        "INNER JOIN categoria ON produto_categoria.ID_CATEGORIA = categoria.id ";
        if(nome != null) {
            query += "WHERE produto.nome like '%" + nome + "%'";
        }
        
        try (Connection conn = obterConexao();
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setPrecoCompra(rs.getDouble("preco_compra"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecoVenda(rs.getDouble("preco_venda"));
                p.setDiponivel(rs.getInt("disponivel"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setData_cadastro(rs.getDate("dt_cadastro"));
                //System.out.println(p.getData_cadastro());  
                listaProdutos.add(p);
            }
                
        }catch(SQLException ex) {
            System.out.println(ex);
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return listaProdutos;
    }

}
