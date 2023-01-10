/*DESAFIO - A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida
na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada
e a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse
a velocidade permitida de 60km/h.
O seu papel será o de criar um programa que verifique os dados recebidos da câmera
e envie uma mensagem dizendo se o motorista será multado ou não. */

import java.util.Random;
public class Multa {
    public static void main(String[] args) {
        
        Random leitor = new Random();
        int velocidadeAtual = leitor.nextInt(120);
        
        if(velocidadeAtual > 60){
          System.out.print("Velocidade : " + velocidadeAtual + "KM" + "\nFoi multado");
        }else{
          System.out.print("Velocidade : " + velocidadeAtual + "KM" + "\nNao foi multado");
        }
        
    }
}
