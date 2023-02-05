package com.park.tech.malaga.cpifp.parkingmanagerdemo.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
public class UserUnitTest {
    private User user;

    @BeforeEach
    public void init() {
        this.user = new User("David", "Hormigo", "Ramírez", "Profesor");
    }

    @Test
    void testGetFirstName() {
        // Arrange
        String expected = "David";

        // Act
        String actual = this.user.getFirstName();

        // Assert
        assertEquals(expected, actual, "Nombre no es correcto");
    }

    @Test
    void testToString() {
        // Arrange
        String expected = "David Hormigo Ramírez";

        // Act
        String actual = this.user.toString();

        // Assert
        assertEquals(expected, actual, "Nombre completo no es correcto");
    }

    @Test
    void testGetLastName1() {
        // Arrange
        String expected = "Hormigo";

        // Act
        String actual = this.user.getLastName1();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetLastName2() {
        // Arrange
        String expected = "Ramírez";

        // Act
        String actual = this.user.getLastName2();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetRole() {
        // Arrange
        String expected = "Profesor";

        // Act
        String actual = this.user.getRole();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetFirstName() {
        // Arrange
        String expected = "Juan";

        // Act"
        user.setFirstName("Juan");
        String actual = this.user.getFirstName();

        // Assert
        assertEquals(expected, actual, "Nombre no es correcto");
    }

    @Test
    void testSetLastName1() {
        // Arrange
        String expected = "Pérez";

        // Act"
        user.setLastName1("Pérez");
        String actual = this.user.getLastName1();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetLastName2() {
        // Arrange
        String expected = "González";

        // Act"
        user.setLastName2("González");
        String actual = this.user.getLastName2();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testSetRole() {
        // Arrange
        String expected = "Alumno";

        // Act"
        user.setRole("Alumno");
        String actual = this.user.getRole();

        // Assert
        assertEquals(expected, actual);
    }
}
