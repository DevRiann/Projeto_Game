package Game;

import java.util.Random;

public class Calcular extends Operacao
{
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int resultado;

    Random rand = new Random();



    public Calcular(int dificuldade)
    {
        super(dificuldade);
        this.dificuldade = dificuldade;


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
        return "Dificuldade: "+getDificuldade()+"\nValor 1: "+getValor1()+"\nValor 2: "+getValor2()+"\nOperacao: "+getOperacao();

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


    public int getResultado()
    {
        return resultado;
    }
}
