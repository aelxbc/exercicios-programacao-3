/**
 *  Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu salário
 *  liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível empréstimo de 
 *  um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.
 */

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        double salarioLiquido, salarioBruto, salarioDescontos, valorEmprestimo;

        System.out.println("Entre com o valor do salário líquido: ");
        // ex de entrada: 100,01
        salarioBruto = read.nextDouble();

        System.out.println("Entre com o valor dos descontos: ");
        // ex de entrada: 100,02
        salarioDescontos = read.nextDouble();

        salarioLiquido = salarioBruto - salarioDescontos;

        System.out.println("Entre com o valor do empréstimo (ainda não aprovado): ");
        valorEmprestimo = read.nextDouble();

        if (valorEmprestimo > salarioLiquido * 0.3) {
            System.out.println("Empréstimo não aprovado.");
        } else {
            System.out.println("Empréstimo aprovado no valor de: " + valorEmprestimo + " R$");
        }
        
    }
}