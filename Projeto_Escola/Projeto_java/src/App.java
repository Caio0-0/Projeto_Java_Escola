import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // // Criando uma instância de Pessoa
        Pessoa pessoa = new Pessoa(
            "João", 
            25, 
            "Silva", 
            "123 Main St", 
            "12345678901", 
            "01/01/1990"
        );

        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("-----------------------------------------------");

        // // Criando uma instância de Funcionário
        Funcionario funcionario = new Funcionario(
            "Maria",
            30, 
            "Santos", 
            "456 Elm St",
            "98765432101", 
            "02/02/1985", 
            3000.0, 
            40, 
            "Departamento A", 
            101
        );

        System.out.println("Informações do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println();
        System.out.println("-----------------------------------------------");

        // // Criando uma instância de Gerente
        Gerente gerente = new Gerente(
            "Carlos", 
            40, "Oliveira", 
            "789 Oak St", 
            "55555555501", 
            "03/03/1980", 
            5000.0, 
            40, 
            "Departamento B", 
            201
        );

        System.out.println("Informações do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Setor: " + gerente.getSetor());
        System.out.println();
        System.out.println("-----------------------------------------------");


        // Criando uma instância de Aluno
        Aluno aluno = new Aluno(
            "Ana", 
            20, 
            "Ferreira", 
            "321 Pine St", 
            "11111111101", 
            "04/04/2000", 
            "2021001", 
            1, 
            "Turma A"
        );

        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Período: " + aluno.getPeriodo());
        System.out.println();
        System.out.println("-----------------------------------------------");

        // Realizando uma avaliação para o aluno
        aluno.realizarAv(6);
        aluno.realizarAv(8);

        System.out.println("Avaliação do Aluno:");
        System.out.println("Notas: " + aluno.getNotas());
        aluno.calcularMedia();
        System.out.println("Média: " + aluno.getMedia());
        System.out.println();

        // Criando uma instância de Professor
        Professor professor = new Professor(
            "Laura", 
            35, 
            "Martins", 
            "654 Cedar St", 
            "77777777701", 
            "05/05/1987", 
            4000.0, 
            20, 
            "Departamento C", 
            301, 
            10
        );

        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Setor: " + professor.getSetor());
        System.out.println();

        // Adicionando disciplinas para o professor
        professor.adicionarDisciplina("Matemática");
        professor.adicionarDisciplina("Física");

        System.out.println("Disciplinas do Professor:");
        List<String> disciplinas = professor.getDisciplinas();
        for (String disciplina : disciplinas) {
            System.out.println("Disciplina: " + disciplina);
        }
        System.out.println();

        // Verificando a carga horária atual do professor
        int cargaHorariaAtual = professor.verificarCargaHoraria();
        System.out.println("Carga horária atual do professor: " + cargaHorariaAtual + " horas");


       
    }
}
