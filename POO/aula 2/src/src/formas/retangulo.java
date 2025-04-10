package formas;

import formas.retangulo;

public class retangulo {
    private Ponto pontoInicial;
    private float largura;
    private float altura;

    public retangulo(float x, float y, float largura, float altura) {
        this.pontoInicial = new Ponto(x,y);
        this.largura = largura;
        this.altura = altura;
    }

    public retangulo(Ponto ponto, float largura, float altura) {
        this.pontoInicial = ponto;
        this.largura = largura;
        this.altura = altura;
    }

    public retangulo(float x, float y, float lado) {
        this.pontoInicial = new Ponto(x, y);
        this.largura = lado;
        this.altura = lado;
    }
}

