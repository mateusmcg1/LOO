package ListaExercicio;

public class Exercicio9 {

	    public void CalculaIMC(double altura, double peso ) {
	        double imc = peso / (altura * altura);

	        System.out.print("Condição de peso: ");
	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso");
	        } else if (imc >= 18.5 && imc < 25) {
	            System.out.println("Peso normal");
	        } else if (imc >= 25 && imc < 30) {
	            System.out.println("Acima do peso");
	        } else {
	            System.out.println("Obeso");
	       }
	    }
	}


