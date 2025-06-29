import org.junit.*;

public class AAATest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up");
        calc = null;
    }

    @Test
    public void testAdditionUsingAAA() {
        int result = calc.add(2, 3);
        Assert.assertEquals(5, result);
    }
}