package fel;

import eventos.Evento;
import javafx.collections.transformation.SortedList;

import java.util.LinkedList;
import java.util.List;



public class Fel {
	private static Fel fel;
	private LinkedList<Evento> lista;
	private Fel(){ lista = new LinkedList<>();

	}
	
	public static Fel getFel(){
		if(fel == null)
			fel = new Fel();
		return(fel);
	}
	
	public void insertarFel(Evento e){
        lista.add(e);
	}

	public Evento suprimirFel(){
		return null;
	}
	
	public void mostrarFel(){

	}
	
	public LinkedList getLista() {
		return lista;
	}
	
}
