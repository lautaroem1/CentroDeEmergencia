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
            // TODO: 8/4/2018 Si no se puede agregar un elemento a la Fel se deberia notificar al usuario con un cartel de error, y cerrar la simulacion.
            System.exit(-1);
        }
        this.lista.sort(null);
        /*
        Deberia estar ordenando con el compareTo de Evento, sino, usamos directamente la linea de abajo.
        Collections.sort(this.getLista());
        */
    }

    public Evento suprimirFel() {
        return this.lista.removeFirst();
        // Al estar ordenada el removeFirst elimina el evento mas proximo en el tiempo.
    }

    public void mostrarFel() {
        // TODO: 8/4/2018 Implementar un mecanismo para mostrar la Fel.
        System.out.println("MOSTRANDO ESTADO LISTA");
        for(Evento e: this.lista){
            System.out.println("N°Paciente:"+e.getItem().getNumero()+"  Tiempo:"+e.getTiempo()+"  Tipo Evento:"+e.getTipo());

        }
        System.out.println("FIN ESTADO LISTA");
    }
}