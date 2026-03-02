package Game;

import java.util.Random;

public class Calcular
{
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int valorTotal;
    private int resultado;
    private int operacao;
    String op;


    public Calcular(int dificuldade)
    {
        Random rand = new Random();
        this.dificuldade = dificuldade;
        this.operacao = rand.nextInt(3);

        if (dificuldade == 1)
        {
            valor2 = rand.nextInt(10);
            valor1 = rand.nextInt(10);
        }
        else if (dificuldade == 2)
        {
            valor2 = rand.nextInt(100);
            valor1 = rand.nextInt(100);
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

        switch (this.getOperacao())
        {
            case 0:
                op = "Soma";
                valorTotal = valor1 + valor2;
                break;
            case 1:
                op = "Subtrair";
                valorTotal = valor1 - valor2;
                break;
            case 2:
                op="Multiplicar";
                valorTotal = valor1 * valor2;
                break;
        }
    }

    public String toString()
    {
        return "Dificuldade: "+getDificuldade()+"\nOperação: "+op+"\nValor 1: "+getValor1()+"\nValor 2: "+getValor2();
    }

    public int getDificuldade()
    {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade)
    {
        this.dificuldade = dificuldade;
    }

    public int getValor1()
    {
        return valor1;
    }
    public int getValor2()
    {
        return valor2;
    }
    public int getValorTotal()
    {
        return valorTotal;
    }

    public int getOperacao()
    {
        return operacao;
    }
    public int getResultado()
    {
        return resultado;
    }
    public void setResultado(int resultado)
    {
        this.resultado = resultado;
    }
}
