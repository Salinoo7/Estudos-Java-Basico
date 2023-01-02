public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.escolherCanal(22);

        smartTv.diminuirVolume(); 
        smartTv.diminuirVolume(); 
        smartTv.diminuirVolume(); 
        smartTv.diminuirVolume(); 
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume); 
        
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        



    }
}
