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

        boolean retorno = false;
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
                Update.setBoolean(6, p.isDiponivel());

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

        return true;
    }
    
    public static ArrayList<Produto> getProdutos()
    {
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        String query = "SELECT * FROM produto";
        
        try (Connection conn = obterConexao();
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setPrecoCompra(rs.getDouble("preco_compra"));
                p.setPrecoVenda(rs.getDouble("preco_venda"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setData_cadastro(rs.getDate("dt_cadastro"));
                //System.out.println(p.getData_cadastro());  
                listaProdutos.add(p);
            }
                
        }catch(SQLException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return listaProdutos;
    }

}
