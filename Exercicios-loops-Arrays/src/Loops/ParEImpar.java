package Loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int cont = 0; 
        int numero;
        int numImpar = 0;
        int numPar = 0;
        
        System.out.println("Quantos numeros você deseja digitar? ");
        quantNumeros = scan.nextInt();

        do{
            cont = cont +1;
            System.out.println("Digigte o " + cont + "° numero: " );
            numero = scan.nextInt();
            if (numero % 2 == 0) numImpar++; 
            else numPar++;
        }while(cont < quantNumeros); 

        System.out.println("Quantidade de numeros Pares: " + numPar);
        System.out.println("Quantidade de numeros impares: " + numImpar);
    }
}
