/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sihai
 */
@Repository
@Transactional
public class UserRepo {

    @PersistenceContext
    EntityManager em;

    public void insert(User u) {
        if (u.tagList != null) {
            for (Tag t : u.tagList) {
                em.merge(t);                
                em.persist(t);
            }
        }
        em.persist(u);
    }

    public void update(User u) {
        if (u.tagList != null) {
            for (Tag t : u.tagList) {
                em.merge(t);
            }
        }
        em.merge(u);
    }
}
