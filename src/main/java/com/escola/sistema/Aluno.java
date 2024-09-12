package com.escola.sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<Nota> notas = new ArrayList<>();
    private Turno turno;
    private Turma turma;
    private static List<Aluno> alunos = new ArrayList<>();

    // Construtor
    public Aluno(String nome, String cpf, String matricula, Turno turno, Turma turma){
        super(nome, cpf);
        this.matricula = matricula;
        this.notas = new ArrayList<>();

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

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public List<Nota> getNota() {
        return notas;
    }
    
    public void Nota(List<Nota> notas) {
        this.notas = notas;
    }

    public void imprimeFicha(){
        System.out.println(this.nome); 
        System.out.println(this.cpf); 
    }
    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
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

    //Metodos da Classe

    public static void matricularAluno(){

 //Imprime requisições ao usuários
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
                        System.out.println("Escolha a turma do aluno, para: Turma 1 (Digite 1), Turma 2 (Digite 2), Turma 3 (Digite 3)");
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
					
					
					//Instancia um novo aluno 
                
                Aluno aluno = new Aluno(cpfaluno, nomealuno, matriculaaluno, turnoaluno, turmaaluno);
                alunos.add(aluno);
                
                                //Confirmação de matricula
                System.out.println("Aluno matriculado com sucesso!");
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Turno: " + aluno.getTurno());
                System.out.println("Turma: " + aluno.getTurma());

                    
    }
    public static void mostrarAlunos(){
       
            System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
            for (Aluno a: alunos) {
                System.out.println(a.getInfo());
            }
        
    }
    public String getInfo(){
        return "Nome: " + getNome() + ", Cpf: " + getCpf() + ",Matricula: " + getMatricula() + ", Turno: "+ turno +", Turma: "+ turma;
    }     
    
    public void menuAluno(){

    }
    public void verDados(){

    }
    public void verBoletim(){

    }
}