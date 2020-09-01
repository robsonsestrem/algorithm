package br.com.atividades.algorithmdois;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author robson
 */
/*
    Números palíndromos são aqueles que escritos da direita para a esquerda ou da esquerda para a direita tem o mesmo valor.
    O desafio em questão é fazer um algoritmo que dado um número de 9 dígitos 
    seja possível calcular e escrever se este número é palíndromo.
*/
public class Palindromo {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int vetor[] = new int[9];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor para a posição " + (i + 1));
            vetor[i] = Integer.parseInt(teclado.readLine());
        }
        int indiceAux = vetor.length - 1;
        boolean palindromo = true;
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[indiceAux]) {
                palindromo = false;
                break;
            }
            indiceAux--;
        }
        if (palindromo) {
            System.out.println("O número é palíndromo!");
        } else {
            System.out.println("O número não é palíndromo!");
        }
    }

}
