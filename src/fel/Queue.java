package fel;

import eventos.Item;

import java.util.LinkedList;

public class Queue {

    private int cantidadItems;
    private LinkedList cola;

    public Queue() {
        cola = new LinkedList();
        cantidadItems = 0;
    }

    public void insertarCola(Item item) {

    }

    public Item suprimirCola() {

    }

    public boolean HayCola() {
        return this.cantidadItems > 0;
    }
}
