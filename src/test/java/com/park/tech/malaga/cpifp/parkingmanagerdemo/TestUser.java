package com.park.tech.malaga.cpifp.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.park.tech.malaga.cpifp.parkingmanagerdemo.user.User;

public class TestUser {

    @Test
    public void check_user_name() {
        /* Arrange
         * En este paso preparamos los datos que vamos a necesitar para luego realizar el test
         */
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "David";

        /* Act
         * En este paso llamamos al método que queremos probar
         */
        String actual = david.getFirstName();


        /* Assert
         * En este paso comprobamos que efectivamente el valor obtenido es el que esperabamos
         */
        assertEquals(expected, actual);
    }

    
}
