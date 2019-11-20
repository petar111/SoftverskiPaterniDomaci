/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.components;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import logic.Controller;

/**
 *
 * @author siux
 */
public class PanelBills extends javax.swing.JPanel {

    /**
     * Creates new form PanelBills
     */
    public PanelBills() {
        initComponents();
        prepareView();
    }
    
    
    public void setEditable(boolean editable){
        
            for (Component component : this.getComponents()) {
                if(component instanceof PanelSingleBill){
                    PanelSingleBill psb = (PanelSingleBill)component;
                    psb.getTxtBill().setEditable(editable);
                }
            }
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(1, 1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        int chainCount = Controller.getInstance().getChain().count();
        setLayout(new GridLayout(chainCount, 1));
        
        Controller.getInstance().getChain().addToPanel(this);
    }
}
