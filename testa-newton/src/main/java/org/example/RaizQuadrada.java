package org.example;

import java.util.function.Function;

public class RaizQuadrada implements Function<Double, Double> {
    @Override
    public Double apply(Double x) {
        if (x < 0) {
            throw new IllegalArgumentException("A raiz quadrada de números negativos não é suportada.");
        }

        if (x == 0) {
            return 0.0;
        }

        double guess = x / 2; // Começa com uma estimativa inicial
        while (Math.abs(guess * guess - x) > 1e-6) {
            guess = 0.5 * (guess + x / guess); // Melhora a estimativa
        }

        return guess;
    }
}