public class Main {
    public static void main(String[] args) {

        PlanoAssinatura plano = new PlanoAssinatura();

        plano.AddAssinante();


        System.out.println(plano.getTotal());
    }
}