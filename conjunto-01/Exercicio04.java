/*
    Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
*/

public class Exercicio04 {

    public static void main(String[] args) {
        
        double n1, n2, n3, n4, media;
        n1 = 8;
        n2 = 6.5;
        n3 = 10;
        n4 = 5.5;

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média do aluno é de: " + media);
    }
}