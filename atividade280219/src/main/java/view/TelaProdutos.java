/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CategoriaController;
import controller.ProdutoController;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author victor.snsilva
 */
public class TelaProdutos extends javax.swing.JFrame {
    
    String _Acao = "";
    Produto _Produto = new Produto();

    public TelaProdutos() {
        initComponents();
        txtId.setVisible(false);
        LoadTable(null);
        this.habilitaDesabilitaFormulario(false);
    }
    
    public void habilitaDesabilitaFormulario(boolean habilita) {
        txtNome.setEditable(habilita);
        txtPrecoCompra.setEditable(habilita);
        txtPrecoVenda.setEditable(habilita);
        txtQuantidade.setEditable(habilita);
        txtDescricao.setEditable(habilita);
        btnSalvar.setEnabled(habilita);
        btnCancelar.setEnabled(habilita);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorias = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNome = new javax.swing.JTextField();
        txtPrecoCompra = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        checkHabilitado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        checkHabilitado.setText("Habilitado");

        jLabel1.setText("Nome:");

        jLabel2.setText("Preço de Compra:");

        jLabel3.setText("Preço de Venda:");

        jLabel4.setText("Descrição:");

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descricao", "Categoria", "Preço de Compra", "Preço de Venda", "Quantidade", "Disponível", "Data de Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setText("Buscar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantidade:");

        jLabel7.setText("Categoria:");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletronicos", "Higiene", "Limpeza", "Alimentos", "Vestimenta" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar))
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtPrecoVenda)
                            .addComponent(txtPrecoCompra)
                            .addComponent(txtNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(checkHabilitado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkHabilitado)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnBuscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrar)
                                .addGap(36, 36, 36)
                                .addComponent(btnAlterar)
                                .addGap(38, 38, 38)
                                .addComponent(btnExcluir)
                                .addGap(107, 107, 107))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblProdutos.getRowCount() > 0) {
            if (tblProdutos.getSelectedRow() >= 0) {
                habilitaDesabilitaFormulario(true);
                
                _Acao = "editar";
                txtId.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 0).toString());
                txtNome.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 1).toString());
                txtDescricao.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 2).toString());
                comboCategoria.setSelectedItem(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 3).toString());
                txtPrecoCompra.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 4).toString());
                txtPrecoVenda.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 5).toString());
                txtQuantidade.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 6).toString());

            }
        }
         

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(_Acao.equals("cadastrar")) {
            if(ValidarFormulario()) {
                if(ProdutoController.Salvar(txtNome.getText(), 
                    txtDescricao.getText(), 
                    Double.parseDouble(txtPrecoCompra.getText()), 
                    Double.parseDouble(txtPrecoVenda.getText()), 
                    Integer.parseInt(txtQuantidade.getText()), 
                    comboCategoria.getSelectedIndex(),  
                    1)) {
                    ProdutoController.updateCategoria(comboCategoria.getSelectedIndex());
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    LoadTable(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar produto!");
                }
                LoadTable(null);
                    
            }
        } else {
                Produto p = new Produto();
                
                
                p.setId(Integer.parseInt(txtId.getText()));
                p.setNome(txtNome.getText());
                p.setDescricao(txtDescricao.getText());
                p.setPrecoCompra(Double.parseDouble(txtPrecoCompra.getText()));
                p.setPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));
                p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
                p.setDisponivel(1);
                
                ProdutoController.Alterar(p);
        }
            
            LoadTable(null);
            //}
            
            /*if (_Acao == "atualizar") {
            _Produto.setNome(txtNome.getText());
            _Produto.setPrecoCompra(Double.parseDouble(txtPrecoCompra.getText()));
            _Produto.setPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));
            _Produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            _Produto.setDescricao(txtDescricao.getText());
            if(checkHabilitado.isSelected()) {
            _Produto.setDisponivel(1);
            } else {
            _Produto.setDisponivel(0);
            }
            if (ProdutoController.Alterar(_Produto)) {
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            new TelaConsultaProdutos().setVisible(true);//que quer abrir
            dispose();
            } else {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar o produto!");
            
            }
            }*/
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(txtPesquisa.getText().equals("")) {
            LoadTable(null);
        } else {
            LoadTable(txtPesquisa.getText());
        }
        txtPesquisa.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblProdutos.getRowCount() > 0) {
            if (ProdutoController.Excluir(Integer.parseInt(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 0).toString()))) {
                this.LoadTable(null);
                JOptionPane.showMessageDialog(this, "Produto excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o Produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há Produtos para excluir!");
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        habilitaDesabilitaFormulario(true);
        _Acao = "cadastrar";
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private boolean ValidarFormulario() {

        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o produto!");
            return false;
        }

        try {
            if (this.txtQuantidade.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Defina a quantidade em estoque do produto!");
                return false;
            }
            Integer.parseInt(txtQuantidade.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros para a quantidade em estoque");
            return false;
        } finally {

        }

        try {
            if (txtPrecoCompra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Coloque o preço do produto!");
                return false;
            }
            Double.parseDouble(txtPrecoCompra.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores decimais para o preço do produto. Ex:500.50");
            return false;
        } finally {

        }
        try {
            if (txtPrecoVenda.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Defina um preço para produto!");
                return false;
            }
            Double.parseDouble(txtPrecoVenda.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores decimais para o preço do produto. Ex:500.50");
            return false;
        } finally {

        }
        if (this.txtDescricao.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina uma descrição para produto!");
            return false;
        }

        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup categorias;
    private javax.swing.JCheckBox checkHabilitado;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
