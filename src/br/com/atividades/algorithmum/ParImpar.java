package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
Escreva um algoritmo que leia uma infinidade de números inteiros positivos.
Para os números pares deverá ser mostrado o quadrado desse número e para os
números impares deverá ser mostrado o número multiplicado por 10. O
programa deverá mostrar no final a quantidade de números pares e impares que
foram informados;
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int quantPar = 0;
        int quantImpar = 0;
        double quadrado = 0;
        System.out.println("Quer digitar um número inteiro? [S]sim [N]não");
        String opcao = s.next();

        while (opcao.equalsIgnoreCase("S")) {
            System.out.println("Informe um número inteiro positivo");
            int inteiro = s.nextInt();
            if (inteiro % 2 == 0) {
                quantPar++;
                quadrado = (inteiro * inteiro);
                System.out.println("O quadrado do número par é = " + quadrado + "\n");
            }
            if (inteiro % 2 != 0) {
                quantImpar++;
                System.out.println("Número ímpar multiplicado por 10 = " + (inteiro * 10) + "\n");
            }
            System.out.println("Quer digitar um número inteiro? [S]sim [N]não");
            opcao = s.next();
        }
        System.out.println("Quantidade de números pares = " + quantPar);
        System.out.println("Quantidade de números ímpares = " + quantImpar);
    }
}
