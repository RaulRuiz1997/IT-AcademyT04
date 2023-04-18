package org.example;

import org.example.exercici1.InsertirMesos;
import org.example.exercici2.CalculoDni;
import org.example.exercici2.DniMalFormulatException;
import org.example.exercici3.ArrayIndexOutOfBoundsExc;

public class Main {

    public static void main(String[] args) {

        // Exercici 1 --------------------------------------------------------------------------------------------------

        InsertirMesos insertirMesos = new InsertirMesos();

        System.out.println(insertirMesos.insertirMesos());

        // Exercici 2 --------------------------------------------------------------------------------------------------

        CalculoDni calculoDni = new CalculoDni();

        try {

            System.out.println(calculoDni.calcularLletraDni(77777777));

        } catch (DniMalFormulatException e) {

            System.out.println(e.getMessage());

        }

        // Exercici 3 --------------------------------------------------------------------------------------------------

        ArrayIndexOutOfBoundsExc arrayIndexOutOfBoundsExc = new ArrayIndexOutOfBoundsExc();

        arrayIndexOutOfBoundsExc.metodeQueLlencaUnArrayIndexOutOfBoundsException();

    }

}