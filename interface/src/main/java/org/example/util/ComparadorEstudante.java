package org.example.util;

import org.example.domain.Estudante;

import java.util.Comparator;

public class ComparadorEstudante {
    public static Comparator<Estudante> getComparadorPorNome() {
        return Comparator.comparing(Estudante::getNome);
    }

    public static Comparator<Estudante> getComparadorPorSobrenome() {
        return Comparator.comparing(Estudante::getSobrenome);
    }

    public static Comparator<Estudante> getComparadorPorIdade() {
        return Comparator.comparing(Estudante::getIdade);
    }

    public static Comparator<Estudante> getComparadorPorNota() {
        return Comparator.comparingDouble(Estudante::getNota);
    }

    public static Comparator<Estudante> getComparadorPorMedia() {
        return Comparator.comparingDouble(Estudante::getMedia);
    }
}
