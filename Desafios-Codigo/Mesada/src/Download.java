/*Você foi contratado para criar um gerenciador de pacotes.
Porém, o que restou para você fazer foi o contador de porcentagem de download dos pacotes.
Mas como o espaço para essa informação ficou pequeno,
a empresa optou por fazer uma escala de 10 – 1. 
Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”. */ 

import java.util.Scanner;
public class Download {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um valor de 1 a 10.");
        int tamanho = leitor.nextInt();
        
        switch(tamanho){
          case 1: 
            System.out.println("Download = /");
            break;
          case 2:
            System.out.println("Download = //");
            break;
          case 3:  
            System.out.println("Download = ///");
            break;
          case 4:  
            System.out.println("Download = ////");
            break;
          case 5: 
            System.out.println("Download = /////");
            break;
          case 6:
            System.out.println("Download = //////");
            break;
          case 7: 
            System.out.println("Download = ///////");
            break;
          case 8:
            System.out.println("Download = ////////");
            break;
          case 9:
            System.out.println("Download = /////////");
            break;
          case 10:
            System.out.println("Download = //////////");
            break;
          default:
            System.out.print("invalido!");
        }
        
    }
}
