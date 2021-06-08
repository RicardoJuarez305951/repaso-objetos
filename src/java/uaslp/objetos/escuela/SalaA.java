package uaslp.objetos.escuela;

public class SalaA implements SalaDeJuntas{
    private static SalaA uniqueInstance;

    @Override
    public String getNombre() {
        return "Sala A";
    }


    public static SalaA getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaA();
        return uniqueInstance;
    }
}
