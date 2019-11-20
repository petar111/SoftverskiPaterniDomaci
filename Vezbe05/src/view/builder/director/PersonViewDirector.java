/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.builder.director;

import view.builder.PersonViewBuilder;

/**
 *
 * @author siux
 */
public class PersonViewDirector {
    PersonViewBuilder builder;

    public PersonViewDirector(PersonViewBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(PersonViewBuilder builder) {
        this.builder = builder;
    }
    
    
    
    public void construct(){
        builder.createFirstName();
        builder.createLastName();
        builder.createGender();
        builder.createDate();
    }
}
