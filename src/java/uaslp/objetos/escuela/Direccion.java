package uaslp.objetos.escuela;

public class Direccion {
    private Direccion(){
    }

    private static Direccion uniqueInstance;

    public static Direccion getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Direccion();
        return uniqueInstance;
    }
}
