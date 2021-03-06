/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author FGO064
 */
public class TelaCadastroProdutos extends javax.swing.JFrame {

    String _Acao = "";
    Produto _Produto = new Produto();

    /**
     * Creates new form TelaCadastroProdutos
     */
    public TelaCadastroProdutos() {
        initComponents();
    }

    public TelaCadastroProdutos(Produto P) {
        initComponents();
        if (P.getId() > 0) {
            _Acao = "Atualizar";
            fieldNome.setText(P.getNome());
            fieldPCompra.setText(Double.toString(P.getPrecoCompra()));
            fieldVenda.setText(Double.toString(P.getPrecoVenda()));
            fieldQtd.setText(Integer.toString(P.getQuantidade()));
            fieldDesc.setText(P.getDescricao());
            _Produto = P;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelPCompra = new javax.swing.JLabel();
        labelPVenda = new javax.swing.JLabel();
        labelQuant = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        tgbStatus = new javax.swing.JToggleButton();
        fieldNome = new javax.swing.JTextField();
        fieldPCompra = new javax.swing.JTextField();
        fieldDesc = new javax.swing.JTextField();
        fieldVenda = new javax.swing.JTextField();
        fieldQtd = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setTitle("Cadastro de Produtos");

        labelNome.setText("Nome:");

        labelPCompra.setText("Preço de Compra: ");

        labelPVenda.setText("Preço de Venda: ");

        labelQuant.setText("Quantidade: ");

        labelDescricao.setText("Descrição: ");

        tgbStatus.setText("Habilitar");
        tgbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbStatusActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCancelar)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescricao)
                        .addGap(40, 40, 40)
                        .addComponent(fieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelQuant)
                                .addComponent(labelPCompra)
                                .addComponent(labelNome)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldPCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(fieldQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelPVenda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(tgbStatus)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPCompra)
                    .addComponent(fieldPCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPVenda)
                            .addComponent(fieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelQuant)
                            .addComponent(fieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tgbStatus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelDescricao))
                    .addComponent(fieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbStatusActionPerformed
        if (tgbStatus.isSelected()) {
            tgbStatus.setBackground(Color.red);
            tgbStatus.setText("Desabilitar");
        } else {
            tgbStatus.setBackground(Color.green);
            tgbStatus.setText("Habilitar");
        }
    }//GEN-LAST:event_tgbStatusActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (_Acao == "Atualizar") {
            _Produto.setNome(fieldNome.getText());
            _Produto.setPrecoCompra(Double.parseDouble(fieldPCompra.getText()));
            _Produto.setPrecoVenda(Double.parseDouble(fieldVenda.getText()));
            _Produto.setQuantidade(Integer.parseInt(fieldQtd.getText()));
            _Produto.setDescricao(fieldDesc.getText());
            if (ProdutoController.Alterar(_Produto)) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
                new TelaConsultaProdutos().setVisible(true);//que quer abrir
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar o produto!");

            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField fieldDesc;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldPCompra;
    private javax.swing.JTextField fieldQtd;
    private javax.swing.JTextField fieldVenda;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPCompra;
    private javax.swing.JLabel labelPVenda;
    private javax.swing.JLabel labelQuant;
    private javax.swing.JToggleButton tgbStatus;
    // End of variables declaration//GEN-END:variables
}
