package ListaExercicio;

public class Exercicio11 {
	public void CalculaMedia(double nota1, double nota2, double nota3, double mediaExercicios,
			int numeroIdentificacao) {
		double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

		if (mediaAproveitamento >= 90) {
			System.out.println("Conceito: A");
			System.out.println("Aprovado");
		} else if (mediaAproveitamento >= 75 && mediaAproveitamento < 90) {
			System.out.println("Conceito: B");
			System.out.println("Aprovado");
		} else if (mediaAproveitamento >= 60 && mediaAproveitamento < 75) {
			System.out.println("Conceito: C");
			System.out.println("Aprovado");
		} else if (mediaAproveitamento >= 40 && mediaAproveitamento < 60) {
			System.out.println("Conceito: D");
			System.out.println("Reprovado");
		} else {
			System.out.println("Conceito: E");
			System.out.println("Reprovado");
		}
		
		System.out.println("Número de identificação do aluno: " + numeroIdentificacao);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
	}
}
