package ListaExercicio;

import java.util.Scanner;
public class Exercicio10Test {

    public static void main(String args[]){
        Exercicio10 objeto = new Exercicio10();
        double valor, valorFinal;
        int condicao;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de etiqueta: ");
        valor = input.nextDouble();
        System.out.print("Digite o tipo de pagamento: ");
        condicao = input.nextInt();
        valorFinal = objeto.core(valor, condicao);
        System.out.println("O valor final: "+ valorFinal);
    
    }
    
}
