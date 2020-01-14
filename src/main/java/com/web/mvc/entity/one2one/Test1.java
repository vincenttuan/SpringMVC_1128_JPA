package com.web.mvc.entity.one2one;

import com.web.mvc.entity.JPAUtil;
import javax.persistence.EntityManager;

public class Test1 {
    static EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
    public static void main(String[] args) {
        add("老李");
    }
    
    public static void add(String name) {
        Person person = new Person();
        person.setName(name);
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        System.out.println("Add OK !");
    }
}
