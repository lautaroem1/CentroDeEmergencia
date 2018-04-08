package hospital;

import eventos.Evento;
import eventos.EventoArribo;
import eventos.EventoFinSimulacion;
import fel.Fel;
import fel.Queue;

import java.util.ListIterator;

public class Principal {

    public static void main(String[] args) {

        boolean finSimulacion = false;
        Evento actual;
        ListIterator iterator;
        float tiempoSimulacion;

        // Creo la Fel, Queue y Servidor
        Fel fel = Fel.getFel();
        Queue queue = new Queue();
        Servidor servidor = new Servidor();

        // Inicializamos el tiempo de la simulacion.
        tiempoSimulacion = 0;
        // Creo evento de Fin de Simulacion y lo cargo a la FEL, con 'tiempo' igual al tiempo que se desea ejecutar la simulacion.
        fel.insertarFel(new EventoFinSimulacion(10080)); // 1 Semana = 10080 Minutos

        // Creo primer evento de Arribo
        fel.insertarFel(new EventoArribo(tiempoSimulacion));

        while (!finSimulacion) {
            // Actual toma el primer elemento del la Fel, el cual es el mas cercano en el tiempo.
            actual = fel.suprimirFel();
            // Actualizamos el tiempo de Simulacion.
            tiempoSimulacion = tiempoSimulacion + actual.getTiempo();

            // Planificamos el evento proximo a partir de 'actual'
            actual.planificarEvento(servidor, queue);

            if (actual.getTipo() == 2) {
                // Si el evento es de 'FinSimulacion' terminar con el loop.
                finSimulacion = true;
            }
        }

        // TODO: 8/4/2018 Se deben mostrar por pantalla los resultados de la simulacion.

    }

}
