
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuNGTest {

    public MenuNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }


    @Test
    public void testKol() {
        int a = 10;
        int b = 3;
        Menu instance = new Menu();
        int expResult = 7;
        int result = instance.kol(a, b);
        assertEquals(result, expResult);
    }


    @Test
    public void testTS() {
        System.out.println("TS");
        int dl = 10;
        int t = 5;
        Menu instance = new Menu();
        int expResult = 4;
        int result = instance.TS(dl, t);
        assertEquals(result, expResult);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Menu.main(args);
    }
}
