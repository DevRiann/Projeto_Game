package Game;

import java.util.Scanner;

public class Teste
{
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Jogo de Calcular!!");
        System.out.println("Digite sua dificuldade, sendo 1- Iniciante até 5- Hack  ");
        Calcular user = new Calcular(input.nextInt());
        System.out.println(user);



    }

}
