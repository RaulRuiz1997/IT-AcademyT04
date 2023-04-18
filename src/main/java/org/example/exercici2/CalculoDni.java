package org.example.exercici2;

public class CalculoDni {

    private char[] lletresDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public char calcularLletraDni(int numeroDni) throws DniMalFormulatException {

        // Comprobamos si el número es negativo o 0 lanzamos una excepción
        if (numeroDni <= 0) {
            throw new DniMalFormulatException("El DNI tiene que ser un número coherente");
        }

        // Comprobamos si el length es diferente a 8 lanzamos una excepción
        if (String.valueOf(numeroDni).length() != 8) {
            throw new DniMalFormulatException("El DNI debe tener 8 números");
        }

        // Para devolver la letra se hace el número de DNI dividido entre 23 y se usa el resto para encontrar la posición
        // dentro del array
        return lletresDni[numeroDni % 23];

    }

}
