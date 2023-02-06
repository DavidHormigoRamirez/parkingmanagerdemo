package com.park.tech.malaga.cpifp.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import com.park.tech.malaga.cpifp.parkingmanagerdemo.user.User;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class UserEntityUnitTest {
    
    private User user;
    @BeforeEach
    public void init(){
        this.user = new User("David", "Hormigo", "Ramírez", "Profesor");
    }

    @Test
    public void check_user_name() {
        // Arrange
        String expected = "David";

        // Act
        String actual = this.user.getFirstName();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_change_user_name() {
        // Arrange
        String expected = "Juan";
        
        
        //Act
        this.user.setFirstName("Juan");
        String actual = this.user.getFirstName();

        assertEquals(expected, actual);
    }
}
