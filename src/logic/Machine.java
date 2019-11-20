/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author siux
 */
public class Machine {
    private final Map<String, Integer> billCount; 
    private static final Machine INSTANCE = new Machine();

    public Machine() {
        billCount = new HashMap<>();
        billCount.put("100", 100);
        billCount.put("50", 100);
        billCount.put("20", 100);
        billCount.put("10", 100);
        billCount.put("1", 100);
    }
    
    public int calculateAmountIn(){
        int amountIn = 0;
        
        amountIn += billCount.get("100")*100;
        amountIn += billCount.get("50")*50;
        amountIn += billCount.get("20")*20;
        amountIn += billCount.get("10")*10;
        amountIn += billCount.get("1")*1;
        
        return amountIn;
    }

    public Map<String, Integer> getBillCount() {
        return billCount;
        
    }

    public static Machine getInstance(){
        return INSTANCE;
    }
    
    
}
