package Game;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Thread inputThread = new Thread(() ->
        {
            System.out.println("Bem-Vindo ao Jogo de Calcular!!");
            System.out.println("Digite sua dificuldade, sendo 1(Iniciante) até 5(Hacker)  ");
            Calcular userC = new Calcular(input.nextInt());
            System.out.println(userC);
            System.out.println("Qual é o resultado");
            Resultado userR = new Resultado(input.nextInt());
            System.out.println("Deseja continuar? ");
            String continuar = input.next();


            while (continuar.equals("Sim"))
            {
                System.out.println("Digite sua dificuldade, sendo 1(Iniciante) até 5(Hacker)  ");
                userC.setDificuldade(input.nextInt());
                System.out.println(userC);
                System.out.println("Qual é o resultado");
                userR.setResultado(input.nextInt());
                System.out.println("Deseja continuar? ");
                continuar = input.nextLine();
            }

            System.out.println(userR);
        });

        inputThread.start();

        try {
            inputThread.join(30000); // espera até 30 segundos
            if (inputThread.isAlive()) {
                System.out.println("\nTempo esgotado!");
                inputThread.interrupt(); // encerra a thread de entrada
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

}
