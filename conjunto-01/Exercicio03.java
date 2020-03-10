/*
    Solicite a quantidade de homens e de mulheres de uma turma da faculdade. 
    Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.
*/

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double qtDeHomens, qtDeMulheres;
        double total;

        System.out.println("Entre com a quantidade de homens: ");
        qtDeHomens = read.nextInt();

        System.out.println("Entre com a quantidade de mulheres: ");
        qtDeMulheres = read.nextInt();

        total = qtDeHomens + qtDeMulheres;

        System.out.println("A porcentagem de homens é de: " + qtDeHomens*100/total + "%");
        System.out.println("A porcentagem de mulheres é de: " + qtDeMulheres*100/total + "%");
    }
}