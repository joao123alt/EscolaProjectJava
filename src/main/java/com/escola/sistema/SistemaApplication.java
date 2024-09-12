package com.escola.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaApplication.class, args);
        
        		//MENU
		Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Mostrar professores da instituição.");
            System.out.println("2. Mostrar alunos matriculados.");
            System.out.println("3. Matricular aluno.");
			System.out.println("4. Contratar professor.");
			System.out.println("5. Adicionar disciplina.");
			System.out.println("6- Listar disciplinas ");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
				    Professor.mostrarProfessores();

					break;
                case 2:
					Aluno.mostrarAlunos();
                
                    break;
                
                case 3:
                    Aluno.matricularAluno();            
                    break;
				
                case 4:
                    Professor.contratarProfessor();
            
                    break;
                    case 5:
                    Disciplina.adicionarDisciplina();
                
                    break;	
				case 6:
                    Disciplina.mostrarDisciplinas();
                    
                    break;	
				case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}