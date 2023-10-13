package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverPatternTest {

    @Test
    void testObserverPattern() {
        Cell cellA1 = new Cell("A1");
        Cell cellA2 = new Cell("A2");
        Cell cellA3 = new Cell("A3");

        // Variáveis para capturar as saídas dos observadores
        String[] outputs = new String[2];

        // Configuração de observadores

        cellA3.addObserver((cellName, changedCellName) -> {
            outputs[0] = "Reavaliar " + cellName + " por mudança ocorrida em " + changedCellName;
        });
        cellA3.addObserver((cellName, changedCellName) -> {
            outputs[1] = "Outro observador de " + cellName + " por mudança ocorrida em " + changedCellName;
        });

        // Simula uma alteração em A1
        cellA1.setValue("Novo Valor para A1");
        assertEquals("Reavaliar A3 por mudança ocorrida em A1", outputs[0]);
        assertEquals("Outro observador de A3 por mudança ocorrida em A1", outputs[1]);

        // Simula uma alteração em A2
        cellA2.setValue("Novo Valor para A2");
        assertEquals("Reavaliar A3 por mudança ocorrida em A2", outputs[0]);
        assertEquals("Outro observador de A3 por mudança ocorrida em A2", outputs[1]);
    }

}