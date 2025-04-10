package formas;



public class circulo {
    private double raio;
    private Ponto pontoInicial;

    public circulo(double raio, float x, float y) {
        this.raio = raio;
        this.pontoInicial = new Ponto(x,y);
    }

    public circulo(circulo outro, int x, int y) {
        this.raio = outro.raio;
        this.pontoInicial = new Ponto(x,y);
    }

    public double getRaio(){
        return raio;
    }



    public void setRaio(double raio){
        this.raio = raio;
    }


}
