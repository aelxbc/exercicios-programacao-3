/**
 * Solicite o nome e as três notas de uma disciplina que o usuário cursa. Em seguida informe se ele foi
*  aprovado, ficou de recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de
*  recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0
 */
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, media;

        System.out.println("Qual o seu nome? ");
        nome = read.nextLine();

        System.out.println("Entre com a primeira nota:");
        nota1 = read.nextDouble();

        System.out.println("Entre com a segunda nota:");
        nota2 = read.nextDouble();

        System.out.println("Entre com a terceira nota:");
        nota3 = read.nextDouble();

        read.close();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            System.out.println(nome + ", você foi aprovado com média: " + media + ".");
        } else if (media >= 5) {
            System.out.println(nome + ", você ficou de recuperação com média: " + media + ".");
        } else {
            System.out.println(nome + ", você foi reprovado com média: " + media + ".");
        }
    }
}