package com.sistemacadastro.entity;

import java.util.Scanner;

public class Funcionalidades {

    public int verificarOpcao(int minimo, int maximo, int opcao) {
        Scanner sc = new Scanner(System.in);

        while (opcao < minimo || opcao > maximo) {
            System.out.println("Digite uma opção válida!");
            System.out.print("-> ");
            opcao = sc.nextInt();
        }

        return opcao;
    }

    public void exibirHospede(String nome, String cpf, String quarto, int diasEstadia, double valorEstadia){
        System.out.println(
                                (
                                        "Nome: %s\n" +
                                        "CPF: %s\n" +
                                        "Quarto: %s\n" +
                                        "Diária: %d\n" +
                                        "Valor estadia: R$%.2f\n"
                                ).formatted(
                                        nome,
                                        cpf,
                                        quarto,
                                        diasEstadia,
                                        valorEstadia
                                )
                        );
    }


}
