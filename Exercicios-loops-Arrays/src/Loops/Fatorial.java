package Loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero; 

        System.out.println("Digite um numero: ");
        numero = scan.nextInt();
        
        int fatorial = 1;

         for (int i = numero ; i >= 1 ; i-- ){
            fatorial = fatorial * i; 
        }
        System.out.println("O fatorial de " + numero + " = " + fatorial);
    }
}
