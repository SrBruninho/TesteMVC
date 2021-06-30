package model;

public class Retangulo extends Forma {

    private int altura;
    private int largura;

    @Override
    public double calcularArea() {
        return this.altura * this.largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retângulo, área:" + calcularArea();//"Retangulo{" + "altura=" + altura + ", largura=" + largura +'}';
    }
}
