package org.example.exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    CalculoDni calculoDni = new CalculoDni();
    static int posicio = 0;

    @ParameterizedTest
    @ValueSource(ints = {11111111, 22222222, 33333333, 44444444, 55555555, 66666666, 77777777, 88888888, 99999999, 46728394})
    void arrayDniNumbersShouldBeCorrect(int IDnumber) throws DniMalFormulatException {
        char[] lletresDni = new char[]{'H', 'J', 'P', 'A', 'K', 'Q', 'B', 'Y', 'R', 'F'};
        assertEquals(lletresDni[posicio], calculoDni.calcularLletraDni(IDnumber));
        posicio++;
    }

    @Test
    void dniNumberWithLengthDifferent8ShouldThrowException() {
        assertThrows(DniMalFormulatException.class, () -> calculoDni.calcularLletraDni(1));
    }

    @Test
    void negativeDniNumberShouldThrowException() {
        assertThrows(DniMalFormulatException.class, () -> calculoDni.calcularLletraDni(-11111111));
    }

}