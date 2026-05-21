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


}
