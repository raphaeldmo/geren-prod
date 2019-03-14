/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CategoriaDAO;
import java.util.ArrayList;
import model.Categoria;

/**
 *
 * @author pedrocruz
 */
public class CategoriaController {
    public static ArrayList<String[]> getCategorias(String nome) {
        ArrayList<Categoria> categorias = CategoriaDAO.getCategorias(nome);
        ArrayList<String[]> listaCategorias = new ArrayList<>();

        for (int i = 0; i < categorias.size(); i++) {
            listaCategorias.add(
                new String[]{
                    String.valueOf(categorias.get(i).getId()),
                    String.valueOf(categorias.get(i).getNome()),
                }
          );

        }

        return listaCategorias;

    }
}
