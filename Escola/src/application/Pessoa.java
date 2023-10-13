package application;

public class Pessoa {
	// Atributos privados
    private String nome;
    private int idade;
    private String sobrenome;
    private String endereco;
    private String cpf;
    private String dataNascimento;

    public Pessoa(String nome, int idade, String sobrenome, String endereco, String cpf, String dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Métodos para definir os atributos (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Métodos para obter os atributos (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
