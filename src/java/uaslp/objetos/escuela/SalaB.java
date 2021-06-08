package uaslp.objetos.escuela;

public class SalaB implements SalaDeJuntas{
    private static SalaB uniqueInstance;

    @Override
    public String getNombre() {
        return "Sala B";
    }

    public static SalaB getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaB();
        return uniqueInstance;
    }
}
