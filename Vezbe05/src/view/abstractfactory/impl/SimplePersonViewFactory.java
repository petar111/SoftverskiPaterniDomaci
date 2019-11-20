/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.abstractfactory.impl;


import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import view.abstractfactory.PersonViewAbstractFactory;

/**
 *
 * @author student1
 */
public class SimplePersonViewFactory implements PersonViewAbstractFactory{

    @Override
    public JPanel createFirstName() {
        PanelInputTextField inputFirstName=new PanelInputTextField();
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        inputFirstName.initialize("");
        
        return inputFirstName;
    }

    @Override
    public JPanel createLastName() {
        PanelInputTextField inputLastName=new PanelInputTextField();
        
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        inputLastName.initialize("");
        
        return inputLastName;
    }

    @Override
    public JPanel createGender() {
        PanelInputTextField inputGender=new PanelInputTextField();
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        inputGender.initialize("");
        
        return inputGender;
    }

    @Override
    public JPanel createDate() {
        PanelInputTextField inputDate=new PanelInputTextField();
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputDate.initialize("");
        
        return inputDate;
    }

    

    
    
}
