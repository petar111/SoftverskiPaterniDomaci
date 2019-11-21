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
public class Node1 extends Node {

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) {
        if (currency.getAmount() >= 1) {
            
            int bills = Machine.getInstance().getBillCount().get("1");
            
            int a = currency.getAmount() / 1;
            int b = currency.getAmount() % 1;
            
            if(a <= bills){
                map.put("1", a);
                Machine.getInstance().getBillCount().put("1", bills - a);
            }else{
                map.put("1", bills);
                Machine.getInstance().getBillCount().put("1", 0);
                b = b + (a - bills)*1;
            }
            
            if (b != 0 && next != null) {
                next.getCurrency(new Currency(b), map);
            }
            
        } else {
            map.put("1", 0);
            if (next != null) {
                next.getCurrency(currency, map);
            }
        }
    }

    @Override
    public void addToPanel(JPanel panel) {
        PanelSingleBill psb = new PanelSingleBill();
        psb.getLblBill().setText("1");
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
                if(psb.getLblBill().getText().equals("1")){
                    psb.getTxtBill().setText(map.get("1").toString());
                }
            }
        }
                
        if(next != null){
            next.refreshPanel(panel, map);
        }
    }
    
    @Override
    public int returnAmount(Currency currency) {
        
        if (currency.getAmount() >= 1) {
            
            int bills = Machine.getInstance().getBillCount().get("1");
            
            int a = currency.getAmount() / 1;
            int b = currency.getAmount() % 1;
            
            if(a <= bills){
            }else{
                b = b + (a - bills)*1;
            }
            
            
            if (next != null) {
                return bills*1 + next.returnAmount(new Currency(b));
            }
            return bills*1;
            
        } else {
            if (next != null) {
                return next.returnAmount(currency);
            }
            return 0;
        }
        
    }

}
