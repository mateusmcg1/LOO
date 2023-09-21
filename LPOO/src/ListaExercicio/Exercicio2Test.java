package ListaExercicio;

import java.util.Scanner;

public class Exercicio2Test {
	public static void main(String args[]) {

		Exercicio2 obj = new Exercicio2();
		Scanner input = new Scanner(System.in);

		

		System.out.print("Digite o nome da pessoa: ");
		String nome = input.next();
		System.out.print("Digite o sexo da pessoa(M/F): ");
		String sexo = input.next();
		System.out.print("Digite o estado civil da pessoa: ");
		String estadoCivil = input.next();
		
		obj.EstadoCivil(nome, sexo, estadoCivil);
		
	
		
		
			}

}
