package hospital;

import eventos.Item;
import fel.Queue;

public class Estadisticas {

    /*
    Ver donde y como implementar el calculo final.
    public static void calcularEstadisticas(float tiempoEsperaCola, float tiempoTransito, float tiempoOcioso,
                                            float tiempoFinSimulacion, int cantidadItems) {

    }
    */

    public static void recoleccionDeDatos(Item item, Queue queue, float tiempoActual) {
        Item.setTiempoEsperaCola(tiempoActual, item.getTiempoDuracionServicio(), item.getTiempoArribo());
        Item.setTiempoTransito(tiempoActual, item.getTiempoArribo());

    }
}
