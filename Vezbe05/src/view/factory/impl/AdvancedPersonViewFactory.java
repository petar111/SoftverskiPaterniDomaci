/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author student1
 */
public class AdvancedPersonViewFactory extends PersonViewFactory{

    @Override
    public void createPersonView() {
        personView =new JPanel();
        personView.setLayout(new GridLayout(4, 1));
        PanelInputTextField inputFirstName=new PanelInputTextField();
        PanelInputTextField inputLastName=new PanelInputTextField();
        PanelInputDate inputDate=new PanelInputDate();
        PanelInputComboBox inputGender=new PanelInputComboBox();
        
        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        inputFirstName.initialize("");
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        inputLastName.initialize("");
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputDate.initialize("2000");
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        inputGender.initialize(genders);
        
        personView.add(inputFirstName);
        personView.add(inputLastName);
        personView.add(inputDate);
        personView.add(inputGender);
        
    }
    
}
