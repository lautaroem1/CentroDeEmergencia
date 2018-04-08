package eventos;

import fel.Fel;
import fel.GeneradorTiempos;
import fel.Queue;
import hospital.Servidor;

public class EventoSalida extends Evento {

    public EventoSalida(float tiempo, Item item) {
        super((byte) 1, tiempo, item);
    }

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Planificar nuevo evento de salida */
        if (!queue.HayCola()) {
            // Si no hay cola, marcar al Servidor como no ocupado.
            servidor.setOcupado(false);
        } else {
            // De lo contrario, actualizar la cola y planificar proxima Salida con un nuevo Tiempo
            // TODO: 8/4/2018 Queue debe reducirse en 1 y actualizar su cantidad.
            Fel.getFel().insertarFel(new EventoSalida(this.getTiempo() + GeneradorTiempos.getTiempoDuracionServicio(), queue.suprimirCola()));

            //Coleccionar Estadisticas
        }
    }
}
