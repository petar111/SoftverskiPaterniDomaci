/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logic.Machine;

/**
 *
 * @author siux
 */
public class FormAddBills extends javax.swing.JPanel{

    /**
     * Creates new form PanelBills
     */
    public FormAddBills() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblBill50 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBill100 = new javax.swing.JTextField();
        txtBill50 = new javax.swing.JTextField();
        txtBill20 = new javax.swing.JTextField();
        txtBill1 = new javax.swing.JTextField();
        lblHeadline = new javax.swing.JLabel();
        btnAddBills = new javax.swing.JButton();

        jLabel1.setText("100:");

        lblBill50.setText("50:");

        jLabel3.setText("20:");

        jLabel4.setText("1:");

        txtBill20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBill20ActionPerformed(evt);
            }
        });

        lblHeadline.setText("Insert the amount of each bill:");

        btnAddBills.setText("Add bills");
        btnAddBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBill50)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBill100)
                                    .addComponent(txtBill50)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddBills)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtBill20)
                                    .addComponent(txtBill1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeadline)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblHeadline)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtBill100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblBill50))
                    .addComponent(txtBill50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addComponent(txtBill20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtBill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddBills)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBillsActionPerformed
        try {
            validation();
            
            int bill100 = Integer.parseInt(txtBill100.getText());
            int bill50 = Integer.parseInt(txtBill50.getText());
            int bill20 = Integer.parseInt(txtBill20.getText());
            int bill1 = Integer.parseInt(txtBill1.getText());
            
            Machine InstaceOfMachine = Machine.getInstance();
            
            InstaceOfMachine.getBillCount().put("100", bill100 + InstaceOfMachine.getBillCount().get("100"));
            InstaceOfMachine.getBillCount().put("50", bill50 + InstaceOfMachine.getBillCount().get("50"));
            InstaceOfMachine.getBillCount().put("20", bill20 + InstaceOfMachine.getBillCount().get("20"));
            InstaceOfMachine.getBillCount().put("1", bill1 + InstaceOfMachine.getBillCount().get("1"));
            JOptionPane.showMessageDialog(this, "Bills are added.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            clearFields();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnAddBillsActionPerformed

    private void txtBill20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBill20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBill20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBills;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBill50;
    private javax.swing.JLabel lblHeadline;
    private javax.swing.JTextField txtBill1;
    private javax.swing.JTextField txtBill100;
    private javax.swing.JTextField txtBill20;
    private javax.swing.JTextField txtBill50;
    // End of variables declaration//GEN-END:variables

    private void validation() throws Exception{
        int bill100 = 0;
        int bill50 = 0;
        int bill20 = 0;
        int bill1 = 0;
        
        if(txtBill100.getText().equals("")){
            txtBill100.setText("0");
        }
        if(txtBill50.getText().equals("")){
            txtBill50.setText("0");
        }
        if(txtBill20.getText().equals("")){
            txtBill20.setText("0");
        }
        if(txtBill1.getText().equals("")){
           txtBill1.setText("0");
        }
        bill100 = Integer.parseInt(txtBill100.getText());
        bill50 = Integer.parseInt(txtBill50.getText());
        bill20 = Integer.parseInt(txtBill20.getText());
        bill1 = Integer.parseInt(txtBill1.getText());
        
        if(bill100 < 0 || bill50 < 0 || bill20 < 0 || bill1 < 0){
            throw new Exception("Negative value of bills.");
        }
    }

    private void clearFields() {
        txtBill1.setText("");
        txtBill20.setText("");
        txtBill50.setText("");
        txtBill100.setText("");
    }


}