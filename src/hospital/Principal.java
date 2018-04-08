package hospital;

import eventos.Evento;
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

		/*Creo evento de Fin de Simulacion y lo cargo a la FEL*/
		fel.insertarFel(new EventoFinSimulacion());
		
		//Continuar con la implementación ...

	}
}
