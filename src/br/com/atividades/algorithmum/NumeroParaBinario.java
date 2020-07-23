package br.com.atividades.algorithmum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author robson
 */
/*
    Elabore um programa que, dado um valor inteiro positivo na faixa 1..256, forneça a sequência binária
    equivalente escrevendo-a. Este programa deverá imprimir sequências binárias até que valor informado = 0.
 */
public class NumeroParaBinario {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int valor;
        int resto;
        String binario = "";
        String bin = "";

        System.out.print("Valor -> ");
        valor = Integer.parseInt(in.readLine());
        while (valor < 1 || valor > 255) {
            System.out.print("Valor invalido, informe novo Valor -> ");
            valor = Integer.parseInt(in.readLine());
        }
        while (valor > 1) {
            resto = valor % 2;
            valor = valor / 2;
            binario += String.valueOf(resto);
        }
        binario = binario + String.valueOf(valor);
        String[] aux = binario.split("");
        for (int i = binario.length() - 1; i >= 0; i--) {
            bin += aux[i];
        }
        while (bin.length() < 8) {
            bin = "0" + bin;
        }
        System.out.println(bin);
    }
}
