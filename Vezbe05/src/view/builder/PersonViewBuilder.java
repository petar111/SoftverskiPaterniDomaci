/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.builder;

import javax.swing.JPanel;

/**
 *
 * @author siux
 */
public interface PersonViewBuilder {
    void createFirstName();
    void createLastName();
    void createGender();
    void createDate();
}
