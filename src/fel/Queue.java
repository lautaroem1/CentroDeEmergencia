package fel;

import eventos.Item;

import java.util.LinkedList;

public class Queue {

    private int cantidadItems;
    private LinkedList<Item> cola;

    public Queue() {
        cola = new LinkedList<>();
        cantidadItems = 0;
    }

    public void insertarCola(Item item) {
        this.cola.addFirst(item);
    }

    public Item suprimirCola() {
        return this.cola.removeFirst();
    }

    public boolean HayCola() {
        return this.cantidadItems > 0;
    }
}
