package application;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
 // Atributos
    
    private List<String> disciplinas = new ArrayList<>();
	private List<String>minhasDisciplinas;

    // Construtor
   

    // Método para adicionar uma disciplina ao professor
    public void addDisciplina(Disciplina disciplina) {
        if (!minhasDisciplinas.contains(disciplina.getNomeDisciplina())) {
            minhasDisciplinas.add(disciplina.getNomeDisciplina());
            disciplina.adicionarProfessor(this); // Adiciona o professor à disciplina
        }
    }
    
    

    public Professor(String nome, int idade, String endereco, String cpf, String dataNascimento, String matricula,
			String senha, double salario, int cargaHoraria,String setor,int id) {
		super(nome, idade, endereco, cpf, dataNascimento, matricula, senha, salario, cargaHoraria, setor, id);
	}



	// Método para remover uma disciplina do professor
    public void removerDisciplina(Disciplina disciplina) {
        if (minhasDisciplinas.contains(disciplina.getNomeDisciplina())) {
            minhasDisciplinas.remove(disciplina.getNomeDisciplina());
            disciplina.removerProfessor(this); // Remove o aluno da disciplina
        }
    }

    // Método para verificar a carga horária atual do professor
    public int verificarCargaHoraria() {
        return disciplinas.size();
    }
    public List<String> getDisciplinas() {
        return disciplinas;
    }
}
