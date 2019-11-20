/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory;

import javax.swing.JPanel;

/**
 *
 * @author siux
 */
public abstract class PersonViewFactory {
    protected JPanel personView;

    public JPanel getPersonView() {
        return personView;
    }
    
    public abstract void createPersonView();
    
}
