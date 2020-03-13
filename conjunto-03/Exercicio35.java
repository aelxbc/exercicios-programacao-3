/**
 * Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que o usuário
 * determine a faixa do sorteio.
 */

 import java.util.Scanner;
 import java.util.Random;

 public class Exercicio35 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random gerador = new Random();

        int numerosSorteados, inicioDaFaixa, fimDaFaixa;

        System.out.print("Entre com a quantidade de números sorteios: ");
        numerosSorteados = read.nextInt();

        System.out.print("Entre com a o início da faixa do sorteio: ");
        inicioDaFaixa = read.nextInt();
        
        System.out.print("Entre com  o fim da faixa do sorteio: ");
        fimDaFaixa = read.nextInt();

        read.close();

        for (int i = 0; i < numerosSorteados; i++) {
           int n = gerador.nextInt((fimDaFaixa - inicioDaFaixa) + 1) + inicioDaFaixa;
            System.out.println("---\nNúmero sorteado: " + n);
        }
    }
}