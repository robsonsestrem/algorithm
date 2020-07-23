package br.com.atividades.algorithmum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author robson
 */
/*
Em uma rede de postos de combustíveis são atendidos de 1400 a 1900 automóveis/posto por dia e em
média são vendidos 15 litros de combustível por automóvel atendido. O gerente desta rede necessita
conhecer o desempenho de cada posto no mês e para isso foi definido um padrão de avaliação que
atribui um conceito de desempenho que pode ser a, b ou c. Este conceito define-se conforme segue:
 Para adquirir conceito a, o posto deve ter atendido a no mínimo 1850 automóveis/dia com
uma média de venda de no mínimo 15 litros por automóvel
 Para obter um conceito b, devem ser atendidos no mínimo 1500 automóveis/dia com uma
media de no mínimo 9.8 litros por automóvel. Entretanto, se para esta quantia de
atendimentos/dia a media de vendas for igual ou superior a 17.5 litros/automóvel o conceito
aplicado será também a;
 Para obter um conceito c devem ser atendidos entre 1100 e 1499 automóveis/dia com uma
média de vendas de no mínimo 12 litros por automóvel. Eventualmente, se para esta quantia
de atendimentos a media de venda por automóvel for igual ou superior a 20 litros, o conceito
aplicado será b.
Escreva um programa que defina o conceito de desempenho para um posto de gasolina em um
determinado mês e escreva o seu conceito. Deverão ser computados postos de gasolina até que
quantidade de veículos/dia atendidos = -1. Ao final, este programa deverá escrever:
a) Qual a média geral de veículos/dia atendidos
b) Qual a média geral de litros/dia vendidos independente do tipo de combustível
c) Qual o nome e endereço (rua, numero, bairro, cidade, uf) do posto com melhor desempenho em
quantidade de veículos/dia atendidos
 */
public class RotinaPostoCombustivel {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double veiculosDia = 0.0;
        String nomePosto = "";
        String endereco = "";
        String nomeMelhor = "";
        String enderecoMelhor = "";
        double melhor = 0.0;
        double litrosDia = 0.0;
        String conceito = "";
        double cont = 0.0;
        double somaVeiculos = 0.0;
        double somaLitros = 0.0;
        double litrosCarro = 0.0;

        System.out.print("Informa a quantidade de atendimentos/dia [-1 para terminar].");
        veiculosDia = Double.parseDouble(in.readLine());
        while (veiculosDia != -1) {
            cont++;
            somaVeiculos += veiculosDia;
            System.out.print("Informe nome do Posto -> ");
            nomePosto = in.readLine();
            System.out.print("Informe endereço (rua, numero, bairro, cidade, uf)");
            endereco = in.readLine();
            System.out.print("Informe a media vendida por cliente(Litros)");
            litrosCarro = Double.parseDouble(in.readLine());
            litrosDia = litrosCarro * veiculosDia;
            somaLitros += litrosDia;
            if (veiculosDia > melhor) {
                nomeMelhor = nomePosto;
                enderecoMelhor = endereco;
            }

            conceito = "Impossível classificar!";
            if (veiculosDia >= 1850 && litrosCarro >= 15) {
                conceito = "a";
            } else if (veiculosDia >= 1500) {
                if (litrosCarro >= 17.5) {
                    conceito = "a";
                } else if (litrosCarro >= 9.8) {
                    conceito = "b";
                }
            } else if (veiculosDia >= 1100 && veiculosDia <= 1499) {
                if (litrosCarro >= 20) {
                    conceito = "b";
                } else if (litrosCarro >= 12) {
                    conceito = "c";
                }
            }
            System.out.println("Conceito: " + conceito);
            System.out.print("Informa a quantidade de atendimentos/dia [-1 para terminar].");
            veiculosDia = Double.parseDouble(in.readLine());
        }
        System.out.println("Média Geral de Veículos/Dia: " + (somaVeiculos / cont)
                + "\nMédia Geral de litros/Dia: " + (somaLitros / cont)
                + "\nPosto com melhor desempenho: " + nomeMelhor
                + "\nEndereço do posto com melhor desempenho: " + enderecoMelhor);
    }
}
