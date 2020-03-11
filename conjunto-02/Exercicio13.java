/**
 * Acrescente ao problema Exercicio11 a possibilidade dele fazer prova final em caso de recuperação. Neste
*  caso a nota de aprovação passa a ser >= 5.0 e a média deve ser recalculada como sendo
*  (média_anterior + nota de recuperação)/2
 */

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, media, recuperacao;

        System.out.println("Qual o seu nome? ");
        nome = read.nextLine();

        System.out.println("Entre com a primeira nota:");
        nota1 = read.nextDouble();

        System.out.println("Entre com a segunda nota:");
        nota2 = read.nextDouble();

        System.out.println("Entre com a terceira nota:");
        nota3 = read.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            System.out.println(nome + ", você foi aprovado com média: " + media + ".");
            read.close();
        } else if (media >= 5) {
            
            System.out.println(nome + ", você ficou de recuperação com média: " + media + ".");
            
            System.out.println("Entre com a nota da prova final: ");
            recuperacao = read.nextDouble();
            read.close();

            media = (media + recuperacao) / 2;

            if (media >=5) {
                System.out.println(nome + ", você foi aprovado na prova final com média: " + media);    
            } else {
                System.out.println(nome + ", você foi reprovado com média: " + media + ".");
            }

        } else {
            System.out.println(nome + ", você foi reprovado com média: " + media + ".");
            read.close();
        }
        
    }
}