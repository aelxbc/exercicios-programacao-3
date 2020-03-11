/*
    Transforme um número Racional (formado por numerador e denominador) para um número Real.
    Antes de dividir, verifique se o denominador é diferente de zero. 
    Emita uma mensagem de alerta ao usuário se for zero.
*/

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        double numerador, denominador, numRacional;
        
        System.out.println("Entre com o numerador: ");
        numerador = read.nextInt();

        System.out.println("Entre com o denominador: ");
        denominador = read.nextInt();
        
        if (denominador != 0) {         
            numRacional = numerador / denominador;
            System.out.println("O número real é: " + numRacional);
        } else {
            System.out.println("Não é possível dividir por zero");
        }
    }
}