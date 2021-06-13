package question1;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MesTest
{
    /**
     * Default constructor for test class MesTest
     */
    public MesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    

    @Test
    public void myTest()
    {
        assertEquals(32.22, question1.FahrenheitCelsius.fahrenheitEnCelsius(90), 0.1);
        assertEquals(-6.66, question1.FahrenheitCelsius.fahrenheitEnCelsius(20), 0.1);
        assertEquals(20, question1.FahrenheitCelsius.fahrenheitEnCelsius(68), 0.1);
        assertEquals(0, question1.FahrenheitCelsius.fahrenheitEnCelsius(32), 0.1);
        assertEquals(4.44, question1.FahrenheitCelsius.fahrenheitEnCelsius(40), 0.1);
    }
}



