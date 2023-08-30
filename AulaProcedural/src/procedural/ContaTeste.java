package procedural;

public class ContaTeste {
    public static void main(String args[]){
        Conta conta1 = new Conta(1231.21);
        Conta conta2 = new Conta(-12);
        System.out.println("Valor da conta 1: " +conta1.getBalanco());
        System.out.println("Valor da conta 2: "+conta2.getBalanco());

        conta2.Deposito(123.32);
        System.out.println("Valor conta 2 atualizado:"+conta2.getBalanco());

        conta1.Saque(2000);
        System.out.println("Novo valor do balanco é: "+conta1.getBalanco());

    }
}
