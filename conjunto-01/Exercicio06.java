/*
    Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo é ¶ (PI)
    multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível na constante Math.PI
*/

public class Exercicio06 {

    public static void main(String[] args) {

        double area, raio = 5;

        area = Math.PI * (raio*raio);

        System.out.println("A área do círculo é de: " + area + " m²");    
    }

}