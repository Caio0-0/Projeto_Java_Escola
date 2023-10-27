package application;



import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nomeDisciplina;
	
	private double cargaHorario;
	private int maxAluno;
	private List<Double>notas;
	private String nomeProfessor;
	

	 public Disciplina(String nomeDisciplina,Professor professor ,double cargaHorario) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new ArrayList<>();
		this.cargaHorario = cargaHorario;
		this.nomeProfessor = professor.getNome();
	}

	


	
	    public String calcularMedia(Disciplina disciplina) {
	        List<Double> notas = disciplina.notas;
	        if (notas.isEmpty()) {
	            return ""; // Se não houver notas, a média é zero.
	        }

	        double soma = 0;
	      
	        for (Double nota : notas) {
	            // Substitua ',' por '.' e depois converta para double
	            String notaString = nota.toString().replace(",", ".");
	            soma += Double.parseDouble(notaString);
	        }
	        

	        return String.format("%.2f",(soma / notas.size()));
	    }
	
	
	
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDiciplina) {
		this.nomeDisciplina = nomeDiciplina;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public double getCargaHorario() {
		return cargaHorario;
	}

	public void setCargaHorario(double cargaHorario) {
		this.cargaHorario = cargaHorario;
	}

	public int getMaxAluno() {
		return maxAluno;
	}

	public void setMaxAluno(int maxAluno) {
		this.maxAluno += maxAluno;
	}

	public List<Double> getNotas() {
	
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}


	
	
	
	
	
	
	
	
}
