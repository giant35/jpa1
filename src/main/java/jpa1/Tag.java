/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author sihai
 */
@Entity
public class Tag {

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    int id;

    String name;

    @ManyToMany(targetEntity = User.class, mappedBy = "tagList")
    Collection<User> userList;
}
