package com.pet_adoption.model;

import java.sql.Connection;
import java.sql.Statement;

import com.pet_adoption.config.DBManager;

public class DogDAO {

    /* 
     SECURIZAR LA BD
     * 1. Sacar connection como una variable privada fuera del método
     * 2. Sacar Statement como una variable privada fuera del método
     * 3. Usar prepareStatement accediendo a los getters y setters
     */
    
    public void createDog(Dog dog){
        try {
            Connection connection = DBManager.initConnection();
            Statement stmn = connection.createStatement();
            String sql = "INSERT INTO dogs (name, age, is_adopted) VALUES ('" + dog.getName() + "', " + dog.getAge() + ", true)";
            stmn.executeQuery(sql);
            System.out.println("\033[0;32m" + "\n¡" + dog.getName() + " creado/a con éxito!" + "\033[0m");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }
    }


}
