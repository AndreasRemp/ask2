package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subsTest {
    @Test
    void testsubs() {
        subs subtraction = new subs();
        String result = subtraction.subtraction(10, 5);
        assertEquals("POSITIVE", result, "10 - 5 must be POSITIVE");
    }
}