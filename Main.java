package com.example.womenshop;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/womenproduct";
        String utilisateur = "root";
        String motDePasse = "root";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            // Code

            connexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        /*try {
            // instanciation de produits
            Product p1 = new Shoes("s1", 8, 10, 10,38);
            Product p2= new Clothes("c1", 14 , 20, 20, 36);

            Product [] tab= new Product[2];
            tab[0]=p1;
            tab[1]=p2;
            for(Product p:tab) {
                System.out.println(p);
            }

            p1.sell(9);
            p2.purchase(10);

            System.out.println(Product.getIncome());

            p1.applyDiscount();
            p2.applyDiscount();

           for(Product p:tab) {
                System.out.println(p);
            }

            System.out.println();
            List<Product> productList= new ArrayList<>();
            productList.add(p2);
            productList.add(p1);

            System.out.println(productList);

            productList.sort(null);
          System.out.println(productList);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }*/
    }
}