package Game;

import java.util.Scanner;

public class Teste
{
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        Thread inputThread = new Thread(() ->
        {
            System.out.println("Bem-Vindo ao Jogo de Calcular!!");
            System.out.println("Digite sua dificuldade, sendo 1- Iniciante até 5- Hack  ");
            Calcular user = new Calcular(input.nextInt());
            System.out.println(user);
        });

        inputThread.start();

        try {
            inputThread.join(5000); // espera até 5 segundos
            if (inputThread.isAlive()) {
                System.out.println("\nTempo esgotado!");
                inputThread.interrupt(); // encerra a thread de entrada
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

}
