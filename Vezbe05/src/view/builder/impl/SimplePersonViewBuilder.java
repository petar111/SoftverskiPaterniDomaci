/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.builder.impl;

import components.fields.PanelInputTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import view.builder.PersonViewBuilder;

/**
 *
 * @author siux
 */
public class SimplePersonViewBuilder implements PersonViewBuilder{
    
    private JPanel personView;

    public SimplePersonViewBuilder() {
        personView = new JPanel(new GridLayout(4, 1));
    }

    public JPanel getPersonView() {
        return personView;
    }
    
    
    
    
     @Override
    public void createFirstName() {
        PanelInputTextField inputFirstName=new PanelInputTextField();
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        inputFirstName.initialize("");
        
        personView.add(inputFirstName);
    }

    @Override
    public void createLastName() {
        PanelInputTextField inputLastName=new PanelInputTextField();
        
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        inputLastName.initialize("");
        
        personView.add(inputLastName);
    }

    @Override
    public void createGender() {
        PanelInputTextField inputGender=new PanelInputTextField();
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        inputGender.initialize("");
        
        personView.add(inputGender);
    }

    @Override
    public void createDate() {
        PanelInputTextField inputDate=new PanelInputTextField();
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputDate.initialize("");
        
        personView.add(inputDate);
    }
}
