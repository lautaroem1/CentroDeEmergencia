package eventos;

import fel.Queue;
import hospital.Servidor;

public class EventoSalida extends Evento {

    public EventoSalida(float tiempo, Item item) {

        super((byte) 2,tiempo,item);
    }

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Planificar nuevo evento de salida */
        if(!queue.HayCola()){
            servidor.setEstado(false);
        }
        else{
            //Mañana lo seguiremos
        }
    }
}
