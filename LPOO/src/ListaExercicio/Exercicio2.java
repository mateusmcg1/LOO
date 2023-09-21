package ListaExercicio;

import java.util.Scanner;
public class Exercicio2 {
	public void EstadoCivil(String nome, String sexo, String estadoCivil) {
		
		Scanner input = new Scanner(System.in);
		
		if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("CASADA")) {
	        System.out.print("Digite o tempo de casada (anos): ");
	        int tempoCasada = input.nextInt();

	        System.out.println("---------------------");
	        System.out.println("Nome: " + nome);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + estadoCivil);
	        System.out.println("Tempo de casada: " + tempoCasada + " anos");
	    } else {
	        System.out.println("---------------------");
	        System.out.println("Nome: " + nome);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + estadoCivil);

	}

	}
}
