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
        super((byte) 0, tiempo, new Item(Item.getCantidadItems()+1,tiempo)); //Considero que inicia en item n°1
        Item.setCantidadItems(Item.getCantidadItems()+1);//Actualizo la cantidad de Items.

    }


    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Planificar el nuevo evento de arribo */

        if(!servidor.isEstado()){
            this.getItem().setTiempoDuracionServicio(GeneradorTiempos.getTiempoDuracionServicio());
            //Planificar Nueva Salida en tiempo t+s*
        }
        else{
            queue.insertarCola(this.getItem());
        }
        Evento arriboProximo=new EventoArribo(this.getTiempo()+GeneradorTiempos.getTiempoEntreArribos());
        Fel.getFel().getLista().add(arriboProximo);
        Collections.sort(Fel.getFel().getLista()); //Para que queden ordenados de manera cronologica

        //Coleccionar Estadisticas



    }


}
