/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import java.util.Map;

/**
 *
 * @author siux
 */
public class Controller {
    private static final Controller INSTANCE = new Controller();
    private Node chain;
    
    
    private Controller(){
        createChain();
    }
    
    public static Controller getInstance(){
        return INSTANCE;
    }
    
    private void createChain() {
        Node100 node100 = new Node100();
        Node50 node50 = new Node50();
        Node20 node20 = new Node20();
        Node10 node10 = new Node10();
        Node1 node1 = new Node1();

        node1.setNext(null);
        node10.setNext(node1);
        node20.setNext(node10);
        node50.setNext(node20);
        node100.setNext(node50);

        chain = node100;
    }

    public Node getChain() {
        return chain;
    }

    public boolean checkEnoughMoney(int amount, int price) {
        return amount >= price;
    }

  

  
    
    
    
    
    
}
