package br.com.atividades.algorithmum;

import java.util.Scanner;

/**
 *
 * @author robson
 */
/*
Escreva um algoritmo para controlar as vendas de produtos de um
supermercado. Para cada venda deverá ser informado o código da venda, nome e
telefone do cliente e os produtos que ele comprou. Para cada produto deverá ser
informado a quantidade e valor unitário. O cliente poderá comprar
vários produtos de uma única compra. Para cada venda mostrar o código da
venda, nome e telefone do cliente e o valor total dos produtos vendidos. O
algoritmo deverá terminar quando for informado 0 (zero) para o código da
venda. No final o programa deverá mostrar o nome e telefone do cliente e o
valor total para a compra com maior e menor valor. Mostrar também, a valor
total de todas as compras realizadas.
 */
public class ControleVendas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double maiorcompra = 0;
        double menorcompra = 99999999;
        double totaldacompra = 0;
        String clientemaiorcompra = "";
        String clientemenorcompra = "";
        int fonemaiorvenda = 0;
        int fonemenorvenda = 0;
        double somadecompras = 0;

        System.out.println("Informe o código da venda ou [0] para sair:");
        int codigovenda = s.nextInt();

        while (codigovenda != 0) {
            System.out.println("Informe nome do cliente");
            String cliente = s.next();
            System.out.println("Informe o telefone");
            int telefone = s.nextInt();
            System.out.println("Informe código do produto ou [0] para voltar: ");
            int codigo_produto = s.nextInt();

            while (codigo_produto != 0) {
                System.out.println("Valor unitário");
                double valor_unico = s.nextDouble();
                System.out.println("Informe a quantidade");
                int quantidade = s.nextInt();
                totaldacompra = (valor_unico * quantidade);
                somadecompras += totaldacompra;
                System.out.println("Informe código do produto ou [0] para voltar:");
                codigo_produto = s.nextInt();
            }
            if (totaldacompra > maiorcompra) {
                maiorcompra = totaldacompra;
                clientemaiorcompra = cliente;
                fonemaiorvenda = telefone;
            }
            if (totaldacompra < menorcompra) {
                menorcompra = totaldacompra;
                clientemenorcompra = cliente;
                fonemenorvenda = telefone;
            }
            System.out.println("Informe o código da venda ou [0] para sair:");
            codigovenda = s.nextInt();
        }
        System.out.println("Cliente com maior compra : " + clientemaiorcompra
                + "\nTelefone : " + fonemaiorvenda
                + "\nValor da Compra = " + maiorcompra + "\n");

        System.out.println("Cliente com menor compra : " + clientemenorcompra
                + "\nTelefone : " + fonemenorvenda
                + "\nValor da Compra = " + menorcompra);
        System.out.println("Total de todas as compras = " + somadecompras);
    }

}
