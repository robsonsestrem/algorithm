package br.com.atividades.algorithmum;

/**
 *
 * @author robson
 */
/*
    Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3
    centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão
    necessários para que Zé seja maior que Chico.
 */
public class AlturaZeChico {

    public static void main(String[] args) throws Exception {

        double dAlturaChico = 1.50;
        double dAlturaZe = 1.10;
        int n = 0;
        do {
            dAlturaZe += 0.03;
            dAlturaChico += 0.02;
            n++;
        } while (dAlturaZe <= dAlturaChico);
        System.out.println("Para Zé ser maior que Chico, são necessários " + n + " anos");
    }
}
