public class Funcionario extends Pessoa {
     // Atributos privados
     private double salario;
     private int cargaHoraria;
     private String setor;
     private int id;
 
     // Construtor
     public Funcionario(String nome, int idade, String sobrenome, String endereco, String cpf, String dataNascimento, double salario, int cargaHoraria, String setor, int id) {
        super(nome, idade, sobrenome, endereco, cpf, dataNascimento);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.setor = setor;
        this.id = id;
    }
 
     // Métodos para definir os atributos (setters)
     public void setSalario(double salario) {
         this.salario = salario;
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
