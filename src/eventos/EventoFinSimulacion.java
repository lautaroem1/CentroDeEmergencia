package eventos;

import fel.Queue;
import hospital.Servidor;

public class EventoFinSimulacion extends Evento {

    public EventoFinSimulacion(float tiempo) {
        super((byte) 2,tiempo,new Item(-1,-1));
    }/*REVISAR: El tiempo de arribo supongo que tendría que ir un valor inválido y pasarle como parametro de tiempo
     el tiempo de fin de simulacion que para una semana son 10080 minutos*/

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Cuando termina la simulacion no hacer nada */

    }
}
