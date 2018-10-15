import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("dbadmin", "AB123456", 20000.00);
    }

    @Test
    public void getName() {
        assertEquals("dbadmin", databaseAdmin.getName());
    }
    @Test
    public void getNInumber() {
        assertEquals("AB123456", databaseAdmin.getNInumber());
    }
    @Test
    public void getSalary() {
        assertEquals(20000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(5555.55);
        assertEquals(25555.55, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(200.00, databaseAdmin.payBonus(), 0.01);
    }

}
