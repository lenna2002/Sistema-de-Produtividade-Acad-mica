package objetos;

public class Orientacoes extends ProducoesAcademicas {
	private int professor;
	
	public Orientacoes(String titulo, int matricula, int professor) {
		this.setTitulo(titulo);
		setProjetoAssociado(matricula);
		this.professor = professor;
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		this.professor = professor;
	}
}
