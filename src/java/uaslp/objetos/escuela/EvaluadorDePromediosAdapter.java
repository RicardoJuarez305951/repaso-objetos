package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String calificaciones){
        List<String> ListaCadenaCalificaciones = new ArrayList<>(Arrays.asList(calificaciones.split(",")));
        List<Double> ListaCalificaciones = new ArrayList<>();

        for(String aux : ListaCadenaCalificaciones){
            ListaCalificaciones.add(Double.parseDouble(aux));
        }
        return evaluadorDePromedios.evalua(ListaCalificaciones);
    }
}
