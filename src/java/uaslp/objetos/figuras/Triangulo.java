package uaslp.objetos.figuras;

import uaslp.objetos.Shape;

public class Triangulo extends Shape {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){

    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
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
        return base*altura/2;
    }

    @Override
    public String getData() {
        return null;
    }
}
