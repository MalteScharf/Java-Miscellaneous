package HA_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalaculatorTest {

    @Test
    void add() {
        SimpleCalaculator calaculator = new SimpleCalaculator();
        assertEquals(4,calaculator.add(2,2));
    }
}