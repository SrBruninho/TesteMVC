package model;

public class Triangulo extends Forma{

    private int altura;
    private int base;

    @Override
    public double calcularArea() {
        return (this.base * this.altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
