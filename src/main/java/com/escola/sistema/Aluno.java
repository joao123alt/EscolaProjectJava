package com.escola.sistema;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private List<Nota> notas;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf); 
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }

    public List<Nota> getNotas() {
        return notas;
    }
}