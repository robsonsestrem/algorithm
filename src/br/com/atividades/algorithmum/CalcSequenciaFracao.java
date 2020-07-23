package br.com.atividades.algorithmum;

/**
 *
 * @author robson
 */
/*
    Fazer um algoritmo que calcule escreva o valor de S onde:
    S = 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - 10/100
 */
public class CalcSequenciaFracao {

    public static void main(String[] args) {

        int numerador = 1;
        int numerador_ant = 0;
        int denominador = 1;
        int denominador_ant = 0;
        double soma = 0;
        do {
            denominador = numerador + numerador_ant + denominador_ant;
            denominador_ant = denominador;
            soma += soma + (numerador / denominador);
            numerador_ant = numerador;
            numerador++;
        } while (denominador < 100);

        System.out.println("Soma: " + soma);
    }
}
