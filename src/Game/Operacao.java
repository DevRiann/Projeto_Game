package Game;

import java.util.Random;

public class Operacao
{
    private int operacao;

    Random rand = new Random();

    public Operacao(int operacao)
    {
        this.operacao = rand.nextInt(4);

        switch (operacao)
        {
            case 0:
                System.out.println("Soma");
                break;

            case 1:
                System.out.println("Subtração");
                break;

            case 2:
                System.out.println("Multiplicação");
                break;

            case 3:
                System.out.println("Divisão");
                break;

            default:
                break;
        }
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }
}
