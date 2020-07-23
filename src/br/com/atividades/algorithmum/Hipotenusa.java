package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
    Faça um algoritmo que calcule a hipotenusa de 10 triângulos.
    hipotenusa² = cateto² + cateto²
 */
public class Hipotenusa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double catA = 0;
        double catO = 0;
        double[] hip = new double[10];

        for (int i = 0; i <= 9; i++) {
            System.out.println("Informe o valor do cateto adjacente");
            catA = s.nextDouble();
            System.out.println("Informe o valor do cateto oposto");
            catO = s.nextDouble();
            catA = Math.pow(catA, 2);
            catO = Math.pow(catO, 2);
            hip[i] = Math.sqrt(catA + catO);
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(hip[i]);
        }
    }
}
