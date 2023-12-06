package ma.leet.myapp.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyServiceTest {

    @Test
    public void testCompute() {

        MyService service = new MyService();
        double a = 5;
        double b = 3;
        double expected = 8;
        double result = service.compute(a, b);
        assertTrue(Math.abs(expected-result)<0.001);
    }
}