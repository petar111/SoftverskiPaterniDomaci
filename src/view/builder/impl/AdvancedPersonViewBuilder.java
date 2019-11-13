/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.builder.impl;

import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import view.builder.PersonViewBuilder;

/**
 *
 * @author siux
 */
public class AdvancedPersonViewBuilder implements PersonViewBuilder{
    private JPanel personView;

    public AdvancedPersonViewBuilder() {
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
        PanelInputComboBox inputGender=new PanelInputComboBox();
        
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        inputGender.initialize(genders);
        
        personView.add(inputGender);
    }

    @Override
    public void createDate() {
        PanelInputDate inputDate=new PanelInputDate();
        
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputDate.initialize("2000");
        
        personView.add(inputDate);
    }
    
}
