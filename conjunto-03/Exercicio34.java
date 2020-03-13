/**
 * Exiba 50 números sorteados de 1 a 100 para o usuário. 
 */

import java.util.Random;

 public class Exercicio34 {
    public static void main(String[] args) {

        Random gerador = new Random();

        for(int i = 0; i < 50; i++) {
            int n = gerador.nextInt(100) + 1;
            System.out.println("Número da sorte: " + n);
        }
        
    }
}