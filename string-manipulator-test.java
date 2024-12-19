// src/test/java/com/javaexercises/strings/StringManipulatorTest.java

package com.javaexercises.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    private StringManipulator manipulator;
    
    @BeforeEach
    void setUp() {
        manipulator = new StringManipulator();
    }
    
    @Test
    void testToUpperCase() {
        assertEquals("HELLO WORLD", manipulator.toUpperCase("Hello World"));
        assertEquals("", manipulator.toUpperCase(""));
        assertEquals("123", manipulator.toUpperCase("123"));
        assertNull(manipulator.toUpperCase(null));
    }
    
    @Test
    void testCountWords() {
        assertEquals(2, manipulator.countWords("Hello World"));
        assertEquals(1, manipulator.countWords("Hello"));
        assertEquals(3, manipulator.countWords("This is test"));
        assertEquals(0, manipulator.countWords(""));
        assertEquals(0, manipulator.countWords("   "));
        assertEquals(0, manipulator.countWords(null));
    }
    
    @Test
    void testReverseWords() {
        assertEquals("olleH dlroW", manipulator.reverseWords("Hello World"));
        assertEquals("olleH", manipulator.reverseWords("Hello"));
        assertEquals("sihT si tset", manipulator.reverseWords("This is test"));
        assertEquals("", manipulator.reverseWords(""));
        assertEquals("", manipulator.reverseWords("   "));
        assertNull(manipulator.reverseWords(null));
    }
}
