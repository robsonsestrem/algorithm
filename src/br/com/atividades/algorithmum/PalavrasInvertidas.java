package br.com.atividades.algorithmum;

/**
 *
 * @author robson
 */
/*
    Elabore um programa que, Dado uma quantidade indeterminada de palavras, sendo
    que as mesmas sempre terminam com o caracter “$”, escreva cada uma delas
    invertida ( o sinal de “$” deve ser considerado na impressão ).
    Exemplo: Sistemas$de$Informação$CEAVI
    saida: sametsiS$ed$oãçamrofnI$IVAEC
 */
public class PalavrasInvertidas {

    public static void main(String[] args) {
        String palavra = " Robson Sestrem Engenheiro Software ";
        int i_index = 0;
        int f_index = 0;
        do {
            if ((palavra.charAt(f_index) == ' ') || (f_index == palavra.length() - 1)) {
                int aux_index = f_index;
                do {
                    System.out.print(palavra.charAt(aux_index));
                    aux_index--;
                } while (aux_index >= i_index);
                i_index = f_index + 1;
            }
            f_index++;
        } while (f_index < palavra.length());
    }

}
