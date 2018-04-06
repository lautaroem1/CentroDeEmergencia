package eventos;

import fel.Queue;
import hospital.Servidor;

public class EventoFinSimulacion extends Evento {

    public EventoFinSimulacion(float tiempo) {
        super();
    }

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Cuando termina la simulacion no hacer nada */
    }
}
