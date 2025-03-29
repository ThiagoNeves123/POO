public class PlanoAssinatura {

    private String nome_plano = "Familia";
    private int limiteqtd = 10;
    private int total = 4;
    private double valor = 80;
    private double desconto;


    public void AddAssinante(){

        if(total < limiteqtd){
            total++;
     }
        else{
            System.out.println("Limite de assinantes excedido!");
        }
     }
    public void OfertarDesconto(){

        desconto = valor * 0.3;
        valor = valor - desconto;

        if(desconto > valor * 0.5){
            System.out.println("Limite de desconto excedido!");
        }
        else{
            System.out.println("Desconto: " + valor);

        }
    }
    public String getNome(){
        return nome_plano;
    }

    public double getValor(){
        return valor;
    }

    public int getTotal(){
        return total;
    }

    public void exibirDados(){
        System.out.println(getNome());
        System.out.println(getTotal());
        System.out.println(getValor());
    }


}
