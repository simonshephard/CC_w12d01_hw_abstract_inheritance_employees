import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("manager", "AB123456", 50000.00, "Dept1");
    }

    @Test
    public void getName() {
        assertEquals("manager", manager.getName());
    }
    @Test
    public void getNInumber() {
        assertEquals("AB123456", manager.getNInumber());
    }
    @Test
    public void getSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void getDeptName() {
        assertEquals("Dept1", manager.getDeptName());
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(5555.55);
        assertEquals(55555.55, manager.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(500.00, manager.payBonus(), 0.01);
    }

}
