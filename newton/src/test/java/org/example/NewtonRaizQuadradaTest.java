package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NewtonRaizQuadradaTest {

    // Teste de caso simples com número positivo
    @Test
    public void testSquareRootPositiveNumber() {
        double result = NewtonRaizQuadrada.calculateSquareRoot(4.0, 0.001);
        assertEquals(2.0, result, 0.001); // Espera-se que a raiz quadrada de 4 seja 2
    }

    // Teste para um número negativo
    @Test
    public void testSquareRootNegativeNumber() {
        try {
            NewtonRaizQuadrada.calculateSquareRoot(-4.0, 0.001);
        } catch (IllegalArgumentException e) {
            assertEquals("A raiz quadrada de números negativos não é suportada.", e.getMessage()); // Espera-se uma IllegalArgumentException
        }
    }

    // Teste de caso com o número zero
    @Test
    public void testSquareRootZero() {
        double result = NewtonRaizQuadrada.calculateSquareRoot(0.0, 0.001);
        assertEquals(0.0, result, 0.001); // Espera-se que a raiz quadrada de 0 seja 0
    }

    // Teste de precisão com y menor
    @Test
    public void testSquareRootPrecision() {
        double result = NewtonRaizQuadrada.calculateSquareRoot(10.0, 0.0001);
        assertEquals(3.1622, result, 0.0001);
    }

}