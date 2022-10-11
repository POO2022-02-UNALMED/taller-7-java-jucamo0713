package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	
	public Alfabeto(String origen,String[] letras ,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;		
	}
	
	public String toString() {
		String response= "";
		for(int i =0; i< this.letras.length; i++) {
			response += this.letras[i];
			if(this.letras.length > i+1) {
				response += ", ";
			}
		}
		return response;
	}	
	
}
