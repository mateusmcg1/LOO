package procedural;

// import java.util.Scanner;

public class Conta {
    private double balanco;// armazena o saldo
    // construtor

    public Conta(double balancoInicial) {
        if (balancoInicial > 0.0) {
            balanco = balancoInicial;
        }
    }// fim construtor

    public void Deposito(double acrescimo) {
        balanco = balanco + acrescimo;
    }

    public void Saque(double valor) {
        if (valor <= balanco) {

            balanco = balanco - valor;
        }
        else{
            System.out.println("O saque excede o valor na conta!");
        }
    }
    
    public double getBalanco() {
        return balanco;
    }

}
