/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

public class ProdutoController {

    public static boolean Salvar(String pNome, int pQuantidade, double pPrecoCompra, double pPrecoVenda,
            int pIdCategoria, String pDescricao) {
        Produto p = new Produto(pNome, pDescricao, pPrecoCompra, pPrecoVenda, pQuantidade);
        return ProdutoDAO.Salvar(p);
    }

    public static boolean Excluir(int id) {
        if (id <= 0) {
            return false;
        }
        return ProdutoDAO.Excluir(id);
    }

    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        System.out.println(produtos);

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(
                new String[] { String.valueOf(produtos.get(i).getId()),
                    String.valueOf(produtos.get(i).getNome()), String.valueOf(produtos.get(i).getDescricao()),
                    String.valueOf(produtos.get(i).getPrecoCompra()), String.valueOf(produtos.get(i).getPrecoVenda()),
                    // String.valueOf(produtos.get(i).getCategoria()),
                    String.valueOf(produtos.get(i).getQuantidade()),
                    String.valueOf(produtos.get(i).getData_cadastro())
                });

        }

        return listaProdutos;

    }

    public static boolean Alterar(Produto P) {
        if (P.getId() <= 0) {
            return false;
        }
        return ProdutoDAO.Atualizar(P);
    }

    public static boolean Criar
    (
        String pNome,
        int pQuantidade,
        double pPrecoCompra,
        double pPrecoVenda,
        int pIdCategoria,
        String pDescricao
    ) throws ClassNotFoundException, SQLException {
        Produto p = new Produto(pNome, pDescricao, pPrecoCompra, pPrecoVenda, pQuantidade);

        return ProdutoDAO.Criar(p);
    }
}
