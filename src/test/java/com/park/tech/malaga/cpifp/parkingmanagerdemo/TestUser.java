package com.park.tech.malaga.cpifp.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.park.tech.malaga.cpifp.parkingmanagerdemo.user.User;

public class TestUser {

    @Test
    public void check_user_name() {
        // Arrange
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "David";

        // Act
        String actual = david.getFirstName();


        // Assert
        assertEquals(expected, actual);
    }

    
}
