package Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/


public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10, 12};
        int cont = 0;

        System.out.print("Vetor : ");
        while(cont < vetor.length ) {
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nOredem inversa: ");
        for(int i = (vetor.length - 1); i >= 0; i-- ){
            System.out.print(vetor[i] + " ");
        }
    }
    
}
