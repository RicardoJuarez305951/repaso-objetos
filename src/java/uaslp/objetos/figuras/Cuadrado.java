package uaslp.objetos.figuras;

import uaslp.objetos.Shape;

public class Cuadrado extends Shape {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public Cuadrado(){

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
    public double getArea() {
        return lado*lado;
    }

    @Override
    public String getData() {
        return null;
    }
}
