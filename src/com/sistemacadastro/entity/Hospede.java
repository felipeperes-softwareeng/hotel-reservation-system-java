package com.sistemacadastro.entity;

import java.util.Scanner;

public class Hospede {

    Scanner sc = new Scanner(System.in);

    Funcionalidades funcionalidade = new Funcionalidades();

    private String nome;
    private String cpf;
    private String quarto;
    private int numeroDiarias;
    private double valorEstadia;


    public void cadastrarHospede(){

        //Nome hóspede
        System.out.print("Nome completo: ");
        this.nome = sc.nextLine();


        //CPF hóspede
        System.out.print("CPF: ");
        this.cpf = sc.nextLine();


        //Escolha de quarto
        System.out.print("\nEscolha um quarto:\n" +
                         "------------------\n" +
                         "1 - Standard - R$200,00 a diária\n" +
                         "2 - Luxo - R$400,00 a diária\n" +
                         "3 - Presidencial - R$600,00 a diária\n");
        System.out.print("-> ");
        int opcao = sc.nextInt();
        opcao = funcionalidade.verificarOpcao(1, 3, opcao);

        if(opcao == 1){
            this.quarto = "Standard";
        }else if(opcao == 2){
            this.quarto = "Luxo";
        }else if(opcao == 3){
            this.quarto = "Presidencial";
        }


        //Número de diárias
        System.out.print("Número de diárias (máximo 3): ");
        this.numeroDiarias = sc.nextInt();
        funcionalidade.verificarOpcao(1, 3, this.numeroDiarias);


        //Cálculo valor total estadia
        if(this.quarto.equalsIgnoreCase("standard")){
            this.valorEstadia = this.numeroDiarias * 200;
        }else if(this.quarto.equalsIgnoreCase("luxo")){
            this.valorEstadia = this.numeroDiarias * 400;
        }else if(this.quarto.equalsIgnoreCase("presidencial")){
            this.valorEstadia = this.numeroDiarias * 600;
        }

        System.out.println(
                (
                        "\nREVISÃO\n" +
                                "---------------------------\n" +
                                "Nome completo: %s\n" +
                                "CPF: %s\n" +
                                "Quarto selecionado: %s\n" +
                                "Número de estadias: %d\n" +
                                "Valor total: R$%.2f\n\n"
                ).formatted(
                        this.nome,
                        this.cpf,
                        this.quarto,
                        this.numeroDiarias,
                        this.valorEstadia
                )
        );


    }

    //Métodos getters e setters

    // getters
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

    //setters

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
