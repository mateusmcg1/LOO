package ListaExercicio;

import java.util.Scanner;

public class Exercicio3Test {
	public static void main(String args[]) {
		Exercicio3 obj = new Exercicio3();
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    int numero = input.nextInt();

		obj.ParImpar(numero);
		
	}
}
