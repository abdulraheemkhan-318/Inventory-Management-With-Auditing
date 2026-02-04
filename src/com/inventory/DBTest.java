package com.inventory;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/inventory_audit_db";
        String user = "root";
        String password = "masud1975";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

