/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author sihai
 */
public class App {
    public static void main(String[] argv){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        User user = new User();
        user.name="李四";
        user.tagList = new ArrayList();
        user.tagList.add(new Tag("三好学生"));
        user.tagList.add(new Tag("学生干部"));

        UserRepo userRepo = ctx.getBean(UserRepo.class);
        userRepo.insert(user);
    }
}
