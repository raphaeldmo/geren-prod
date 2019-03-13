/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import model.Produto;
import java.util.ArrayList;
import controller.ProdutoController;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author FGO064
 */
public class TelaConsultaProdutos extends javax.swing.JFrame {

    Produto _produto = new Produto();

    /**
     * Creates new form TelaConsultaProdutos
     */
    public TelaConsultaProdutos() {
        initComponents();
        LoadTable(null);
    }
    
    public void LoadTable(String nome) {
        ArrayList<String[]> linhasProdutos;
        if(nome == null) {
            linhasProdutos = ProdutoController.getProdutos(null);
        } else {
            linhasProdutos = ProdutoController.getProdutos(nome);
        }

        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("Código");
        tmProdutos.addColumn("Nome");
        tmProdutos.addColumn("Descricao");
        tmProdutos.addColumn("Categoria");
        tmProdutos.addColumn("Preco de Compra");
        tmProdutos.addColumn("Preco de Venda");
        tmProdutos.addColumn("Quantidade");
        tmProdutos.addColumn("Disponivel");
        tmProdutos.addColumn("Data Cadastro");
        tblProdutos.setModel(tmProdutos);

        for (String[] c : linhasProdutos) {
            tmProdutos.addRow(c);
        }

        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50); //Codigo
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);//Nome
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(250);//Descricao
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(150);//Categoria
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(150);//Preço Compra
        tblProdutos.getColumnModel().getColumn(5).setPreferredWidth(150);//Preço Venda
        tblProdutos.getColumnModel().getColumn(6).setPreferredWidth(150);//Quantidade
        tblProdutos.getColumnModel().getColumn(7).setPreferredWidth(100);//Disponivel
        tblProdutos.getColumnModel().getColumn(8).setPreferredWidth(150);//Data
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelPesquisarQuarto = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        labelPesquisarQuarto.setText("Pesquisar: ");
        getContentPane().add(labelPesquisarQuarto, java.awt.BorderLayout.CENTER);
        getContentPane().add(txtPesquisa, java.awt.BorderLayout.PAGE_START);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, java.awt.BorderLayout.PAGE_END);

        buttonAlterar.setText("Excluir");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAlterar, java.awt.BorderLayout.LINE_END);

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEditar, java.awt.BorderLayout.LINE_START);

        buttonExcluir.setText("Cadastrar");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExcluir, java.awt.BorderLayout.CENTER);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Codigo", "Nome", "Descricao", "Preco de Compra", "Preco de Venda", "Quantidade", "Disponivel", "Data Cadastro"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        Produto p = new Produto();
        p.setId(1);
        p.setNome("Celular");
        p.setPrecoCompra(500.99);
        p.setPrecoVenda(1200.00);
        p.setQuantidade(3);
        p.setDescricao("Celular Xiaomi A2 Lite");
        p.setDiponivel(1);
        Date d = new Date();
        p.setData_cadastro(d);

        new TelaCadastroProdutos(p).setVisible(true);//que quer abrir
        dispose();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPesquisarQuarto;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
