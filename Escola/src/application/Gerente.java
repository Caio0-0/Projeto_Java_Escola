package application;

public class Gerente extends Funcionario {
    // Construtor da classe Gerente
    public Gerente(String nome, int idade, String sobrenome, String endereco, String cpf, String dataNascimento, double salario, int cargaHoraria, String setor, int id) {
        super(nome, idade, sobrenome, endereco, cpf, dataNascimento, salario, cargaHoraria, setor, id);
    }

    // Método para dar aumento de salário a um funcionário
    public void aumentoSalario(Funcionario funcionario, double aumento) {
        double novoSalario = funcionario.getSalario() + aumento;
        funcionario.setSalario(novoSalario);
    }

    // Método para contratar um novo funcionário
    public Funcionario contratarFuncionario(String nome, int idade, String sobrenome, String endereco, String cpf, String dataNascimento, double salario, int cargaHoraria, String setor, int id) {
        return new Funcionario(nome, idade, sobrenome, endereco, cpf, dataNascimento, salario, cargaHoraria, setor, id);
    }

    // Método para demitir um funcionário
    public void demitirFuncionario(Funcionario funcionario) { 
        funcionario.setSalario(0.0);
    }
}
