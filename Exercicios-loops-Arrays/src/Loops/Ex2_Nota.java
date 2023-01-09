package Loops;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.*/

import java.util.Scanner;
public class Ex2_Nota {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int nota; 
    while(true){
    System.out.println("Digite uma nota : "); 
    nota = scan.nextInt();
    if (nota > 10 | nota < 0){
        System.out.println("Valor invalido, Digite novamente!");
    }
}

}
}