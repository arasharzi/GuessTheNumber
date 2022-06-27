import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MainTest {

    @BeforeEach
    void setUp()
    {
    }

    @Test
    void testNumberTest()
    {
        assertEquals(true, Main.testNumber(4, 4));
        assertEquals(false, Main.testNumber(2, 4));
        assertEquals(false, Main.testNumber(4, 2));
    }

    @AfterEach
    void tearDown()
    {
    }
}

