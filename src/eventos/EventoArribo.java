package eventos;

import fel.Queue;
import hospital.Servidor;

public class EventoArribo extends Evento {

    public EventoArribo(float tiempo) {
		/*
		Generar item desde este constructor y pasarlo como parametro
		No se puede hacer porque java requiere que super sea lo primero en llamarse
		*/
        super(0, tiempo, new Item());
    }


    public void planificarEvento(Servidor servidor, Queue queue) {
        /* Planificar el nuevo evento de arribo */
    }

}
