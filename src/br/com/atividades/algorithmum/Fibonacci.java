package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
    A Sequência de Fibonacci é uma sucessão de números. Esta sucessão obedece um padrão onde cada elemento subsequente é o resultado da soma dos dois elementos anteriores.
    Faça um algoritmo que ao informar um número qualquer retorne a sequência fibonacci deste número ou do próximo compatível com a sequência com todos seus elementos anteriores.
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        int x = 0;
        int y = 1;
        System.out.println("Informe um número");
        num = s.nextInt();

        while (x < num) {
            x = x + y;
            y = x - y;
            System.out.println(x);
        }
    }
}
