package ListaExercicio;

import java.util.Scanner;

public class Exercicio9Test {
	public static void main(String[] args) {
		Exercicio9 obj = new Exercicio9();

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o peso (em kg): ");
		double peso = input.nextDouble();

		System.out.print("Digite a altura (em metros): ");
		double altura = input.nextDouble();
		
		obj.CalculaIMC(altura, peso);
	}

}
