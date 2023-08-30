package procedural;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro valor: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        num2 = input.nextInt();

        if(num1 % 2 == 0){
            System.out.printf("%d é par \n", num1);
        }else{
            System.out.printf("%d é impar \n", num1);
        }
        
    }
    
}
