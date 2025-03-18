package com.pet_adoption.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/pet_adoption";
    private static final String USER = "postgres";
    private static final String PASS = "12345";
    private static Connection connection;

    public static Connection initConnection(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("\033[0;32m" + "\n¡Conectado con éxito!" + "\033[0m");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        try {
            connection.close();
            System.out.println("\033[0;32m" + "Has salido del sistema correctamente" + "\033[0m");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
