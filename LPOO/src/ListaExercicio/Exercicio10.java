package ListaExercicio;

public class Exercicio10 {

    /*
     * 1 a vista em dinheiro ou cheque 10%
     * 2 a vista no cartao de credito, 15%
     * 3 em duas x
     * 4 mas de 2x 10% de juro
     */
    public double core(double valor, int condicao) {
        double valorFinal;
        switch (condicao) {
            case 1:
                valorFinal = valor - 0.1 * valor;
                break;
            case 2:
                valorFinal = valor - 0.15 * valor;
                break;
            case 3:
                valorFinal = valor;
                break;
            default:
                valorFinal = valor + 0.1 * valor;
                break;
        }
        return valorFinal;

    }

}
