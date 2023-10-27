package application;

public class Gerente extends Funcionario {
    // Construtor da classe Gerente
  


	public Gerente(String nome, int idade, String endereco, String cpf, String dataNascimento, String matricula,
			String senha, double salario, int cargaHoraria, String setor, int id) {
		super(nome, idade, endereco, cpf, dataNascimento, matricula, senha, salario, cargaHoraria, setor, id);
		setEstado(true);
	}

	// Método para dar aumento de salário a um funcionário
    public void aumentoSalario(Funcionario funcionario, double aumento) {
    	if(funcionario.isEstado()) {
    		double novoSalario = funcionario.getSalario() + aumento;
            funcionario.setSalario(novoSalario);
    	}else {
    		
    		System.out.println("Não pode almentar seu salario porque o funcionario foi demitido");
    	}
        
    }

    // Método para contratar um novo funcionário
    public void contratarFuncionario(Funcionario funcionario) {
    	funcionario.setEstado(true);
    	System.out.println(funcionario.getNome() + "Foi contratado.");
    }

    // Método para demitir um funcionário
    public void demitirFuncionario(Funcionario funcionario) { 
        funcionario.setEstado(false);
        funcionario.setSalario(0.0);
        System.out.println(funcionario.getNome()+" Foi demitido");
    }
}
