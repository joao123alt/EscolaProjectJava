package com.escola.sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Disciplina {
        private String nome;
        private String professor;
        private List<Aluno> alunos;
        public static List<Disciplina> disciplinas= new ArrayList<>();		


        public Disciplina(String nome, String professor) {
            this.nome = nome;
            this.professor = professor;
            this.alunos = new ArrayList<>();
        }

        public Disciplina() {
            
        }

        public String getNome() {
            return nome;
        }

        public String getProfessor() {
            return professor;
        }

        public List<Aluno> getAlunos() {
            return alunos;
        }

        public void adicionarAluno(Aluno aluno) {
            this.alunos.add(aluno);
        }

        //Métodos da classe


    public static void alimentaDisciplina() {
        Disciplina disciplina = new Disciplina("Geografia", "Arnaldo");
        Disciplina disciplina2 = new Disciplina("Matematica", "Rodolfo");
        Disciplina disciplina3 = new Disciplina("Historia", "Arthur");
        disciplinas.add(disciplina);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);



    }
    }