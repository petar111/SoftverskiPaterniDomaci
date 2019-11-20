/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author student1
 */
public abstract class Node {

    protected Node next;

    public void setNext(Node cvor) {
        next = cvor;
    }
    public int count(){
        if(next == null)
            return 1;
        return 1 + next.count();
    }
    
    
    public abstract void addToPanel(JPanel panel);
    
    public abstract void refreshPanel(JPanel panel, Map<String, Integer> map);

    public abstract void getCurrency(Currency currency, Map<String, Integer> map);

}
