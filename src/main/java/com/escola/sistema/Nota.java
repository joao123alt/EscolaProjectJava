package com.escola.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nota {
    private Disciplina disciplina;
    private Aluno aluno;
    private double valor;

    public static List<Nota> notas = new ArrayList<>();

    public Nota(Disciplina disciplina, double valor, Aluno aluno) {
        this.disciplina = disciplina;
        this.valor = valor;
        this.aluno = aluno;

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void adicionarNota(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha a disciplina:");
        for (int i = 0; i < Disciplina.disciplinas.size(); i++) {
            System.out.println((i + 1) + ". " + Disciplina.disciplinas.get(i).getNome());
        }
        int disciplinaIndex = scanner.nextInt() - 1;
        scanner.nextLine(); 
        Disciplina disciplina = Disciplina.disciplinas.get(disciplinaIndex);


        System.out.println("Escolha o aluno:");
        for (int i = 0; i < Aluno.alunos.size(); i++) {
            System.out.println((i + 1) + ". " + Aluno.alunos.get(i).getNome());
        }
        int alunoIndex = scanner.nextInt() - 1;
        scanner.nextLine(); 
        Aluno aluno = Aluno.alunos.get(alunoIndex);

        System.out.print("Digite o valor da nota: ");
        double valorNota = scanner.nextDouble();
        scanner.nextLine(); 


        Nota nota = new Nota(disciplina, valorNota, aluno);
        notas.add(nota);


        System.out.println("Nota adicionada com sucesso!");
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota: " + valorNota);
    }

    public static void alimentaNota() {
        Nota nota = new Nota(Disciplina.disciplinas.get(0), 5.6, Aluno.alunos.get(0));
        Nota nota2 = new Nota(Disciplina.disciplinas.get(1), 6.6, Aluno.alunos.get(0));
        Nota nota3 = new Nota(Disciplina.disciplinas.get(0), 7.8, Aluno.alunos.get(1));
        Nota nota4 = new Nota(Disciplina.disciplinas.get(2), 8.6, Aluno.alunos.get(2));
        Nota nota5 = new Nota(Disciplina.disciplinas.get(0), 9.6, Aluno.alunos.get(2));
        notas.add(nota);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);

    }

}