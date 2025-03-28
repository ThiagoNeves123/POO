public class PlanoAssinatura {

    private String nome_plano = "Pro";
    private int limiteqtd = 10;
    private int total = 4;
    private double valor = 80;
    private double desconto;


    public void AddAssinante(){

     for (int i = total; i < limiteqtd; i++) {
         total++;
         System.out.println("Assinante adicionado. Total de assinantes:" + total);

         if(total > limiteqtd){
             System.out.println("Limite de assinantes atingido!");
         }

     }
     }
    public void OfertarDesconto(double desconto){
        
    }
}
