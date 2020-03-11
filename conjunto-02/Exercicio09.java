/*
 *  Verifique se o usuário é maior de idade ou não.
 */

 import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        java.util.Scanner read = new Scanner(System.in);

        int idade;

        System.out.println("Entre com a idade: ");
        idade = read.nextInt();

        if (idade < 18) {
            System.out.println("Você não é maior de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }
        
    }
}