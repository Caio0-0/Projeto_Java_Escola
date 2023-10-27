package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Aluno extends Pessoa {
    private List<String> minhasDisciplinas;
    private List<Disciplina> disciplinasAdicionadas;


    public Aluno(String nome, int idade, String endereco, String cpf, String dataNascimento, String matricula, String senha) {
        super(nome, idade, endereco, cpf, dataNascimento, matricula, senha);
        this.minhasDisciplinas = new ArrayList<>();
        this.disciplinasAdicionadas = new ArrayList<>();
 
    }

    public double realizarAvaliacao(Disciplina disciplina) {
        if (minhasDisciplinas.contains(disciplina.getNomeDisciplina())) {
            Random random = new Random();
            double nota = random.nextDouble() * 10; // Gera um número aleatório entre 0 e 10
            disciplina.getNotas().add(nota); // Adiciona a nota à lista de notas da disciplina
            return nota;
        } else {
            System.out.println("O aluno não está matriculado na disciplina " + disciplina.getNomeDisciplina());
            return 0.0; // Retornar 0 em caso de erro.
        }
    }

    public void infoDisciplinas(Disciplina disciplina) {
        System.out.println("Diciplina: " + disciplina.getNomeDisciplina());
        System.out.println("Carga horaria: " + disciplina.getCargaHorario());
        System.out.println("Professor da disciplina: " + disciplina.getNomeProfessor());
    }
    public void addDisciplina(Disciplina disciplina) {
        if (!disciplinasAdicionadas.contains(disciplina)) {
            minhasDisciplinas.add(disciplina.getNomeDisciplina());
            disciplinasAdicionadas.add(disciplina);
        }else {
            System.out.println(getNome() + " já está matriculado na disciplina " + disciplina.getNomeDisciplina());
        }
    }

    public void calcularMedia(Disciplina disciplina) {
        String media = disciplina.calcularMedia(disciplina);
        System.out.println("Média em " + disciplina.getNomeDisciplina() + ": " + media);
    }

    public void removerDisciplina(Disciplina disciplina) {
        if (minhasDisciplinas.contains(disciplina.getNomeDisciplina())) {
            minhasDisciplinas.remove(disciplina.getNomeDisciplina());
            disciplina.setMaxAluno(-1);
            System.out.println(getNome() + " foi removido da disciplina " + disciplina.getNomeDisciplina());
        } else {
            System.out.println(getNome() + " não está matriculado na disciplina " + disciplina.getNomeDisciplina());
        }
    }

    public void verNotasDiciplina(Disciplina disciplina) {
        System.out.println("Notas na disciplina " + disciplina.getNomeDisciplina() + ":");
        List<Double> notas = disciplina.getNotas();
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + String.format("%.2f", notas.get(i)));
        }
    }

    public List<String> getDisciplinas() {
        return minhasDisciplinas;
    }

	public List<Disciplina> getDisciplinasAdicionadas() {
		return disciplinasAdicionadas;
	}

	public void setDisciplinasAdicionadas(List<Disciplina> disciplinasAdicionadas) {
		this.disciplinasAdicionadas = disciplinasAdicionadas;
	}

 
}
