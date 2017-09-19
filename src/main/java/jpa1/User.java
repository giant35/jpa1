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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author sihai
 */
@Entity
public class User {
    @Id @GeneratedValue
    int id;
    
    String name;
    
    @ManyToMany
    @JoinTable(joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="tag_id")})
    Collection<Tag> tagList;
    
    
}
