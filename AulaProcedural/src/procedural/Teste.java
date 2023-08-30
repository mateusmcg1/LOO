package procedural;

import java.util.Scanner;

public class Teste {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o curso: ");
        String nome = input.nextLine();
        Senac objeto = new Senac(nome);
        System.out.println(objeto.getNomeCurso());

        System.out.print("Digite o novo curso: ");
        nome = input.nextLine();
        objeto.setNomeCurso(nome);
        objeto.MostrarMensagem();

    }

}
