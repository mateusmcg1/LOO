package ListaExercicio;

import java.util.Scanner;
public class Exercicio11Test {
	public static void main(String[] args) {
			Exercicio11 obj = new Exercicio11();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de identificação do aluno: ");
	        int numeroIdentificacao = scanner.nextInt();

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        System.out.print("Digite a média dos exercícios: ");
	        double mediaExercicios = scanner.nextDouble();
	        
	        obj.CalculaMedia(nota1, nota2, nota3, mediaExercicios, numeroIdentificacao);

	}
}
