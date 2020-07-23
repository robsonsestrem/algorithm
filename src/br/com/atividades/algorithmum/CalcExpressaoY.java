package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
    Faça um ALGORITMO para ler um valor X e um Valor N. Após, calcule a seguinte
    expressão:
    Y = (X+1)/1! + (X+2)/2! + (X+3)/3! + (X+N)/N!
 */
public class CalcExpressaoY {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor de x");
        int x = s.nextInt();

        System.out.println("Informe o valor de n");
        int n = s.nextInt();

        int aux = 1;
        double soma = 0;
        do {
            int fat = aux;
            for (int i = fat - 1; i >= 1; i--) {
                fat = fat * i;
            }
            soma += (x + aux) / fat;
            aux++;
        } while (aux <= n);

        System.out.println(soma);
    }

}
