package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/**
 * @author robson /* O campeonato Mundial de F1 que realizar-se-á no ano de 2013
 * terá 12 corridas, que serão disputadas em 12 países. Cada corrida terá um
 * número variável de participantes, pois estes dependem do tempo de
 * classificação de cada corrida. A FIA deseja um programa de computador para
 * controlar todos os grandes prêmios, e você, caro acadêmico(a) do curso de
 * Sistemas de Informação da UDESC/CEAVI foi escolhido para elaborar o programa,
 * de acordo com os requisitos a seguir: a) O usuário deverá informar o nome da
 * corrida (GP do Brasil, GP do Canadá, GP da Espanha,.....). b) Para cada GP o
 * usuário deverá informar o nome do piloto, o número de voltas completadas e o
 * tempo que levou para completar as voltas. A corrida terá no máximo 70 voltas,
 * sendo que o algoritmo não deverá permitir que o usuário informe um número de
 * voltas maior que 70. O algoritmo deverá mostrar para cada piloto, o nome,
 * tempo e número de voltas percorridas. c) Para cada GP o programa deverá
 * mostrar o nome da corrida, nome e o tempo dos pilotos que ficaram em
 * primeiro, segundo, terceiro e último lugar da corrida.
 */
public class FormulaUm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tempovoltas = 0.0;
        int numerodevoltas = 0;

        System.out.println("Informe o nome da corrida ou digite [fim] para sair:");
        String nomecorrida = s.nextLine();
        while (!nomecorrida.equalsIgnoreCase("fim")) {
            String nomeprimeiro = "", nomesegundo = "", nometerceiro = "", nomeultimo = "";
            double tempoprimeiro = 999, temposegundo = 999, tempoterceiro = 999, tempoultimo = 0.0;
            int voltasprimeiro = 0, voltassegundo = 0, voltasterceiro = 0, voltasultimo = 99;

            System.out.println("Informe o nome do piloto ou digite [fim] para voltar:");
            String nomepiloto = s.nextLine();
            while (!nomepiloto.equalsIgnoreCase("fim")) {
                do {
                    System.out.println("Informe o número de voltas");
                    numerodevoltas = s.nextInt();
                } while (numerodevoltas > 70 || numerodevoltas <= 0);

                System.out.println("Informe tempo de voltas");
                tempovoltas = s.nextDouble();

                if ((numerodevoltas > voltasprimeiro) || ((numerodevoltas == voltasprimeiro)
                        & (tempovoltas < tempoprimeiro))) {
                    nometerceiro = nomesegundo;
                    tempoterceiro = temposegundo;
                    voltasterceiro = voltassegundo;

                    nomesegundo = nomeprimeiro;
                    temposegundo = tempoprimeiro;
                    voltassegundo = voltasprimeiro;

                    nomeprimeiro = nomepiloto;
                    tempoprimeiro = tempovoltas;
                    voltasprimeiro = numerodevoltas;
                } else if ((numerodevoltas > voltassegundo) || ((numerodevoltas == voltassegundo)
                        & (tempovoltas < temposegundo))) {
                    nometerceiro = nomesegundo;
                    tempoterceiro = temposegundo;
                    voltasterceiro = voltassegundo;

                    nomesegundo = nomepiloto;
                    temposegundo = tempovoltas;
                    voltassegundo = numerodevoltas;
                } else if ((numerodevoltas > voltasterceiro) || ((numerodevoltas == voltasterceiro)
                        & (tempovoltas < tempoterceiro))) {
                    nometerceiro = nomepiloto;
                    tempoterceiro = tempovoltas;
                    voltasterceiro = numerodevoltas;
                }
                if ((numerodevoltas < voltasultimo) || ((numerodevoltas == voltasultimo)
                        & (tempovoltas > tempoultimo))) {
                    nomeultimo = nomepiloto;
                    tempoultimo = tempovoltas;
                    voltasultimo = numerodevoltas;
                }
                System.out.println("Nome: " + nomepiloto);
                System.out.println("Tempo: " + tempovoltas);
                System.out.println("Voltas: " + numerodevoltas);
                System.out.println("Informe o nome do piloto:");
                nomepiloto = s.next();
            }
            System.out.println("Corrida:" + nomecorrida);
            System.out.println("1º colocado:" + nomeprimeiro + "\nTempo:" + tempoprimeiro + "\nNúmero de voltas: " + voltasprimeiro);
            System.out.println("2º colocado:" + nomesegundo + "\nTempo:" + temposegundo + "\nNúmero de voltas: " + voltassegundo);
            System.out.println("3º colocado:" + nometerceiro + "\nTempo:" + tempoterceiro + "\nNúmero de voltas: " + voltasterceiro);
            System.out.println("Último colocado:" + nomeultimo + "\nTempo:" + tempoultimo + "\nNúmero de voltas: " + voltasultimo);

            System.out.println("Informe o nome da corrida:");
            nomecorrida = s.next();
        }
    }

}
