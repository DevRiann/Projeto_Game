package Game;

public class Resultado extends Calcular
{
    private int pontos;


    public Resultado (int resultado)
    {
        super(resultado);
        pontos = 0;

        while (getResultado() == getValorTotal())
        {
            pontos++;

        }

    }

    @Override
    public String toString()
    {
        return "Pontuação Total: "+getPontos();
    }

    public int getPontos()
    {
        return pontos;
    }
}
