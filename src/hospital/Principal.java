package hospital;

import eventos.Evento;
import eventos.EventoArribo;
import eventos.EventoFinSimulacion;
import fel.Fel;
import fel.Queue;

import java.util.ListIterator;

public class Principal {
	
	public static void main(String[] args){
		
		boolean finSimulacion = false;
		Evento actual;
		ListIterator iterator;
		float tiempoSimulacion;
		
		/*Creo la lista de eventos futuros*/
		Fel fel = Fel.getFel();
		/*
		Creo la cola de espera
		Queue queue = Queue.getQueue();
		*/
		Queue queue = new Queue();
		/*
		Creo el servidor
			Servidor servidor = Servidor.getServidor();
		*/
		Servidor servidor = new Servidor();

		tiempoSimulacion=0;
		/*Creo evento de Fin de Simulacion y lo cargo a la FEL*/
		fel.insertarFel(new EventoFinSimulacion(10080)); //1 Semana = 10080 Minutos

        /*Creo primer evento de Arribo*/
        fel.insertarFel(new EventoArribo(tiempoSimulacion));

        while(finSimulacion){
            actual=fel.suprimirFel();
            actual.planificarEvento(servidor,queue);//Suponiendo que está ordenada de menor a mayor
            //COntinuar me fui a comer avisame cualquier cosa


        }

	}
}
