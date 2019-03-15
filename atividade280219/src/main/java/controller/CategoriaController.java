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
 * @author victor.snsilva
 */
public class CategoriaController {
    
    public static ArrayList<String[]> getCategorias() {
        ArrayList<Categoria> categorias = CategoriaDAO.getCategorias();
        System.out.println(categorias.toString());
        ArrayList<String[]> listaCategorias = new ArrayList<>();

        for (int i = 0; i < categorias.size(); i++) {
            listaCategorias.add(
                new String[]{
                    String.valueOf(categorias.get(i).getId()),
                    String.valueOf(categorias.get(i).getNome())
                }
          );

        }
        System.out.println(listaCategorias);
        return listaCategorias;

    }
    
}
