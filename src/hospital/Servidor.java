package hospital;

import eventos.Item;

public class Servidor {
    private Item item;
    private boolean ocupado;
    private float tiempoOcioso;
    private float tiempoInicioOcio;


    public Servidor() {
        item = null;
        // No hay items en el servidor
        ocupado = false;
        // Desocupado
        tiempoOcioso = 0;
        // Tiempo ocioso inical es de 0.
        tiempoInicioOcio = 0;
        // Inicio de Ocio en 0
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public float getTiempoOcioso() {
        return tiempoOcioso;
    }

    public void setTiempoOcioso(float tiempoOcioso) {
        this.tiempoOcioso = tiempoOcioso;
    }

    public float getTiempoInicioOcio() {
        return tiempoInicioOcio;
    }

    public void setTiempoInicioOcio(float tiempoInicioOcio) {
        this.tiempoInicioOcio = tiempoInicioOcio;
    }
}
