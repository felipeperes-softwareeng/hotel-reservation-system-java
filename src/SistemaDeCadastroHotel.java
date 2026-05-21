import com.sistemacadastro.entity.Funcionalidades;
import com.sistemacadastro.entity.Hospede;

import java.util.Scanner;

public class SistemaDeCadastroHotel {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Funcionalidades funcionalidade = new Funcionalidades();
        Hospede[] hospede = new Hospede[10];

        int contadorDeCadastro = 0;


        //-----------------------Menu principal-----------------------------------
        while (true){
            System.out.println("SISTEMA DE CADASTRO PARA HÓSPEDES EM HOTEL\n" +
                    "------------------------------------------\n" +
                    "Digite a opção desejada:\n" +
                    "1 - Nova reserva\n" +
                    "2 - Listar reservas\n" +
                    "3 - Buscar reserva por CPF do hóspede\n" +
                    "4 - Ordenar reservas por números de dias (ordem decrescente)\n" +
                    "5 - Sair\n");
            System.out.print("-> ");
            int opcao = sc.nextInt();
            opcao = funcionalidade.verificarOpcao(1, 5, opcao);

            if (opcao == 5){
                break;
            }

            //Cadastro do usuário
            else if(opcao == 1){
                if(contadorDeCadastro <= 10){
                    Hospede novoHospede = new Hospede();
                    novoHospede.cadastrarHospede();

                    System.out.println("Deseja confirmar a hospedagem?\n\n" +
                            "1 - Sim\n" +
                            "2 - Não");
                    System.out.print("-> ");
                    opcao = sc.nextInt();
                    switch (opcao){
                        case 1:
                            hospede[contadorDeCadastro] = novoHospede;

                            contadorDeCadastro++;

                            System.out.println("Reserva confirmada!");
                            break;
                        case 2:
                            System.out.println("Reserva cancelada!");
                            break;
                    }

                }else{
                    System.out.println("O número de hóspedes totais já foi atingido.");
                }
            }

            //Listagem hóspedes
            else if(opcao == 2){

                double valorTotal = 0;

                if (contadorDeCadastro == 0){
                    System.out.println("Não há hóspedes cadastrados");
                }else{
                    for (int i = 0; i < contadorDeCadastro; i++) {

                        funcionalidade.exibirHospede(
                                hospede[i].getNome(),
                                hospede[i].getCpf(),
                                hospede[i].getQuarto(),
                                hospede[i].getNumeroDiarias(),
                                hospede[i].getValorDiarias());

                        valorTotal += hospede[i].getValorDiarias();
                    }
                    System.out.println("Valor total das estadias: R$%.2f\n".formatted(valorTotal));
                }

            }

            //
            else if(opcao == 3){
                sc.nextLine();
                System.out.print("Digite o CPF do hóspede: ");
                String procurarHospede = sc.nextLine();
                boolean hospedeEncontrado = false;

                for (int i = 0; i < contadorDeCadastro; i++) {

                    if (hospede[i].getCpf().equals(procurarHospede)){

                        System.out.println("\nHóspede encontrado!");
                        funcionalidade.exibirHospede(
                                hospede[i].getNome(),
                                hospede[i].getCpf(),
                                hospede[i].getQuarto(),
                                hospede[i].getNumeroDiarias(),
                                hospede[i].getValorDiarias());
                        hospedeEncontrado = true;
                    }

                }
                if(!hospedeEncontrado){
                    System.out.println("\nHóspede não encontrado ou CPF incorreto.\n");
                }

            }

            //Ordenar por ordem decrescente
            else if(opcao == 4){

                if(contadorDeCadastro == 0){

                    System.out.println("Não há hóspedes cadastrados.");

                }else{

                    // Ordenação decrescente
                    for (int i = 0; i < contadorDeCadastro - 1; i++) {

                        for (int j = i + 1; j < contadorDeCadastro; j++) {

                            if(hospede[j].getNumeroDiarias() >
                                    hospede[i].getNumeroDiarias()){

                                Hospede auxiliar = hospede[i];

                                hospede[i] = hospede[j];

                                hospede[j] = auxiliar;

                            }

                        }

                    }

                    System.out.println("\nHÓSPEDES ORDENADOS POR DIÁRIAS\n");

                    for (int i = 0; i < contadorDeCadastro; i++) {

                        funcionalidade.exibirHospede(
                                hospede[i].getNome(),
                                hospede[i].getCpf(),
                                hospede[i].getQuarto(),
                                hospede[i].getNumeroDiarias(),
                                hospede[i].getValorDiarias());

                    }

                }

            }


        }






    }
}
