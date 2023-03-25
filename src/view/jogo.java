package view;

import main.Calculos;

import java.util.Scanner;

public class jogo {
    static Scanner input = new Scanner(System.in);
    static int pontos = 0;
    static Calculos calculos;

    public static void main(String[] args) {
        jogo.play();
    }

    public static void play() {
        System.out.println("Informe o nivel de dificuldade [1 ou 2]");
        int level = jogo.input.nextInt();

        jogo.calculos = new Calculos(level);

        System.out.println("Informe o resultado para seguinte operação: ");

        if(calculos.getOperation() == 0) {
            System.out.println(calculos.getValor1() + " + " + calculos.getValor2());
            int resposta = jogo.input.nextInt();

            if (calculos.somar(resposta)){
                jogo.pontos += 1;
                System.out.println("você tem " + jogo.pontos + "ponto(s).");

            }
        }
        if(calculos.getOperation() == 1) {
            System.out.println(calculos.getValor1() + " - " + calculos.getValor2());
            int resposta = jogo.input.nextInt();

            if (calculos.subtrair(resposta)){
                jogo.pontos += 1;
                System.out.println("você tem " + jogo.pontos + "ponto(s).");

            }
        }
        if(calculos.getOperation() == 2) {
            System.out.println(calculos.getValor1() + " * " + calculos.getValor2());
            int resposta = jogo.input.nextInt();

            if (calculos.multiplicar(resposta)){
                jogo.pontos += 1;
                System.out.println("você tem " + jogo.pontos + "ponto(s).");

            }
        } else {
            System.out.println("A operação " + calculos.getOperation() + "não é reconhecida.");
        }
        System.out.println("Desejar continuar? [1 - yes, 0 - no]");
        int continuar = jogo.input.nextInt();

        if(continuar == 1) {
            jogo.play();
        } else {
            System.out.println("Você fez " + jogo.pontos + " ponto(s).");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }
}
