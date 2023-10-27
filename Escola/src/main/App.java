package main;


import application.*;



public class App {

	public static void main(String[] args) {
		  Aluno aluno1 = new Aluno("Joje", 20, "Rua A", "123456789", "01/01/2000", "M123", "senha123");
		  Aluno aluno2 = new Aluno("Joje", 20, "Rua A", "123456789", "01/01/2000", "M123", "senha123");
		  Aluno aluno3 = new Aluno("Joje", 20, "Rua A", "123456789", "01/01/2000", "M123", "senha123");
		  Professor professor = new Professor("Doido do grau", 20, "Rua A", "123456789", "01/01/2000", "M123", "senha123",12313,10,"42342",12);
		  Gerente gerente = new Gerente("Maluco beleza", 20, "Rua A", "123456789", "01/01/2000", "M123", "senha123",12313,10,"42342",12);

	        // Criando uma disciplina
		  Disciplina disciplina1 = new Disciplina("Matemática", professor,30);
		  Disciplina disciplina2 = new Disciplina("Portugues", professor,30);



	        aluno1.addDisciplina(disciplina1);
	        aluno1.addDisciplina(disciplina2);
	        
	        aluno2.addDisciplina(disciplina1);
	        aluno3.addDisciplina(disciplina1);
	        

	        
	        aluno1.realizarAvaliacao(disciplina1);
	        aluno1.realizarAvaliacao(disciplina1);
	        aluno1.realizarAvaliacao(disciplina1);
	     
	        aluno1.infoDisciplinas(disciplina1);
	        aluno1.getDisciplinas();
	        System.out.println("Todas as disciplina do aluno:" +aluno1.getDisciplinas()); 
	      
	        aluno1.calcularMedia(disciplina1);
	        
	        System.out.println("quantidade de alunos na diciplina "+disciplina1.getNomeDisciplina()+": "+disciplina1.getMaxAluno());  
	   
	        aluno1.removerDisciplina(disciplina1);

	        // Removendo disciplina
	        aluno1.removerDisciplina(disciplina1);
	        System.out.println("quantidade de alunos na diciplina "+disciplina1.getNomeDisciplina()+": "+disciplina1.getMaxAluno()); 
	        
	        
	        
	        
	}
}
