/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.abstractfactory;

import javax.swing.JPanel;

/**
 *
 * @author siux
 */
public interface PersonViewAbstractFactory {
    JPanel createFirstName();
    JPanel createLastName();
    JPanel createGender();
    JPanel createDate();
}
