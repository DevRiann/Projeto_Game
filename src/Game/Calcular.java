package Game;

import java.util.Random;

public class Calcular
{
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int resultado;
    private int operacao;

    public Calcular(int dificuldade)
    {
        Random rand = new Random();
        this.dificuldade = dificuldade;
        this.operacao = rand.nextInt(4);


        if (dificuldade == 1)
        {
            valor1 = rand.nextInt(10);
            valor2 = rand.nextInt(10);
        }
        else if (dificuldade == 2)
        {
            valor1 = rand.nextInt(100);
            valor2 = rand.nextInt(100);
        }
        else if (dificuldade == 3)
        {
            valor2 = rand.nextInt(1000);
            valor1 = rand.nextInt(1000);
        }
        else if (dificuldade == 4)
        {
            valor2 = rand.nextInt(10000);
            valor1 = rand.nextInt(10000);
        }
        else
        {
            valor2 = rand.nextInt(100000);
            valor1 = rand.nextInt(100000);
        }
    }

    public String toString()
    {
        switch (this.getOperacao())
        {
            case 0:
                System.out.println("Operação: Somar");
                break;
            case 1:
                System.out.println("Operação: Subtrair");
                break;
            case 2:
                System.out.println("Operação: Multiplicar");
                break;
            case 3:
                System.out.println("Operação: Dividir");
                break;

        }

        return "Dificuldade: "+getDificuldade()+"\nValor 1: "+getValor1()+"\nValor 2: "+getValor2();

    }

    public int getDificuldade()
    {
        return dificuldade;
    }
    public int getValor1()
    {
        return valor1;
    }
    public int getValor2()
    {
        return valor2;
    }
    public int getOperacao() {
        return operacao;
    }
    public int getResultado()
    {
        return resultado;
    }
}
