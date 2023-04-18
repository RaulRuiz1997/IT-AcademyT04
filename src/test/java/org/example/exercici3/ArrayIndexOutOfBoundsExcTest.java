package org.example.exercici3;

import org.example.exercici2.DniMalFormulatException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexOutOfBoundsExcTest {

    ArrayIndexOutOfBoundsExc arrayIndexOutOfBoundsExc = new ArrayIndexOutOfBoundsExc();

    @Test
    void methodShouldThrowArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayIndexOutOfBoundsExc.metodeQueLlencaUnArrayIndexOutOfBoundsException());
    }

}