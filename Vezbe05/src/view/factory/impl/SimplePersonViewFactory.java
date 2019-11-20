/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.fields.PanelInputTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author student1
 */
public class SimplePersonViewFactory extends PersonViewFactory{

    @Override
    public void createPersonView() {
        personView =new JPanel();
        personView.setLayout(new GridLayout(4, 1));
        PanelInputTextField inputFirstName=new PanelInputTextField();
        PanelInputTextField inputLastName=new PanelInputTextField();
        PanelInputTextField inputDate=new PanelInputTextField();
        PanelInputTextField inputGender=new PanelInputTextField();
        
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        
        personView.add(inputFirstName);
        personView.add(inputLastName);
        personView.add(inputDate);
        personView.add(inputGender);

    }

    
    
}
