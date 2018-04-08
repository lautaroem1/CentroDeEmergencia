package eventos;

import fel.Fel;
import fel.GeneradorTiempos;
import fel.Queue;
import hospital.Servidor;

public class EventoSalida extends Evento {

    public EventoSalida(float tiempo, Item item) {

        super((byte) 1,tiempo,item);
    }

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Planificar nuevo evento de salida */
        if(!queue.HayCola()){
            servidor.setEstado(false);
        }
        else{
            int duracionServicio= GeneradorTiempos.getTiempoDuracionServicio();
            EventoSalida eventoSalida=new EventoSalida(this.getTiempo()+duracionServicio,queue.suprimirCola());
            Fel.getFel().insertarFel(eventoSalida);

            //Coleccionar Estadisticas
        }
    }
}
