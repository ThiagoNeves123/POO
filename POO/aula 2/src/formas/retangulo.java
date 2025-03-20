package formas;

import formas.retangulo;

public class retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public retangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public retangulo(int x, int y, int lado) {
        this.x = x;
        this.y = y;
        this.largura = lado;
        this.altura = lado;
    }
}

