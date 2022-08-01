import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloMavenTest {

    HelloMaven m1;


    @BeforeEach
    void setUp() {
        m1 = new HelloMaven("Jordan");
    }

    @Test
    void greet() {
        String expected = "Hello Jordan, I'm Maven";
        String actual = m1.greet();
        assertEquals(expected,actual);

    }
}