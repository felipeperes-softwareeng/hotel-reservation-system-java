package com.sistemacadastro.entity;

import java.util.Scanner;

public class Hospede {

    // Scanner para leitura de dados do usuário
    Scanner sc = new Scanner(System.in);

    // Instância da classe de funcionalidades auxiliares
    Funcionalidades funcionalidade = new Funcionalidades();

    //----------------------- ATRIBUTOS -----------------------//

    private String nome;
    private String cpf;
    private String quarto;
    private int numeroDiarias;
    private double valorEstadia;

    //----------------------- MÉTODO DE CADASTRO -----------------------//

    public void cadastrarHospede() {

        //----------------------- NOME -----------------------//

        System.out.print("Nome completo: ");

        this.nome = sc.nextLine();

        //----------------------- CPF -----------------------//

        System.out.print("CPF: ");

        this.cpf = sc.nextLine();

        //----------------------- ESCOLHA DO QUARTO -----------------------//

        System.out.print(
                "\nEscolha um quarto:\n" +
                "------------------\n" +
                "1 - Standard - R$200,00 a diária\n" +
                "2 - Luxo - R$400,00 a diária\n" +
                "3 - Presidencial - R$600,00 a diária\n"
        );

        System.out.print("-> ");

        int opcao = sc.nextInt();

        // Validação da opção escolhida
        opcao = funcionalidade.verificarOpcao(1, 3, opcao);

        //----------------------- DEFINIÇÃO DO QUARTO -----------------------//

        if (opcao == 1) {

            this.quarto = "Standard";

        } else if (opcao == 2) {

            this.quarto = "Luxo";

        } else if (opcao == 3) {

            this.quarto = "Presidencial";
        }

        //----------------------- NÚMERO DE DIÁRIAS -----------------------//

        System.out.print("Número de diárias (máximo 3): ");

        this.numeroDiarias = sc.nextInt();

        // Validação do número de diárias
        funcionalidade.verificarOpcao(1, 3, this.numeroDiarias);

        //----------------------- CÁLCULO DO VALOR TOTAL -----------------------//

        if (this.quarto.equalsIgnoreCase("standard")) {

            this.valorEstadia = this.numeroDiarias * 200;

        } else if (this.quarto.equalsIgnoreCase("luxo")) {

            this.valorEstadia = this.numeroDiarias * 400;

        } else if (this.quarto.equalsIgnoreCase("presidencial")) {

            this.valorEstadia = this.numeroDiarias * 600;
        }

        //----------------------- REVISÃO DOS DADOS -----------------------//

        funcionalidade.exibirHospede(this.nome, this.cpf, this.quarto, this.numeroDiarias, this.valorEstadia);
    }

    //----------------------- GETTERS -----------------------//

    public String getNome() {
        return nome;
    }

    public double getValorDiarias() {
        return valorEstadia;
    }

    public int getNumeroDiarias() {
        return numeroDiarias;
    }

    public String getCpf() {
        return cpf;
    }

    public String getQuarto() {
        return quarto;
    }

    //----------------------- SETTERS -----------------------//

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumeroDiarias(int numeroDiarias) {
        this.numeroDiarias = numeroDiarias;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public void setValorDiarias(double valorDiarias) {
        this.valorEstadia = valorDiarias;
    }
}