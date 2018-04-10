package hospital;

import eventos.Evento;
import eventos.EventoArribo;
import eventos.EventoFinSimulacion;
import eventos.Item;
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
        fel.insertarFel(new EventoFinSimulacion(50)); // 1 Semana = 10080 Minutos

        // Creo primer evento de Arribo
        fel.insertarFel(new EventoArribo(tiempoSimulacion));
        fel.mostrarFel();

        while (!finSimulacion) {
            // Actual toma el primer elemento del la Fel, el cual es el mas cercano en el tiempo.
            actual = fel.suprimirFel();
            // Actualizamos el tiempo de Simulacion.
            tiempoSimulacion =actual.getTiempo();

            // Planificamos el evento proximo a partir de 'actual'
            actual.planificarEvento(servidor, queue);

            if (actual.getTipo() == 2) {
                // Si el evento es de 'FinSimulacion' terminar con el loop.
                finSimulacion = true;
            }
            fel.mostrarFel();
        }

        // TODO: 8/4/2018 Se deben mostrar por pantalla los resultados de la simulacion.
        Estadisticas.calcularEstadisticas(Item.getTiempoEsperaCola(),Item.getTiempoTransito(),servidor.getTiempoOcioso(),tiempoSimulacion,Item.getCantidadItems());
        System.out.println("##############################################");
        System.out.println("#########RESULTADOS DE LA SIMULACION##########");
        System.out.println("##############################################");
        System.out.println("\n**Tiempo medio de espera de los pacientes:  ");
        System.out.println("    *"+Estadisticas.tiempoEsperaMedio);
        System.out.println("\n**Porcentaje de tiempo ocioso del médico:     ");
        System.out.println("    *"+Estadisticas.porcentajeTiempoOcioso);
        System.out.println("\n**Tiempo medio de tiempo de tránsito:    ");
        System.out.println("    *"+Estadisticas.tiempoMedioTransito);

    }

}
