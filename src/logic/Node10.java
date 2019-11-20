/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import form.components.PanelSingleBill;
import java.awt.Component;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author siux
 */
public class Node10 extends Node{

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) {
        if (currency.getAmount() >= 10) {
            
            int bills = Machine.getInstance().getBillCount().get("10");
            
            int a = currency.getAmount() / 10;
            int b = currency.getAmount() % 10;
            
            if(a <= bills){
                map.put("10", a);
                Machine.getInstance().getBillCount().put("10", bills - a);
            }else{
                map.put("10", bills);
                Machine.getInstance().getBillCount().put("10", 0);
                b = b + (a - bills)*10;
            }
            
            
            if (b != 0 && next != null) {
                next.getCurrency(new Currency(b), map);
            }
        } else {
            map.put("10", 0);
            if (next != null) {
                next.getCurrency(currency, map);
            }
        }
    }
    
    @Override
    public void addToPanel(JPanel panel) {
        PanelSingleBill psb = new PanelSingleBill();
        psb.getLblBill().setText("10");
        panel.add(psb);
        
        if(next != null){
            next.addToPanel(panel);
        }
    }
    
    @Override
    public void refreshPanel(JPanel panel, Map<String, Integer> map) {
        
        for (Component component : panel.getComponents()) {
            if(component instanceof PanelSingleBill){
                PanelSingleBill psb = (PanelSingleBill)component;
                if(psb.getLblBill().getText().equals("10")){
                    psb.getTxtBill().setText(map.get("10").toString());
                }
            }
        }
                
        if(next != null){
            next.refreshPanel(panel, map);
        }
    }
    
}
