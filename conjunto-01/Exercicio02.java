/* 
    Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha. 
    Para isto, peça o valor do seu salário e o valor do salário mínimo atual.

    ps: as entradas de ponto flutuante devem ser com vírgula.
*/
import java.util.Scanner;

public class Exercicio02 {

    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        float salario, salarioMinimo, qtDeSalarios;

        System.out.println("Entre com o valor do seu salário: ");
        // ex de entrada 123,45 
        salario = sc.nextFloat();
        
        System.out.println("Entre com o valor do salário mínimo: ");
        // ex de entrada 123,45
        salarioMinimo = sc.nextFloat();
        
        qtDeSalarios = salario / salarioMinimo;
        System.out.println("O salário do funcionário é de " +salario + ", ");
        System.out.println("equivalente a  " +qtDeSalarios+ " salários mínimos de " +salarioMinimo);
    }
}
