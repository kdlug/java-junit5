package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

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
}