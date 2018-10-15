import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("developer", "AB123456", 30000.00);
    }

    @Test
    public void getName() {
        assertEquals("developer", developer.getName());
    }
    @Test
    public void getNInumber() {
        assertEquals("AB123456", developer.getNInumber());
    }
    @Test
    public void getSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(5555.55);
        assertEquals(35555.55, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(300.00, developer.payBonus(), 0.01);
    }

}
