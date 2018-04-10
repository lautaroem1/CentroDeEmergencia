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

            // Debe empezar a contar el tiempo de ocio.
            servidor.setTiempoInicioOcio(this.getTiempo());

        } else {
            // De lo contrario, actualizar la cola y planificar proxima Salida con un nuevo Tiempo
            // TODO: 8/4/2018 Queue debe reducirse en 1 y actualizar su cantidad.
            /*Saco item de la cola*/
            /*Genero evento de salida con itemActual*/
            Fel.getFel().insertarFel(new EventoSalida(this.getTiempo() + GeneradorTiempos.getTiempoDuracionServicio(), queue.suprimirCola()));

            // TODO: 8/4/2018 Implementar coleccion de Estadisticas

            /*Colecto tiempo en espera*/
            Item.setTiempoEsperaCola(this.getTiempo(),this.getItem().getTiempoDuracionServicio(),this.getItem().getTiempoArribo());

            /*Colecto tiempo en tránsito*/
            Item.setTiempoTransito(this.getTiempo(),this.getItem().getTiempoArribo());








        }
    }
}
