package ListaExercicio;

import java.util.Scanner;

public class Exercicio5Test {
	public static void main(String[] args) {
		Exercicio5 obj = new Exercicio5();

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = input.nextInt();

		obj.Condicao(numero);

	}
}
