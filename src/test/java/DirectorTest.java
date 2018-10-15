import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Director", "AB123456", 80000.00, "Dept10", 1000000.00);
    }

    @Test
    public void getName() {
        assertEquals("Director", director.getName());
    }
    @Test
    public void getNInumber() {
        assertEquals("AB123456", director.getNInumber());
    }
    @Test
    public void getSalary() {
        assertEquals(80000.00, director.getSalary(), 0.01);
    }

    @Test
    public void getDeptName() {
        assertEquals("Dept10", director.getDeptName());
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(5555.55);
        assertEquals(85555.55, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(800.00, director.payBonus(), 0.01);
    }

    @Test
    public void getBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

}
