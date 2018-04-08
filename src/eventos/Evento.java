package eventos;

import fel.Queue;
import hospital.Servidor;

public abstract class Evento implements Comparable<Evento> {

    private byte tipo;
	/*
	Codificacion
		0: Arribo
		1: Fin de Servicio
		2: Fin de Simulacion
	*/
    private float tiempo;
	
    private Item item;

    public Evento(byte tipo, float tiempo, Item item) {
        this.tiempo=tiempo;
        this.item=item;
        this.tipo=tipo;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Implementa la planiificacion de eventos.
     */
    public abstract void planificarEvento(Servidor servidor, Queue queue);


    @Override
    public int compareTo(Evento o) { //Ordenar por menor tiempo

        return Float.compare(this.getTiempo(),o.getTiempo());
        }

    }
