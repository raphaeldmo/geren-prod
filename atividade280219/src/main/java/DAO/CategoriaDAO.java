/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categoria;

/**
 *
 * @author victor.snsilva
 */
public class CategoriaDAO {
    
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
    
    public static ArrayList<Categoria> getCategorias(String nome)
    {
        ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
        
        String query = "SELECT \n" +
        "categoria.id,\n" +
        "categoria.nome\n" +
        "FROM CATEGORIA\n";
        if(nome != null) {
            query += "WHERE categoria.nome like '%" + nome + "%'";
        }
        
        try (Connection conn = obterConexao();
                PreparedStatement stmt = conn.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));

                listaCategorias.add(c);
            }
                
        } catch(SQLException ex) {
            System.out.println(ex);
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return listaCategorias;
    }
    
}
