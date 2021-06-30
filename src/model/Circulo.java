package model;

public class Circulo extends Forma{

    private int raio;

    @Override
    public double calcularArea() {
        return this.raio * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
