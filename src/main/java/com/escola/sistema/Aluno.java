package com.escola.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa {

    private String matricula;
    private Turno turno;
    private Turma turma;
    private HashMap<String, Double> notas = new HashMap<>();
     static List<Aluno> alunos = new ArrayList<>();

    

    // Construtor
    public Aluno(String nome, String cpf, String matricula, Turno turno, Turma turma) {
        super(nome, cpf);
        this.matricula = matricula;
        this.turma = turma;
        this.turno = turno;

    }
    // Getts e sets da classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void imprimeFicha() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // Metodos da Classe

    public static void matricularAluno() {

        // Imprime requisições ao usuários
        Scanner matricula = new Scanner(System.in);

        System.out.println("Digite o CPF do aluno:");
        String cpfaluno = matricula.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nomealuno = matricula.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        String matriculaaluno = matricula.nextLine();

        Turno turnoaluno = null;
        while (turnoaluno == null) {
            System.out.println("Escolha o turno do aluno, para: Manhã (Digite 1), Tarde (Digite 2), Noite (Digite 3)");
            int opcaoturnoaluno = matricula.nextInt();
            switch (opcaoturnoaluno) {
                case 1:
                    turnoaluno = Turno.MANHA;
                    break;
                case 2:
                    turnoaluno = Turno.TARDE;
                    break;
                case 3:
                    turnoaluno = Turno.NOITE;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        Turma turmaaluno = null;
        while (turmaaluno == null) {
            System.out.println(
                    "Escolha a turma do aluno, para: Turma 1 (Digite 1), Turma 2 (Digite 2), Turma 3 (Digite 3)");
            int opcaoturmaaluno = matricula.nextInt();
            switch (opcaoturmaaluno) {
                case 1:
                    turmaaluno = Turma.TURMA1;
                    break;
                case 2:
                    turmaaluno = Turma.TURMA2;
                    break;
                case 3:
                    turmaaluno = Turma.TURMA3;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        // Instancia um novo aluno

        Aluno aluno = new Aluno(cpfaluno, nomealuno, matriculaaluno, turnoaluno, turmaaluno);
        alunos.add(aluno);

        // Confirmação de matricula
        System.out.println("Aluno matriculado com sucesso!");
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Turno: " + aluno.getTurno());
        System.out.println("Turma: " + aluno.getTurma());

    }

    public static void mostrarAlunos() {

        System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
        for (Aluno a : alunos) {
            System.out.println(a.getInfo());
        }

    }

    public String getInfo() {
        return "Nome: " + getNome() + ", Cpf: " + getCpf() + ",Matricula: " + getMatricula() + ", Turno: " + turno
                + ", Turma: " + turma;
    }

    public static void removerAluno() {
        for (int i = 0; i < alunos.size(); i++) {
            Pessoa p = alunos.get(i);

            if (p.getNome().equals("Pedro")) // Provavel uso em busca por aluno, dps

            {

                alunos.remove(p);

                break;
            }
        }

    }

    public static void atualizarCadastro() {

    }

    // Métodos Aluno menu
    public void menuAluno(){
    Scanner menuAluno = new Scanner(System.in);    
    System.out.println("MENU ALUNO:");
    
    System.out.println("1. Atualização cadastral");

    System.out.println("2. Listar Cadastro");

    System.out.println("3. Ver notas");

    System.out.println("0. Sair ");
    int opcao = menuAluno.nextInt();
    
    switch (opcao) {
        case 1:
                             
            break;
        case 2:

            break;
        case 3:
    
            break;
        case 0:
            System.out.println("Saindo...");
            break;
        default:
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            break;
    }
while(opcao!=0);

        menuAluno.close();

    }

    public void verDados(){

    }

    public void verBoletim(){

    }

    public static void alimentaAluno(){
        Aluno aluno = new Aluno("Joao", "1111111111", "001", Turno.MANHA, Turma.TURMA1);
    }

    // Adicionar notas

    public void adicionarNota(String materia, Double nota){
        notas.put(materia, nota);
    }

    public void listarNotas(){
            System.out.println("Nota do aluno "+ getNome() + ":");
            for(Map.Entry<String, Double> entry:notas.entrySet()){
                System.out.println("Matéria: "+ entry.getKey() + "Nota: " + entry.getValue());    
            }
    }
    public Map<String, Double> getNotas(){
        return notas;        
    }
}



