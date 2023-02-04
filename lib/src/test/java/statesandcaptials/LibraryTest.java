/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package statesandcaptials;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void testStatedAndCapitals() throws IOException {
        StatesAndCapitals classUnderTest = new StatesAndCapitals();
//        assertEquals("" ,classUnderTest.testStatesAndCapitals().toString());
        assertNotNull(classUnderTest.testStatesAndCapitals());
    }
}
