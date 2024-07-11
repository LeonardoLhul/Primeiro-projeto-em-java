import java.util.Scanner;

public class DESAFIO {
    public static void main(String[] args) {
        double saldo = 3500;
        int opcao = 0;

        String dadosPessoais = """
                *****************************
                Dados iniciais do Cliente:
                Nome: Leonardo Aguiar
                Tipo de conta: Conta corrente
                Saldo: R$""" + saldo +
                """
                \n*****************************
                """;

        String menu = """
                
                
                Digite sua opção:
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);
        
        System.out.println(dadosPessoais);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto você deseja receber: ");
                double receberValor = leitura.nextDouble();
                saldo += receberValor;
                System.out.println("Seu saldo atual é R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Quanto você deseja transferir: ");
                double transferirValor = leitura.nextDouble();
                if (transferirValor > saldo) {
                    System.out.println("Não há saldo suficiente!");
                } else {
                    saldo -= transferirValor;
                    System.out.println("Saldo atual: R$" + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            }
        }
    }
}