/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import java.util.ArrayList;
import model.Produto;

public class ProdutoController {

    public static boolean Salvar(String pNome, double pPrecoCompra, double pPrecoVenda, int pQuantidade, String pDescricao) {
        Produto p = new Produto(pNome, pPrecoCompra, pPrecoVenda, pQuantidade, pDescricao);
        return ProdutoDAO.Salvar(p);
    }
    

    public static boolean Excluir(int id) {
        return ProdutoDAO.Excluir(id);
    }

    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(
                    new String[]{String.valueOf(produtos.get(i).getId()),
                        produtos.get(i).getNome(),
                        String.valueOf(produtos.get(i).getPrecoCompra()),
                        String.valueOf(produtos.get(i).getPrecoVenda()),
                        String.valueOf(produtos.get(i).getQuantidade()),
                        String.valueOf(produtos.get(i).getDescricao())
                    });

        }

        return listaProdutos;

    }

}
