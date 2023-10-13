package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma célula da planilha
public class Cell {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public Cell(String name) {
        this.name = name;
    }

    // Adiciona um observador a esta célula
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Simula uma mudança na célula
    public void setValue(String value) {
        // Simule a mudança de valor na célula
        String oldValue = getValue();
        // Notifica todos os observadores
        for (Observer observer : observers) {
            observer.update(this.name, oldValue);
        }
    }

    // Obtém o valor atual da célula
    public String getValue() {
        // Implemente a lógica para obter o valor da célula
        return "Valor da Célula " + this.name;
    }
}
