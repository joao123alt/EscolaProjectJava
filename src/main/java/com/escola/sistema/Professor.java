package com.escola.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {
    private String materia;

    private String login;
    private String senha;

    public static List<Professor> professores = new ArrayList<>();

    // Construtor professor
    public Professor(String materia, String nome, String cpf) {
        super(nome, cpf);
        this.materia = materia;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Getters and Sets Professor
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    // Métodos da Classe

    public static void contratarProfessor() {
        // Requisições ao usuario
        Scanner scannerprofessor = new Scanner(System.in);
        System.out.println("==========PROCESSO DE CONTRATAÇÃO==========");
        System.out.print("Digite o CPF do professor: ");
        String cpfprocessor = scannerprofessor.nextLine();
        System.out.print("Digite o nome do professor: ");
        String nomeprofessor = scannerprofessor.nextLine();
        System.out.print("Digite a materia do professor: ");
        String materiaprofessor = scannerprofessor.nextLine();

        // Instncia um novo professor
        Professor professor = new Professor(cpfprocessor, nomeprofessor, materiaprofessor);
        professores.add(professor);

        // Confirma que deu certo

        System.out.println("Professor contratado com sucesso!");
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Nome: " + professor.getMateria());
    }

    public static void mostrarProfessores() {

        System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
        for (Professor p : professores) {
            System.out.println(p.getInfo());
        }

    }

    public String getInfo() {
        return "Nome: " + getNome() + ", Cpf: " + getCpf() + ", Matéria: " + getMateria();
    }

    public static void menuProfessor() {
        Scanner menuProfessor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU PROFESSOR:");
            System.out.println("1. Adicionar nota");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = menuProfessor.nextInt();

            switch (opcao) {
                case 1:
                    Nota.adicionarNota();
                    break;
        
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 0);

        menuProfessor.close();
    }

}
