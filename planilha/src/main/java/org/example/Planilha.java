package org.example;

public class Planilha {
    public static void main(String[] args) {
        // Cria as células da planilha
        Cell cellA1 = new Cell("A1");
        Cell cellA2 = new Cell("A2");
        Cell cellA3 = new Cell("A3");

        // Configura as dependências
        cellA3.addObserver((cellName, changedCellName) -> {
            System.out.println("Reavaliar " + cellName + " por mudança ocorrida em " + changedCellName);
        });
        cellA3.addObserver((cellName, changedCellName) -> {
            System.out.println("Outro observador de " + cellName + " por mudança ocorrida em " + changedCellName);
        });

        // Simula uma alteração em A1
        cellA1.setValue("Novo Valor para A1");

        // Simula uma alteração em A2
        cellA2.setValue("Novo Valor para A2");
    }
}
