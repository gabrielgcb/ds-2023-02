package org.example;

public class NewtonRaizQuadrada {
    public static double calculateSquareRoot(double x, double y) {
        if (x < 0) {
            throw new IllegalArgumentException("A raiz quadrada de números negativos não é suportada.");
        }

        if (x == 0) {
            return 0;
        }

        double guess = x / 2; // Começa com uma estimativa inicial
        while (Math.abs(guess * guess - x) > y) {
            guess = 0.5 * (guess + x / guess); // Melhora a estimativa
        }

        return guess;
    }
}
