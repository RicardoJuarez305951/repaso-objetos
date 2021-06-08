package uaslp.objetos.figuras;

public class Cuadrado extends Figura {
    private double lado = -1;

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
        return "Cuadrado";
    }

    @Override
    public double getArea() {
        if(lado==-1)
            throw new LadoNoProvistoException();
        return lado*lado;
    }

    @Override
    public String getData() {
        return null;
    }
}
