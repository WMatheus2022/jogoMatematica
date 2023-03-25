package main;

import java.util.Random;

public class Calculos {
    private int level;
    private int valor1;
    private int valor2;
    private int operation;

    private int result;

    public Calculos (int level){
        Random random = new Random();
        this.operation = random.nextInt(2);
        this.level = level;


        if( level == 1) {
            this.valor1 = random.nextInt(10);
            this.valor2 = random.nextInt(10);
        } else {
            this.valor1 = random.nextInt(100);
            this.valor2 = random.nextInt(100);
        }
    }

    public int getLevel() {
        return level;
    }
    public int getValor1() {
        return valor1;
    }
    public int getValor2() {
        return valor2;
    }
    public int getOperation() {
        return operation;
    }

    public int getResult() {
        return result;
    }

    public String toString() {
        String opcao;
        if(this.getOperation() == 0){
            opcao = "somar";
        } else if (this.getOperation() == 1){
            opcao = "subtrair";
        } else if (this.getOperation() == 2) {
            opcao = "multiplicar";
        } else {
            opcao = "opcão inválida";
        }

        return  "valor 1: " + this.getValor1()
                + "\nValor2: " + this.getValor2()
                + "\nOperação: " + opcao
                + "\nDificuldade: " + this.getLevel();
    }
    public boolean somar(int valor) {
        this.result = this.getValor1() + this.getValor2();
        boolean acerto = false;

        if(valor == this.getResult()){
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
    public boolean subtrair(int valor) {
        this.result = this.getValor1() - this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
    public boolean multiplicar(int valor) {
        this.result = this.getValor1() * this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
}

