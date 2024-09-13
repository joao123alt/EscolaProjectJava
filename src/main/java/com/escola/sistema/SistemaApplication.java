package com.escola.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SistemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaApplication.class, args);

        Aluno.alimentaAluno();
        Disciplina.alimentaDisciplina();
        Nota.alimentaNota();

        int tentativas = 3;
        Professor professorLogado = null;
        Aluno alunoLogado = null;


       
    while (tentativas>0) {
        Scanner telaInicial = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("----TELA INICIAL----");
            System.out.println("Escolha como prosseguir:");
            System.out.println("1- Efetuar Login");
            System.out.println("2- Sair");
            opcao = telaInicial.nextInt();

            switch (opcao) {
                case 1:

                    // Login
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("=====Login=====");
                    System.out.println("Insira o seu usuario: ");
                    String user = scanner.nextLine();
                    System.out.println("Insira a sua senha: ");
                    String password = scanner.nextLine();

                   
                    
                    boolean loginSuccessfulAluno = false;
                    boolean loginSuccessfulProfessor = false;

                    for (Aluno aluno : Aluno.alunos) {
                        if (aluno.getLogin().equals(user) && aluno.getSenha().equals(password)) {
                            loginSuccessfulAluno = true;
                            alunoLogado = aluno;
                        }

                    }

                    for (Professor professor : Professor.professores) {
                        if (professor.getLogin().equals(user) && professor.getSenha().equals(password)) {
                            loginSuccessfulProfessor = true;
                            professorLogado = professor;

                        } 
                    }



                    if (loginSuccessfulAluno == true) {
                        System.out.println("Seja bem vindo!");
                        Aluno.menuAluno();
                    } else if (loginSuccessfulProfessor == true) {
                        System.out.println("Seja bem vindo!");
                        Professor.menuProfessor();
                    } else {
                        System.out.println("Usuário ou senha incorretos.");
                    }
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }

        } while (opcao != 0);
    
        
    }
    
    }

    public boolean autorizarCredenciais(){

    }
}