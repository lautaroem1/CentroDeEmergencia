package eventos;

import fel.Queue;
import hospital.Servidor;

public class EventoFinSimulacion extends Evento {

    public EventoFinSimulacion(float tiempo) {
        super((byte) 2,tiempo,new Item(-1,10080));
    }//Tiempo Arribo entiendo que va ser el final(10080 minutos en una semana)

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Cuando termina la simulacion no hacer nada */

    }
}
