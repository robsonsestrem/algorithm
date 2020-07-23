package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
    Elabore um programa que leia 5 valores inteiros positivos e ao final responda quantos destes valores
    são números primos.
 */
public class NrPrimo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int primo = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("informe um valor");
            int valor = s.nextInt();
            if (valor > 1) {
                int divisores = 0;

                for (int x = 2; x < valor; x++) {
                    if ((valor % x) == 0) {
                        divisores++;
                    }
                }
                if (divisores == 0) {
                    primo++;
                }
            }
        }
        System.out.println("Foram informados " + primo + " números primos");

    }
}
