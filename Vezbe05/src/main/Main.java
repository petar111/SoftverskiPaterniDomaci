/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPerson;
import view.FrmPersonView;
import view.FrmPersonv2;
import view.FrmPersonv4;
import view.formPersonv3;

/**
 *
 * @author student1
 */
public class Main {
        public static void main(String[] args) {
            JFrame main= new JFrame("Original");
            JPanel panel=new FrmPersonView();
            main.add(panel);
            main.pack();
            main.setVisible(true);
            
            
            JFrame main2= new JFrame("Clone");
            
            FrmPersonView originalView = (FrmPersonView) panel;
            
            JPanel panelCopy = originalView.Clone();
            main2.add(panelCopy);
            main2.pack();
            main2.setVisible(true);
    }
}
