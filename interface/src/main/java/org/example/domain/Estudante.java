package org.example.domain;

public class Estudante {
    private String nome;
    private String sobrenome;
    private int idade;
    private double nota;
    private double media;

    public Estudante(String nome, String sobrenome, int idade, double nota, double media) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.nota = nota;
        this.media = media;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " " +
                "(Idade: " + idade +
                ", Nota: " + nota +
                ", Média: " + media + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

}