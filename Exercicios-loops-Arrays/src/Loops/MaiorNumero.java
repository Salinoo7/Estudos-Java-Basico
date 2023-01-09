package Loops;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int cont = 0;
        int maior = 0;
        int soma = 0;
        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            cont = cont + 1;
            soma = soma + numero;
            if (numero > maior) maior = numero;
        }while(cont < 5);
        System.out.println("Maior numero : " + maior);
        System.out.println("Média : " + (soma/5));
    }
}