package application;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	 // Atributos privados
    private List<Double> notas = new ArrayList<>();;
    private double media;
    private String matricula;
    private List<String> disciplinas = new ArrayList<>();
    private int periodo;
    private String turma;

    // Construtor
    public Aluno(String nome, int idade, String sobrenome, String endereco, String cpf, String dataNascimento, String matricula, int periodo, String turma) {
        super(nome,idade,sobrenome,endereco,cpf,dataNascimento);
        this.matricula = matricula;
        this.periodo = periodo;
        this.turma = turma;
    }

    // Método para realizar uma avaliação (prova, teste, etc.)
    public void realizarAv(double nota) {
        notas.add(nota);
    }

    // Método para calcular a média do aluno
    public double calcularMedia() {
        int tamanho = notas.size();
        double somaNota =0;
        for(Double notas:notas){
            somaNota += notas; 
        }
         media = (somaNota/tamanho);
        return media;
    }

    // Método para definir as disciplinas do aluno
    public void setDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    // Método para remover uma disciplina do aluno
    public void removeDisciplina(String disciplina) {
        disciplinas.remove(disciplina);
    }

    // Getters para acessar os atributos privados
    public List<Double> getNotas() {
        return notas;
    }

    public double getMedia() {
        calcularMedia();
        return media;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getTurma() {
        return turma;
    }
}
