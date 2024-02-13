import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class TestPrime {
    @Test
    public void testPrime() {
        List<Integer> list = Arrays.asList(2, 3, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251);
        for (int value : list)
        {
            Assertions.assertTrue(Prime.IsPrime(value));
        }
    }

    @Test
    public void testNotPrime() {
        List<Integer> list = Arrays.asList(4, 6, 8, 10, 556, 985, 294, 102398, 333, 121, 55, 90, 555, -32, 32, 999, 18, 158, 242, 240);
        for (int value : list)
        {
            Assertions.assertFalse(Prime.IsPrime(value));
        }
    }
}
