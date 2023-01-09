package Arrays;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++ ){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros; 
        }

        System.out.print("\nNumeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1 ) + " ");
        }
    }
}
