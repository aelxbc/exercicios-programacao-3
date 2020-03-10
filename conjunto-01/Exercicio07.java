// Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da despesa de um cliente.

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double despesa , comissao;

        System.out.println("Entre com a despesa do cliente: ");
        despesa = read.nextDouble();

        comissao = despesa * 0.10;

        System.out.println("A commissão de um garçom é de: " + comissao + " R$");
    }
}