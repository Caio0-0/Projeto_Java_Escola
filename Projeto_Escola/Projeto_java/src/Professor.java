import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
     // Atributos
    
    private List<String> disciplinas = new ArrayList<>();
   

    // Construtor
    public Professor(String nome, int idade, String sobrenome, String endereco, String cpf, String dataNascimento, double salario, int cargaHoraria, String setor, int id, int cargaHorariaMaxima) {
        super(nome, idade, sobrenome, endereco, cpf, dataNascimento, salario, cargaHoraria, setor, id);
    }

    // Método para adicionar uma disciplina ao professor
    public void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    // Método para remover uma disciplina do professor
    public void removerDisciplina(String disciplina) {
        disciplinas.remove(disciplina);
    }

    // Método para verificar a carga horária atual do professor
    public int verificarCargaHoraria() {
        return disciplinas.size();
    }
    public List<String> getDisciplinas() {
        return disciplinas;
    }

    
}
