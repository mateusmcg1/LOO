package ListaExercicio;

import java.util.Scanner;

public class Exercicio4Test {
	
	public static void main(String[] args) {
		Exercicio4 obj = new Exercicio4();
		
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();
        
        obj.Calculo(A, B, B);
        

	}

}
