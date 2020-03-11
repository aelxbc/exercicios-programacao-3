/**
 * A partir da idade informada de um cidadão diga se ele não pode votar (idade
 * inferior a 16), ou se o voto é facultativo (idade igual a 16 ou 17 ou ainda
 * maior do que 70), ou ainda se o voto é obrigatório 8 para idades entre 18 e
 * 70 (incluindo estes valores).
 */

 import java.util.Scanner;
public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        int idade;

        System.out.println("Entre com a idade: ");
        idade = read.nextInt();
        read.close();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade > 17 && idade < 71) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto facultativo.");
        }
        
    }
}