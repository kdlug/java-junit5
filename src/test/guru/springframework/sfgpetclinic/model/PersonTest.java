package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1l, "John", "Doe");

        // then
        // grouped assertions
        assertAll("Test Props Set",
                () ->assertEquals(person.getFirstName(), "John"),
                () ->assertEquals(person.getLastName(), "Doe"));
    }
    @Test
    void groupedAssertionsMsgs() {
        // given
        Person person = new Person(1l, "John", "Doe");

        // then
        // grouped assertions
        assertAll("Test Props Set",
                () ->assertEquals(person.getFirstName(), "John", "First name failed"),
                () ->assertEquals(person.getLastName(), "Doe", "Last name failed"));
    }

    @RepeatedTest(value = 10, name = "{displayName}: {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        // @TODO
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo,RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }
}