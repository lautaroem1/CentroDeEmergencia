package fel;

import eventos.Evento;

import java.util.LinkedList;



public class Fel {
	private static Fel fel;
	private LinkedList<Evento> lista;
        
	private Fel(){
            lista = new LinkedList<>();
	}
	
	public static Fel getFel(){
		if(fel == null)
			fel = new Fel();
		return(fel);
	}
	
	public void insertarFel(Evento e){

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
