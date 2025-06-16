package br.com.dio.main;

import java.util.Scanner;
import br.com.dio.model.ContaBanco;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        String saldoStr = scanner.nextLine().replace(",", ".");
        double saldo = Double.parseDouble(saldoStr);

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                conta.nomeCliente(), conta.agencia(), conta.numero(), conta.saldo());

        scanner.close();
    }
}
