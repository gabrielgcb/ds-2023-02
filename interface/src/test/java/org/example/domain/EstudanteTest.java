package org.example.domain;

import org.example.util.ComparadorEstudante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EstudanteTest {

    private List<Estudante> estudantes;

    @BeforeEach
    void setUp() {
        // Inicialize a lista de estudantes com alguns dados de teste
        estudantes = new ArrayList<>();
        estudantes.add(new Estudante("João", "Silva", 20, 8.5, 7.8));
        estudantes.add(new Estudante("Maria", "Santos", 22, 9.0, 8.2));
        estudantes.add(new Estudante("Carlos", "Ferreira", 19, 7.0, 9.8));
        estudantes.add(new Estudante("Ana", "Machado", 21, 8.0, 7.5));
        estudantes.add(new Estudante("Pedro", "Oliveira", 23, 6.5, 6.9));
        estudantes.add(new Estudante("Sofia", "Rodrigues", 18, 8.8, 8.4));
        estudantes.add(new Estudante("Luís", "Almeida", 20, 7.2, 7.3));
    }

    @Test
    void testaOrdenacaoPorNome() {
        estudantes.sort(ComparadorEstudante.getComparadorPorNome());

        assertEquals("Ana Machado (Idade: 21, Nota: 8.0, Média: 7.5)", estudantes.get(0).toString());
        assertEquals("Carlos Ferreira (Idade: 19, Nota: 7.0, Média: 9.8)", estudantes.get(1).toString());
        assertEquals("João Silva (Idade: 20, Nota: 8.5, Média: 7.8)", estudantes.get(2).toString());
        assertEquals("Luís Almeida (Idade: 20, Nota: 7.2, Média: 7.3)", estudantes.get(3).toString());
        assertEquals("Maria Santos (Idade: 22, Nota: 9.0, Média: 8.2)", estudantes.get(4).toString());
        assertEquals("Pedro Oliveira (Idade: 23, Nota: 6.5, Média: 6.9)", estudantes.get(5).toString());
        assertEquals("Sofia Rodrigues (Idade: 18, Nota: 8.8, Média: 8.4)", estudantes.get(6).toString());

        // Verifique se a lista permanece inalterada quando já está ordenada
        List<Estudante> copiaOrdenada = new ArrayList<>(estudantes);
        estudantes.sort(ComparadorEstudante.getComparadorPorNome());
        assertEquals(copiaOrdenada, estudantes);
    }

    @Test
    void testaOrdenacaoPorSobrenome() {
        estudantes.sort(ComparadorEstudante.getComparadorPorSobrenome());

        assertEquals("Luís Almeida (Idade: 20, Nota: 7.2, Média: 7.3)", estudantes.get(0).toString());
        assertEquals("Carlos Ferreira (Idade: 19, Nota: 7.0, Média: 9.8)", estudantes.get(1).toString());
        assertEquals("Ana Machado (Idade: 21, Nota: 8.0, Média: 7.5)", estudantes.get(2).toString());
        assertEquals("Pedro Oliveira (Idade: 23, Nota: 6.5, Média: 6.9)", estudantes.get(3).toString());
        assertEquals("Sofia Rodrigues (Idade: 18, Nota: 8.8, Média: 8.4)", estudantes.get(4).toString());
        assertEquals("Maria Santos (Idade: 22, Nota: 9.0, Média: 8.2)", estudantes.get(5).toString());
        assertEquals("João Silva (Idade: 20, Nota: 8.5, Média: 7.8)", estudantes.get(6).toString());

        // Verifique se a lista permanece inalterada quando já está ordenada
        List<Estudante> copiaOrdenada = new ArrayList<>(estudantes);
        estudantes.sort(ComparadorEstudante.getComparadorPorSobrenome());
        assertEquals(copiaOrdenada, estudantes);
    }

    @Test
    void testaOrdenacaoPorIdade() {
        estudantes.sort(ComparadorEstudante.getComparadorPorIdade());

        assertEquals("Sofia Rodrigues (Idade: 18, Nota: 8.8, Média: 8.4)", estudantes.get(0).toString());
        assertEquals("Carlos Ferreira (Idade: 19, Nota: 7.0, Média: 9.8)", estudantes.get(1).toString());
        assertEquals("João Silva (Idade: 20, Nota: 8.5, Média: 7.8)", estudantes.get(2).toString());
        assertEquals("Luís Almeida (Idade: 20, Nota: 7.2, Média: 7.3)", estudantes.get(3).toString());
        assertEquals("Ana Machado (Idade: 21, Nota: 8.0, Média: 7.5)", estudantes.get(4).toString());
        assertEquals("Maria Santos (Idade: 22, Nota: 9.0, Média: 8.2)", estudantes.get(5).toString());
        assertEquals("Pedro Oliveira (Idade: 23, Nota: 6.5, Média: 6.9)", estudantes.get(6).toString());

        // Verifique se a lista permanece inalterada quando já está ordenada
        List<Estudante> copiaOrdenada = new ArrayList<>(estudantes);
        estudantes.sort(ComparadorEstudante.getComparadorPorIdade());
        assertEquals(copiaOrdenada, estudantes);
    }

    @Test
    void testaOrdenacaoPorNota() {
        estudantes.sort(ComparadorEstudante.getComparadorPorNota());

        assertEquals("Pedro Oliveira (Idade: 23, Nota: 6.5, Média: 6.9)", estudantes.get(0).toString());
        assertEquals("Carlos Ferreira (Idade: 19, Nota: 7.0, Média: 9.8)", estudantes.get(1).toString());
        assertEquals("Luís Almeida (Idade: 20, Nota: 7.2, Média: 7.3)", estudantes.get(2).toString());
        assertEquals("Ana Machado (Idade: 21, Nota: 8.0, Média: 7.5)", estudantes.get(3).toString());
        assertEquals("João Silva (Idade: 20, Nota: 8.5, Média: 7.8)", estudantes.get(4).toString());
        assertEquals("Sofia Rodrigues (Idade: 18, Nota: 8.8, Média: 8.4)", estudantes.get(5).toString());
        assertEquals("Maria Santos (Idade: 22, Nota: 9.0, Média: 8.2)", estudantes.get(6).toString());

        // Verifique se a lista permanece inalterada quando já está ordenada
        List<Estudante> copiaOrdenada = new ArrayList<>(estudantes);
        estudantes.sort(ComparadorEstudante.getComparadorPorNota());
        assertEquals(copiaOrdenada, estudantes);
    }

    @Test
    void testaOrdenacaoPorMedia() {
        estudantes.sort(ComparadorEstudante.getComparadorPorMedia());

        assertEquals("Pedro Oliveira (Idade: 23, Nota: 6.5, Média: 6.9)", estudantes.get(0).toString());
        assertEquals("Luís Almeida (Idade: 20, Nota: 7.2, Média: 7.3)", estudantes.get(1).toString());
        assertEquals("Ana Machado (Idade: 21, Nota: 8.0, Média: 7.5)", estudantes.get(2).toString());
        assertEquals("João Silva (Idade: 20, Nota: 8.5, Média: 7.8)", estudantes.get(3).toString());
        assertEquals("Maria Santos (Idade: 22, Nota: 9.0, Média: 8.2)", estudantes.get(4).toString());
        assertEquals("Sofia Rodrigues (Idade: 18, Nota: 8.8, Média: 8.4)", estudantes.get(5).toString());
        assertEquals("Carlos Ferreira (Idade: 19, Nota: 7.0, Média: 9.8)", estudantes.get(6).toString());

        // Verifique se a lista permanece inalterada quando já está ordenada
        List<Estudante> copiaOrdenada = new ArrayList<>(estudantes);
        estudantes.sort(ComparadorEstudante.getComparadorPorMedia());
        assertEquals(copiaOrdenada, estudantes);
    }
}
