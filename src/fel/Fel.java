package fel;

import eventos.Evento;

import java.util.LinkedList;


public class Fel {
    private static Fel fel;
    private LinkedList<Evento> lista;

    private Fel() {
        // Requisito inicializar la LinkedList en el constructor de Fel.
        lista = new LinkedList<>();
    }

    public static Fel getFel() {
        if (fel == null)
            fel = new Fel();
        return (fel);
    }

    public LinkedList getLista() {
        return this.lista;
    }

    public void insertarFel(Evento e) {
        try {
            this.lista.add(e);
        } catch (Exception e1) {
            System.out.println("El sistema no puede agregar elementos a la lista. Error fatal.");
            System.exit(-1);
        }
        this.lista.sort(null);
    }

    public Evento suprimirFel() {
        return this.lista.removeFirst();
        // Al estar ordenada el removeFirst elimina el evento mas proximo en el tiempo.
    }

    public void mostrarFel() {
        // Herramienta de Debug para ver la lista.
        System.out.println("--- MOSTRANDO ESTADO LISTA ---\n");
        for (Evento e : this.lista) {
            System.out.println("N°Paciente:" + e.getItem().getNumero() + "  Tiempo:" + e.getTiempo() + "  Tipo Evento:" + e.getTipo());

        }
        System.out.println("--- FIN ESTADO LISTA --- \n");
    }
}