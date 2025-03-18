package com.pet_adoption;

import com.pet_adoption.model.Dog;
import com.pet_adoption.model.DogDAO;

/* import com.pet_adoption.config.DBManager; */

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Pet Adoption" );

        //PARA COMPROBAR CONEXIÓN BD
        /* DBManager.initConnection();
        DBManager.closeConnection(); */

         //PARA COMPROBAR ENTIDAD
        /* Dog dog = new Dog("Doggy", 3);
        System.out.println(dog.getName()); */

        //PARA COMPROBAR DOGDAO
        DogDAO dogDAO = new DogDAO();
        Dog dog = new Dog("Doggy", 3);
        dogDAO.createDog(dog);

    }
}
