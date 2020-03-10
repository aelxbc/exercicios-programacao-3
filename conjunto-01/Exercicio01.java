

//    - Exemplo da apostila
//  Determine qual é a idade que o usuáriop faz no ano atual.
//    Para isso solicite o ano de nascimento do usuário e o ano atual.


import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoAtual, anoNascimento, qtDeAnos;

        System.out.println("Entre com o ano atual: ");
        anoAtual = sc.nextInt();
        
        System.out.println("Entre com o ano de nascimento: ");
        anoNascimento = sc.nextInt();
        
        qtDeAnos = anoAtual - anoNascimento;
        System.out.println("Em " +anoAtual+ " você faz (ou já fez) " +qtDeAnos+ " anos!");
    }
}
