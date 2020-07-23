package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
Elabore um programa que, escolhida uma tabuada(base), imprima esta tabuada no formato n x base =
result , onde 1 <= n <= 10.
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a tabuada: ");
        int tabuada = s.nextInt();
        int fator = 1;

        for (int i = 0; i < 10; i++) {
            int valor = tabuada * fator;
            System.out.println(tabuada + " x " + fator + " = " + valor);
            fator++;
        }
    }
}
