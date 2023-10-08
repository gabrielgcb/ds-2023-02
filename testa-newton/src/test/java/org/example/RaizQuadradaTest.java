package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RaizQuadradaTest {

    @Test
    void testCalculateSquareRoot_PositiveInput() {
        RaizQuadrada newton = new RaizQuadrada();
        double result = newton.apply(25.0);
        assertEquals(5.0, result, 1e-6); // Verifica se a raiz quadrada de 25 é aproximadamente 5 com uma precisão de 1e-6.
    }

    @Test
    void testCalculateSquareRoot_ZeroInput() {
        RaizQuadrada newton = new RaizQuadrada();
        double result = newton.apply(0.0);
        assertEquals(0.0, result, 1e-6); // Verifica se a raiz quadrada de 0 é aproximadamente 0 com uma precisão de 1e-6.
    }

    @Test
    void testCalculateSquareRoot_NegativeInput() {
        RaizQuadrada newton = new RaizQuadrada();
        assertThrows(IllegalArgumentException.class, () -> {
            newton.apply(-5.0); // Deve lançar uma exceção IllegalArgumentException para entrada negativa.
        });
    }
}

