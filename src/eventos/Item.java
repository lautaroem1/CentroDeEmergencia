package eventos;

public class Item {
    private int numero;
    private float tiempoArribo;
    private float tiempoDuracionServicio;
    private static float tiempoEsperaCola = 0;
    private static float tiempoTransito = 0;
    private static int cantidadItems = 0;

    public Item(int numero, float tiempoArribo) {
        this.numero = numero;
        this.tiempoArribo = tiempoArribo;
        this.tiempoDuracionServicio = 0;
    }

    public static int getCantidadItems() {
        return cantidadItems;
    }

    public static void setCantidadItems(int cantidadItems) {
        Item.cantidadItems = cantidadItems;
    }

    public static float getTiempoEsperaCola() {
        return tiempoEsperaCola;
    }

    public static void setTiempoEsperaCola(float tiempoActual, float tiempoDuracionServicio, float tiempoArribo) {
        /* Calcular el tiempo de espera en la Queue */
    }

    public static float getTiempoTransito() {
        return tiempoTransito;
    }

    public static void setTiempoTransito(float tiempoActual, float tiempoArribo) {
		/* 
		Calcular el tiempo de transito en el sistema 
		Se deriva del tiempoActual y tiempoArribo
		*/
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getTiempoArribo() {
        return tiempoArribo;
    }

    public void setTiempoArribo(float tiempoArribo) {
        this.tiempoArribo = tiempoArribo;
    }

    public float getTiempoDuracionServicio() {
        return tiempoDuracionServicio;
    }

    public void setTiempoDuracionServicio(float tiempoDuracionServicio) {
        this.tiempoDuracionServicio = tiempoDuracionServicio;
    }
}
