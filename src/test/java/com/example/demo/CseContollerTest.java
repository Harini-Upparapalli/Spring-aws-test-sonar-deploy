package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CseContollerTest {

    @Test
    public void testAddCSE() {
        CseContoller controller = new CseContoller();
        String result = controller.addCSE(10, 20);
        String expected = "THE VALUE IS 30 and  ROLL NUMBER IS 24P35A0555";
        assertEquals(expected, result);
    }
}