/* 
    Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do débito, a
    quantidade de meses e os juros mensais. Use o calculo de juros simples.
*/

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double debito, taxaJuros, divida;
        int meses;

        System.out.println("Entre com o valor inicial do débito: ");
        // ex de entrada: 123,45
        debito = read.nextDouble();

        System.out.println("Entre com a quantidade de meses: ");
        // ex de entrada: 12
        meses = read.nextInt();

        System.out.println("Entre com o valor da taxa de juros mensais: ");
        // ex de entrada: 0,10
        taxaJuros = read.nextDouble();

        divida = debito * (1 + (taxaJuros*meses));
        
        System.out.println("O valor final da dívida é de: "  + divida);
    }
}