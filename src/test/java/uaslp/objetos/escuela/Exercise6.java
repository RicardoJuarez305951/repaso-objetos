package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void validarConstructorNotNullClaseAlgoritmoX(){
        //Given
        AlgoritmoX algoritmoX = Mockito.mock(AlgoritmoX.class);
        //Then
        assertThat(algoritmoX).isNotNull();
    }

    @Test
    public void dadoUnEnteroAigualAB_GuardarCadenaC(){
        //Given
        Dependencia1 d1 = Mockito.mock(Dependencia1.class);
        Dependencia2 d2 = Mockito.mock(Dependencia2.class);
        Dependencia3 d3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(d1,d2,d3);

        //When
        algoritmoX.algoritmoACubrir(2,2,"Guardado");

        //Then
        verify(d1, times(1)).save("Guardado");
        verify(d3, times(1)).recover();
    }

    @Test
    public void dadoUnEnteroAmenorAB_ImprimirEnteroAyCadenaC(){
        //Given
        Dependencia1 d1 = Mockito.mock(Dependencia1.class);
        Dependencia2 d2 = Mockito.mock(Dependencia2.class);
        Dependencia3 d3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(d1,d2,d3);

        //When
        algoritmoX.algoritmoACubrir(2,4,"Guardado");

        //Then
        verify(d2, times(1)).print(2,"Guardado");
        verify(d3, times(1)).recover();
    }

    @Test
    public void dadoUnEnteroAmayorAB_EnviaEnteroAyEnteroB(){
        //Given
        Dependencia1 d1 = Mockito.mock(Dependencia1.class);
        Dependencia2 d2 = Mockito.mock(Dependencia2.class);
        Dependencia3 d3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(d1,d2,d3);

        //When
        algoritmoX.algoritmoACubrir(4,2,"Guardado");

        //Then
        verify(d3, times(1)).send(4,2);
        verify(d3, times(1)).recover();
    }
}
