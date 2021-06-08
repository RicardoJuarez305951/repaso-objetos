package uaslp.objetos.escuela;

public class SalaC implements SalaDeJuntas{
    private static SalaC uniqueInstance;

    @Override
    public String getNombre() {
        return "Sala C";
    }

    public static SalaC getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaC();
        return uniqueInstance;
    }
}
