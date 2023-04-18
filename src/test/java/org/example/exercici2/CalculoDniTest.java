package org.example.exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    CalculoDni calculoDni = new CalculoDni();

    @Test
    void dniNumber11111111ShouldReturnH() throws DniMalFormulatException {
        assertEquals('H', calculoDni.calcularLletraDni(11111111));
    }

    @Test
    void dniNumber22222222ShouldReturnJ() throws DniMalFormulatException {
        assertEquals('J', calculoDni.calcularLletraDni(22222222));
    }

    @Test
    void dniNumber33333333ShouldReturnP() throws DniMalFormulatException {
        assertEquals('P', calculoDni.calcularLletraDni(33333333));
    }

    @Test
    void dniNumber44444444ShouldReturnA() throws DniMalFormulatException {
        assertEquals('A', calculoDni.calcularLletraDni(44444444));
    }

    @Test
    void dniNumber55555555ShouldReturnK() throws DniMalFormulatException {
        assertEquals('K', calculoDni.calcularLletraDni(55555555));
    }

    @Test
    void dniNumber66666666ShouldReturnQ() throws DniMalFormulatException {
        assertEquals('Q', calculoDni.calcularLletraDni(66666666));
    }

    @Test
    void dniNumber77777777ShouldReturnB() throws DniMalFormulatException {
        assertEquals('B', calculoDni.calcularLletraDni(77777777));
    }

    @Test
    void dniNumber88888888ShouldReturnY() throws DniMalFormulatException {
        assertEquals('Y', calculoDni.calcularLletraDni(88888888));
    }

    @Test
    void dniNumber99999999ShouldReturnR() throws DniMalFormulatException {
        assertEquals('R', calculoDni.calcularLletraDni(99999999));
    }

    @Test
    void dniNumber46728394ShouldReturnF() throws DniMalFormulatException {
        assertEquals('F', calculoDni.calcularLletraDni(46728394));
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