/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import form.components.PanelBills;
import form.components.PanelSingleBill;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logic.Controller;
import logic.Machine;

/**
 *
 * @author siux
 */
public class FormAddBillsv2 extends javax.swing.JPanel {

    /**
     * Creates new form PanelBillsv2
     */
    public FormAddBillsv2() {
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeadline = new javax.swing.JLabel();
        btnAddBills = new javax.swing.JButton();
        pnlBills = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        lblHeadline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeadline.setText("Insert amount of each bill");
        add(lblHeadline, java.awt.BorderLayout.PAGE_START);

        btnAddBills.setText("Add bills");
        btnAddBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBillsActionPerformed(evt);
            }
        });
        add(btnAddBills, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout pnlBillsLayout = new javax.swing.GroupLayout(pnlBills);
        pnlBills.setLayout(pnlBillsLayout);
        pnlBillsLayout.setHorizontalGroup(
            pnlBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlBillsLayout.setVerticalGroup(
            pnlBillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        add(pnlBills, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBillsActionPerformed
        try {
            validation();
            
        for (Component component : pnlBills.getComponents()) {
            if(component instanceof PanelSingleBill){
                PanelSingleBill psb = (PanelSingleBill)component;
                
                int currBillCount = Integer.parseInt(psb.getTxtBill().getText());
                Machine.getInstance().getBillCount().put(psb.getLblBill().getText(), currBillCount
                        + Machine.getInstance().getBillCount().get(psb.getLblBill().getText()));
                
            }
        }
            
            JOptionPane.showMessageDialog(this, "Bills are added.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            clearFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddBillsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBills;
    private javax.swing.JLabel lblHeadline;
    private javax.swing.JPanel pnlBills;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        PanelBills pnlBillsInstance = new PanelBills();
        
        pnlBills = pnlBillsInstance;
        add(pnlBills, BorderLayout.CENTER);
    }

    private void validation() throws Exception {
        for (Component component : pnlBills.getComponents()) {
            if(component instanceof PanelSingleBill){
                PanelSingleBill psb = (PanelSingleBill)component;
                
                if(psb.getTxtBill().getText().equals("")){
                    psb.getTxtBill().setText("0");
                }
                
                Integer.parseInt(psb.getTxtBill().getText());
            }
        }
    }

    private void clearFields() {
        for (Component component : pnlBills.getComponents()) {
            if(component instanceof PanelSingleBill){
                PanelSingleBill psb = (PanelSingleBill)component;
                psb.getTxtBill().setText("");
            }
        }
    }
}
