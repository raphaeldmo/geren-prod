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
        /*if(id<= 0){
            return false;
        }*/
        return ProdutoDAO.Excluir(id);
    }

    public static ArrayList<String[]> getProdutos(String nome) {
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos(nome);
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            String disponivel;
            if(produtos.get(i).isDisponivel() == 1) {
                disponivel = "Sim";
            } else {
                disponivel = "Não";
            }
            listaProdutos.add(
                new String[]{
                    String.valueOf(produtos.get(i).getId()),
                    String.valueOf(produtos.get(i).getNome()),
                    String.valueOf(produtos.get(i).getDescricao()),
                    String.valueOf(produtos.get(i).getCategoria()),
                    String.valueOf(produtos.get(i).getPrecoCompra()),
                    String.valueOf(produtos.get(i).getPrecoVenda()),
                    String.valueOf(produtos.get(i).getQuantidade()),
                    String.valueOf(disponivel),
                    String.valueOf(produtos.get(i).getData_cadastro())
                }
          );

        }

        return listaProdutos;

    }

    public static boolean Alterar(Produto P) {
        if (P.getId() <= 0) {
            return false;
        }
        return ProdutoDAO.Atualizar(P);
    }

    public static boolean Criar(Produto P) throws ClassNotFoundException, SQLException {
        if (P.getId() <= 0) {
            return false;
        }

        return ProdutoDAO.Criar(P);
    }
}
