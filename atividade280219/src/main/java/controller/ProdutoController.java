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
    
    public static boolean updateCategoria(int idCategoria) {
        return ProdutoDAO.updateCategoria(idCategoria);
    }

    public static boolean Salvar(String pNome, String pDescricao, double pPrecoCompra, double pPrecoVenda, int pQuantidade,
            int pIdCategoria,  int pDisponivel) {
        Produto p = new Produto(pNome, pDescricao, pPrecoCompra, pPrecoVenda, pQuantidade, pIdCategoria, pDisponivel);
        return ProdutoDAO.Criar(p);
    }

    public static boolean Excluir(int id) {
        /*if(id<= 0){
            return false;
        }*/
        return ProdutoDAO.Excluir(id);
    }

    public static ArrayList<String[]> getProdutos(String nome) {
        ArrayList<Produto> produtos;
        if(nome == null) {
            produtos = ProdutoDAO.getProdutos(null);
        } else {
            produtos = ProdutoDAO.getProdutos(nome);
        }
        
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            String disponivel;
            String categoria = "";
            if(produtos.get(i).isDisponivel() == 1) {
                disponivel = "Sim";
            } else {
                disponivel = "Não";
            }
            if(produtos.get(i).getCategoria() == 1) {
                categoria = "Eletronicos";
            } else if(produtos.get(i).getCategoria() == 2) {
                categoria = "Higiene";
            } else if(produtos.get(i).getCategoria() == 3) {
                categoria = "Limpeza";
            } else if(produtos.get(i).getCategoria() == 4) {
                categoria = "Alimentos";
            } else if(produtos.get(i).getCategoria() == 5) {
                categoria = "Vestimenta";
            }

            listaProdutos.add(
                new String[]{
                    String.valueOf(produtos.get(i).getId()),
                    String.valueOf(produtos.get(i).getNome()),
                    String.valueOf(produtos.get(i).getDescricao()),
                    String.valueOf(categoria),
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

}
