package procedural;

import java.util.Scanner;

public class SomaPontoFlutuante {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double soma;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = input.nextDouble();
		System.out.print("Digite o segundo valor: ");
		num2 = input.nextDouble();
		soma = num1 + num2;
		System.out.println("Total da soma:"+ soma);
	}//fim main

}//fim classe
