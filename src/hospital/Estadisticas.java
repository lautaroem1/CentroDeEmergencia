package hospital;

public class Estadisticas {
    static float tiempoEsperaMedio=0;
    static float porcentajeTiempoOcioso=0;
    static float tiempoMedioTransito=0;

    // Ver donde y como implementar el calculo final.
    public static void calcularEstadisticas(float tiempoEsperaCola, float tiempoTransito, float tiempoOcioso,
                                            float tiempoFinSimulacion, int cantidadItems) {
        /*Tiempo espera medio por paciente*/
        tiempoEsperaMedio=((float)cantidadItems)/tiempoEsperaCola;
        /*Porcentaje de tiempo Ocioso del médico*/
        porcentajeTiempoOcioso=(tiempoOcioso/tiempoFinSimulacion);
        /*Tiempo medio de tránsito por paciente*/
        tiempoMedioTransito=((float)cantidadItems)/tiempoTransito;
    }
}
