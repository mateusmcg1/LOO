package ListaExercicio;

import java.util.Scanner;

public class Exercicio6Test {
	public static void main(String[] args) {
		Exercicio6 obj = new Exercicio6();

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro valor booleano (true ou false): ");
		boolean valor1 = input.nextBoolean();

		System.out.print("Digite o segundo valor booleano (true ou false): ");
		boolean valor2 = input.nextBoolean();

		obj.Verifica(valor1, valor2);

	}

}
