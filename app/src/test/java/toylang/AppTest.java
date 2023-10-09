/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package toylang;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        // Unit test for program1
        App.newProgram(App.program1());
        // Unit test for program2
        App.newProgram(App.program2());
        // Unit test for program3
        App.newProgram(App.program3());
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}