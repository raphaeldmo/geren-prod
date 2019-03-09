package view;

import controller.ProdutoController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroProdutos extends javax.swing.JFrame {

    private String modoTela;

    /**
     * Creates new form TelaCadastroProdutos
     */
    public TelaCadastroProdutos() {
        initComponents();
        ButtonDesabilitado();
        //Quando ele incia, o botão esta vermelho, CERTO, porem quando clico ele n fica verde de imediato, somebody help me?

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
        txtNome = new javax.swing.JTextField();
        txtPrecoCompra = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();

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

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelQuant)
                            .addComponent(labelPCompra)
                            .addComponent(labelNome)
                            .addComponent(labelDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(tgbStatus)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPCompra)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPVenda)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelQuant)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tgbStatus)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnIncluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbStatusActionPerformed
        if (tgbStatus.isSelected()) {
            tgbStatus.setBackground(Color.green);
            tgbStatus.setText("Habilitar");
        }

    }//GEN-LAST:event_tgbStatusActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        if (ValidarFormulario()) {
            if (ProdutoController.Salvar(
                    txtNome.getText(),
                    Double.parseDouble(txtPrecoCompra.getText()),
                    Double.parseDouble(txtPrecoVenda.getText()),
                    Integer.parseInt(txtQuantidade.getText()),
                    txtDescricao.getText())) {
//                this.LoadTable();
//                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
//                LimparFormulario();
//            } else {
//                JOptionPane.showMessageDialog(null, "Falha ao cadastrar o produto!");
                //@Victor, HELP!!! hahaha
            }

        }

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPCompra;
    private javax.swing.JLabel labelPVenda;
    private javax.swing.JLabel labelQuant;
    private javax.swing.JToggleButton tgbStatus;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
/**
     *
     * @return boolean - true: formulário válido, false: formulário inválido
     */
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
     * limpa formulário após ação
     */
    private void LimparFormulario() {
        txtNome.setText("");
        txtQuantidade.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
        txtDescricao.setText("");
    }
    
    private void ButtonDesabilitado(){
        if(!tgbStatus.isSelected())
        tgbStatus.setBackground(Color.red);
        tgbStatus.setText("Desabilitar");
    }

}
