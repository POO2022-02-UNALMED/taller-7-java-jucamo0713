package comunicacion;

public abstract class Pictograma {
	
	private String origen;
	
	public Pictograma(String origen) {
		super();
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	abstract String interpretacion ();
	
	public abstract String toString();
	
}