
public class Main {
    public static void main(String[] arg){
        Carro c1= new Carro( 4,"9BWHE21JX24860951","2019");
        c1.getAnoFabricacao();
        c1.getChassi();
        c1.getCor();
        c1.getNumeroPortas();

        c1.setCor("AZUL");
        System.out.println(" A quantidade de portas : "+ c1.getNumeroPortas());
        System.out.println(" O numero do chassi: "+ c1.getChassi());
        System.out.println(" Ano de fabricação: " +c1.getAnoFabricacao());
        System.out.println("\u001b[1m \u001b[34m" + " a cor escolhida: " + "\u001b[0m" + c1.getCor());
    }

}
