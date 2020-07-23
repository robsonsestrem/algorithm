package br.com.atividades.algorithmum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author robson
 */
/*
Uma agencia de empregos oferece diariamente vagas para diversos postos de trabalho na indústria e no
comercio. A seleção é feita em função do perfil desejado para cada área. As regras de seleção são as
seguintes:
 Para uma pessoa ser aceita para trabalhar no comércio ela necessita residir na cidade há pelo
menos um ano, ter segundo grau completo e possuir experiência comprovada;
 Para uma pessoa trabalhar na indústria o perfil esperado é residir dentro ou fora da cidade sem
tempo mínimo de residência e possuir segundo grau completo para os cargos operacionais e
curso superior para os cargos de gerencia. É também exigida experiência comprovada somente
para os cargos de gerencia, não sendo exigida experiência para os cargos operacionais.
Elabore um programa que leia os dados necessários para classificar 30 candidatos. Para cada candidato
o programa deve exibir uma mensagem ‘candidato apto’ quando todas as exigências para a área
pretendida forem satisfeitas e ‘candidato inapto’ quando qualquer das exigência por área não forem
satisfeitas e isto reprovar o candidato. Quando o algoritmo definir um candidato inapto deve ser escrita
também a exigência que implicou na reprovação deste candidato. Ao final este programa deverá
escrever:
a) Quantos candidatos para cada área foram computados
b) Qual o percentual de candidatos inaptos por área
c) Quantos candidatos aptos por área foram computados
 */
public class CandidatosCondicionais {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String residencia;
        int tempoResidencia;
        String grauInstrucao;
        String experiencia;
        String area;
        String exigencia = "";
        int contaAprovadoComercio = 0;
        int contaAprovadoIndustria = 0;
        int contaInaptoComercio = 0;
        int contaInaptoIndustria = 0;
        int contaComercio = 0;
        int contaIndustria = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.println("Área");
            area = in.readLine();
            if (area.equalsIgnoreCase("comercio")) {
                contaComercio++;
                System.out.println("reside na cidade");
                residencia = in.readLine();
                if (residencia.equalsIgnoreCase("s")) {
                    System.out.println("tempo de residencia");
                    tempoResidencia = Integer.parseInt(in.readLine());
                    if (tempoResidencia >= 1) {
                        System.out.println("grau de instrução em/es");
                        grauInstrucao = in.readLine();
                        if (grauInstrucao.equalsIgnoreCase("em") || grauInstrucao.equalsIgnoreCase("es")) {
                            System.out.println("experiencia");
                            experiencia = in.readLine();
                            if (experiencia.equalsIgnoreCase("s")) {
                                contaAprovadoComercio++;
                                exigencia = "Candidato apto";
                            } else {
                                contaInaptoComercio++;
                                exigencia = "Candidato inapto, pois não possui experiencia";
                            }
                        } else {
                            contaInaptoComercio++;
                            exigencia = "Candidato inapto, pois não possui ensino medio completo";
                        }
                    } else {
                        contaInaptoComercio++;
                        exigencia = "Candidato inapto, pois não reside na cidade há pelo menos um ano";
                    }
                } else {
                    contaInaptoComercio++;
                    exigencia = "Candidato inapto, pois não reside na cidade";
                }
            } else {
                if (area.equalsIgnoreCase("industria")) {
                    contaIndustria++;
                    System.out.println("setor");
                    String setor = in.readLine();
                    System.out.println("grau de instrução em/es");
                    grauInstrucao = in.readLine();
                    if (setor.equalsIgnoreCase("operacional")) {
                        if (grauInstrucao.equalsIgnoreCase("em") || grauInstrucao.equalsIgnoreCase("es")) {
                            contaAprovadoIndustria++;
                            exigencia = "Candidato apto";
                        } else {
                            contaInaptoIndustria++;
                            exigencia = "Candidato inapto, pois não possui ensino medio completo";
                        }
                    } else {
                        if (setor.equalsIgnoreCase("gerencia")) {
                            if (grauInstrucao.equalsIgnoreCase("es")) {
                                System.out.println("experiencia");
                                experiencia = in.readLine();
                                if (experiencia.equalsIgnoreCase("s")) {
                                    contaAprovadoIndustria++;
                                    exigencia = "Candidato apto";
                                } else {
                                    contaInaptoIndustria++;
                                    exigencia = "Candidato inapto, pois não possui experiencia comprovada";
                                }
                            } else {
                                contaInaptoIndustria++;
                                exigencia = "Candidato inapto, pois não possui ensino superior completo";
                            }
                        }
                    }
                }
            }
            System.out.println(exigencia);
        }
        System.out.println("Computados para comercio == " + contaComercio
                + "\nComputados para industria == " + contaIndustria
                + "\nPercentual de inaptos pro comercio == " + ((contaInaptoComercio * 100) / contaComercio)
                + "\nPercentual de inaptos pra industria == " + ((contaInaptoIndustria * 100) / contaIndustria)
                + "\nAptos para comercio == " + contaAprovadoComercio
                + "\nAptos para industria == " + contaAprovadoIndustria);
    }
}
