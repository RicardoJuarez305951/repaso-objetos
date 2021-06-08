package uaslp.objetos.figuras;

import uaslp.objetos.Shape;

public class PoligonoRegular extends Shape {
    private int numeroDeLados;
    private double lado;


    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }
    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public void draw() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getArea(){
        double angulo = 360/numeroDeLados;
        double apotema = (lado/2)/Math.tan(Math.toRadians(angulo/2));
        return (lado*numeroDeLados*apotema)/2;
    }

    @Override
    public String getData() {
        return null;
    }
}
