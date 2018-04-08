package eventos;

import fel.Fel;
import fel.GeneradorTiempos;
import fel.Queue;
import hospital.Servidor;

import java.util.Collections;

public class EventoArribo extends Evento {

    public EventoArribo(float tiempo) {
		/*
		Generar item desde este constructor y pasarlo como parametro
		No se puede hacer porque java requiere que super sea lo primero en llamarse
		*/
        super((byte) 0, tiempo, new Item(Item.getCantidadItems() + 1, tiempo));
        // Considero que inicia en item n°1
        Item.setCantidadItems(Item.getCantidadItems() + 1);
        // Actualizo la cantidad de Items.

    }

    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Planificar el nuevo evento de arribo */

        if (!servidor.isOcupado()) {
            // Si el servidor no esta ocupado...
            this.getItem().setTiempoDuracionServicio(GeneradorTiempos.getTiempoDuracionServicio());
            // se setea a si musmo el tiempo de Duracion de Servicio...
            // y planifica nueva Salida.
            EventoSalida eventoSalida = new EventoSalida(this.getTiempo() + this.getItem().getTiempoDuracionServicio(), this.getItem());
            // Insertamos en la Fel el evento de salida
            Fel.getFel().insertarFel(eventoSalida);


        } else {
            queue.insertarCola(this.getItem());
        }
        // El evento de Arribo genera otro de arribo, lo insertamos en la Fel.
        Fel.getFel().insertarFel(new EventoArribo(this.getTiempo() + GeneradorTiempos.getTiempoEntreArribos()));

        Collections.sort(Fel.getFel().getLista());
        // Para que queden ordenados de manera cronologica. Mismo que arriba.

        // Implementar coleccion de estadisticas.


    }


}
