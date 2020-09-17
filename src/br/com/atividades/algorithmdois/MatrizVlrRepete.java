package br.com.atividades.algorithmdois;

import java.util.Scanner;

/**
 * @author robson
 */
/*
    Faça um algoritmo que carregue uma matriz de NxM de números inteiros. Implemente também
    um subprograma que verifica quais os valores são repetidos e quantas vezes estes valores aparecem.
    Ao final o programa deve imprimir os valores repetidos e também a quantidade de vezes que
    aparecem.
 */
public class MatrizVlrRepete {

    static int indiceAux = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matriz[][];
        int valoresRepetidos[];
        int quantidadeRepetidos[];

        System.out.println("Informe a quantidade de linhas da matriz");
        int linha = s.nextInt();
        System.out.println("Informe a quantidade de colunas");
        int coluna = s.nextInt();

        matriz = new int[linha][coluna];
        valoresRepetidos = new int[linha * coluna];
        quantidadeRepetidos = new int[linha * coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Informe um valor para a posição [" + i + "," + j + "]");
                matriz[i][j] = s.nextInt();
            }
        }
        verificaValores(matriz, valoresRepetidos, quantidadeRepetidos, linha, coluna);
        if (quantidadeRepetidos.length > 0) {
            for (int i = 0; i < indiceAux; i++) {
                System.out.println("Número: " + valoresRepetidos[i] + " foi informado " + quantidadeRepetidos[i] + " vezes.");
            }
        } else {
            System.out.println("Nenhum valor repetido foi informado.");
        }
    }

    public static void verificaValores(int m[][], int v1[], int v2[], int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                int num = comparaValor(m, m[i][j], linha, coluna, i, j);
                if (num != 0) {
                    int pos = posVerificado(v1, m[i][j]);
                    if (pos < 0) {
                        v1[indiceAux] = num;
                        v2[indiceAux]++;
                        indiceAux++;
                    } else {
                        v2[pos]++;
                    }
                }
            }
        }
    }

    public static int comparaValor(int m[][], int n, int linha, int coluna, int x, int y) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if ((m[i][j] == n) && (i != x || j != y)) {
                    return n;
                }
            }
        }
        return 0;
    }

    public static int posVerificado(int v[], int n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
