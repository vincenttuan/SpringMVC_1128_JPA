package com.web.mvc.entity.many2many;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.mvc.entity.JPAUtil;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;

public class FundManagerSystem {
    static EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
    static ObjectMapper obj = new ObjectMapper();
    
    public static void menu() throws Exception {
        System.out.println("-----------------");
        System.out.println("1. 新增 股票 Stock");
        System.out.println("2. 新增 基金 Fund");
        System.out.println("3. 加入 基金成分股");
        System.out.println("4. 查詢 所有股票");
        System.out.println("5. 查詢 所有基金");
        System.out.println("0. Exit");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入選項: ");
        switch(sc.next()) {
            case "1":
                System.out.println("請輸入股票代號: ");
                addStock(sc.next());
                break;
            case "4":
                queryStocks();
                break; 
            case "0":
                return;     
        }
        menu();
    }
    
    public static void main(String[] args) throws Exception {
        menu();
    }
    
    private static void addStock(String symbol) throws Exception {
        Stock stock = new Stock();
        stock.setSymbol(symbol);
        em.getTransaction().begin();
        em.persist(stock);
        em.getTransaction().commit();
        System.out.println("Stock 新增成功 !");
    }
    
    private static void queryStocks() throws Exception {
        em.clear();
        List<Stock> stocks = em.createQuery("Select s From Stock s").getResultList();
        System.out.println(obj.writeValueAsString(stocks));
    }
}
