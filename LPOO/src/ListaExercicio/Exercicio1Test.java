package ListaExercicio;

import java.util.Scanner;
public class Exercicio1Test {
	public static void main (String args[]) {
		Exercicio1 obj = new Exercicio1();
		int A, B, C;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A=input.nextInt();
		System.out.print("Digite o valor de B: ");
		B=input.nextInt();
		System.out.print("Digite o valor de C: ");
		C = input.nextInt();
		
		obj.Comparacao(A, B, C);
;	}

}
