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
 * @author student1
 */
public class Node20 extends Node {

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) {
        if (currency.getAmount() >= 20) {

            int bills = Machine.getInstance().getBillCount().get("20");
            
            int a = currency.getAmount() / 20;
            int b = currency.getAmount() % 20;
            
            if(a <= bills){
                map.put("20", a);
                Machine.getInstance().getBillCount().put("20", bills - a);
            }else{
                map.put("20", bills);
                Machine.getInstance().getBillCount().put("20", 0);
                b = b + (a - bills)*20;
            }
            
            if (b != 0 && next != null) {
                next.getCurrency(new Currency(b), map);
            }
        } else {
            map.put("20", 0);
            if (next != null) {
                next.getCurrency(currency, map);
            }
        }
    }
    
    @Override
    public void addToPanel(JPanel panel) {
        PanelSingleBill psb = new PanelSingleBill();
        psb.getLblBill().setText("20");
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
                if(psb.getLblBill().getText().equals("20")){
                    psb.getTxtBill().setText(map.get("20").toString());
                }
            }
        }
                
        if(next != null){
            next.refreshPanel(panel, map);
        }
    }

}
