package ListaExercicio;

import java.util.Scanner;


public class Exercicio8Test {
	public static void main(String[] args) {
		Exercicio8 obj = new Exercicio8();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = input.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int valor3 = input.nextInt();
        
         obj.Verifica(valor1, valor2, valor3);
        

        
    }

}
