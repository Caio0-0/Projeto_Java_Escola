package application;

public class Funcionario extends Pessoa {
	// Atributos privados
    private double salario;
    private int cargaHoraria;
    private String setor;
    private int id;
    private boolean estado;

    // Construtor
  

    // Métodos para definir os atributos (setters)
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, int idade, String endereco, String cpf, String dataNascimento, String matricula,
			String senha, double salario, int cargaHoraria, String setor, int id) {
		super(nome, idade, endereco, cpf, dataNascimento, matricula, senha);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.setor = setor;
		this.id = id;
		this.estado = false;
	}
    
    
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // Métodos para obter os atributos (getters)
    public double getSalario() {
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getSetor() {
        return setor;
    }

    public int getId() {
        return id;
    }
}
