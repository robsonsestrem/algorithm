package br.com.atividades.algorithmum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author robson
 */
/*
Elabore um programa que, dado um valor inteiro positivo no intervalo 1..25, calcule o seu fatorial e
escreva. Este programa deverá apresentar uma consistência que evite que seja informado um valor fora
da faixa válida. Este programa deverá calcular fatoriais enquanto o valor informado seja diferente de -1.
Ao final o programa deverá informar, dentre todos os valores informados para calculo de fatorial, qual o
percentual de valores estavam na faixa válida e qual o percentual de valores foi rejeitado por estar fora
da faixa válida.
 */
public class Fatorial {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int valor;
        double contaInvalido = 0;
        double contaValido = 0;
        long fatorial = 1;

        System.out.print("Valor -> ");
        valor = Integer.parseInt(in.readLine());
        while (valor != -1) {
            while (valor < 1 || valor > 25) {
                contaInvalido++;
                System.out.print("Valor invalido, informe novo Valor -> ");
                valor = Integer.parseInt(in.readLine());
                if (valor == -1) {
                    double validos = (contaValido / (contaValido + contaInvalido)) * 100;
                    double invalidos = (contaInvalido / (contaValido + contaInvalido)) * 100;
                    System.out.println("Valores aceitos == " + validos + "%"
                            + "\nValores descartados == " + invalidos + "%");
                    System.exit(0);
                }
            }
            contaValido++;
            fatorial = 1;
            for (int i = valor; i >= 1; i--) {
                fatorial *= i;

            }
            System.out.println("Fatorial de " + valor + " == " + fatorial);
            System.out.print("\nValor -> ");
            valor = Integer.parseInt(in.readLine());
        }
        double validos = (contaValido / (contaValido + contaInvalido)) * 100;
        double invalidos = (contaInvalido / (contaValido + contaInvalido)) * 100;
        System.out.println("Valores aceitos == " + validos + "%"
                + "\nValores descartados == " + invalidos + "%");

        ///////////////outras soluções para fatorial//////////////////////
//        Scanner s = new Scanner(System.in);
//        System.out.println("Informe um valor para calcular");
//        int vlr = s.nextInt();
//        int vlrFatorial = 1;
//
//        for (int i = vlr; i >= 1; i--) {
//            vlrFatorial *= i;
//        }
//        System.out.println("Fatorial calculado = " + vlrFatorial);

//        Scanner s = new Scanner(System.in);
//        int fatorial = 1;
//        System.out.println("Informe um valor para calcular seu fatorial ");
//        int valor = s.nextInt();
//
//        while (valor != 1) {
//            fatorial *= valor;
//            valor -= 1;
//        }
//        System.out.println("Fatorial calculado = " + fatorial);

    }

}
