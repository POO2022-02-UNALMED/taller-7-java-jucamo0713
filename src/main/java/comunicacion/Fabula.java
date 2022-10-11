package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		this.factor = 1;
	}

	public String toString() {
		return this.resumen()+ "\n"+ this.ensenanza;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	
}
