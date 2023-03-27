package org.example.exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertirMesosTest {

    InsertirMesos insertirMesos = new InsertirMesos();

    @Test
    void shouldHaveTwelvePositions() {

        assertEquals(12, insertirMesos.insertirMesos().size());

    }

    @Test
    void shouldNotBeNull() {

        assertNotNull(insertirMesos.insertirMesos());

    }

    @Test
    void positionSevenShouldReturnAgost() {

        assertEquals("agost", insertirMesos.insertirMesos().get(7));

    }

}