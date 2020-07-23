package br.com.atividades.algorithmum;

/**
 *
 * @author robson
 */
/*
    Elabore um programa que, Dado uma quantidade indeterminada de palavras, sendo
    que as mesmas sempre terminam com o caracter “$”, escreva o tamanho de cada uma
    das mesmas ( o sinal de “$” não deve ser considerado na contagem ).
    Exemplo: Sistemas$de$Informação$CEAVI
    Saída: 8,2,10,5
 */
public class QtdadePalavras {

    public static void main(String[] args) {
        String palavra = "Robson$Sestrem$Treino,Alg$Udesc";
        int index = 0;
        int cont = 0;
        do {
            if (palavra.charAt(index) != '$') {
                cont++;
            } else {
                System.out.print(cont + ",");
                cont = 0;
            }
            index++;
        } while (index < palavra.length());
        System.out.println(cont);
    }
}
