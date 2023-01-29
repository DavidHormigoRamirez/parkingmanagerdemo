

import com.park.tech.malaga.cpifp.parkingmanagerdemo.user.User;

public class UserEntityUnitTest {
    @BeforeEach

    @Test
    public void testFirstName(){
        User user = new User("David", "Hormigo", "Ramírez", "Profesor");
        String expected = "David";
        String actual = user.getFirstName(); 
        assertEquals(expected,actual);
    }

    @Test
    public void testLastName() {

    }
    
}
