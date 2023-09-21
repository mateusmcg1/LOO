package ListaExercicio;

public class Exercicio8 {
	public void Verifica(int valor1, int valor2, int valor3) {


        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            } else {
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            if (valor1 > valor3) {
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            } else {
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        } else {
            if (valor1 > valor2) {
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            } else {
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
        }

    }
	
}
