package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura {
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
        return "Poligono Regular";
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
