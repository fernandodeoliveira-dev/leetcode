package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSubsequenceTest {

    @Test
    public void TestCase1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        assertTrue(ValidateSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase2() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8);
        var sequence = Arrays.asList(1, 6, -1, 10);
        assertFalse(ValidateSubsequence.isValidSubsequence(array, sequence));
    }

}