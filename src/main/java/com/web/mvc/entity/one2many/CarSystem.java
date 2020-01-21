package com.web.mvc.entity.one2many;

import com.web.mvc.entity.JPAUtil;
import java.util.Scanner;
import javax.persistence.EntityManager;

public class CarSystem {
    static EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
    
    public static void menu() {
        System.out.println("-----------------");
        System.out.println("1. 新增 Driver");
        System.out.println("2. 新增 Car");
        System.out.println("0. 離開 Exit");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入選項: ");
        switch(sc.next()) {
            case "1":
                System.out.println("請輸入 Driver 名稱: ");
                addDriver(sc.next());
                break;
            case "2":
                System.out.println("請輸入 Car 名稱: ");
                addCar(sc.next());
                break;
            case "0":    
                return;
        }
        menu();
    }
    
    public static void addDriver(String name) {
        Driver driver = new Driver();
        driver.setName(name);
        em.getTransaction().begin();
        em.persist(driver);
        em.getTransaction().commit();
        System.out.println("Driver 新增成功 !");
    }
    
    public static void addCar(String name) {
        Car car = new Car();
        car.setName(name);
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();
        System.out.println("Car 新增成功 !");
    }
    
    public static void main(String[] args) {
        menu();
    }
}
