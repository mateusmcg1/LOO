package procedural;

import java.util.Scanner;

public class SomaSimples {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = input.nextInt();
		soma = num1 + num2;
		System.out.println("Total da soma:"+ soma);
		
	}//fim main

}//fim classe
