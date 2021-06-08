package uaslp.objetos.figuras;

//Clase abstracta -> Solo se hereda | No se puede instanciar

public abstract class Figura implements DrawableItem {

    protected int sides[];

    public Figura(int[] sides){
        this.sides = sides;
    }

    public Figura() {

    }

    public int getSides(){
        return sides.length;
    }

    //Métodos concretos
    public int getPerimeter(){
        int perimeter = 0;

        for(int side: sides){
            perimeter += side;
        }
        return perimeter;
    }

    public abstract String getName();

    public abstract double getArea();

    public abstract String getData();
}
