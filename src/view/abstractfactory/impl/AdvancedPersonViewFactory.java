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
public class AdvancedPersonViewFactory implements PersonViewAbstractFactory{

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
        PanelInputComboBox inputGender=new PanelInputComboBox();
        
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        inputGender.initialize(genders);
        
        return inputGender;
    }

    @Override
    public JPanel createDate() {
        PanelInputDate inputDate=new PanelInputDate();
        
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputDate.initialize("2000");
        
        return inputDate;
    }
    
}
