package comunicacion;

public abstract class Pictograma {
	
	private String origen;
	protected String interpretacion;
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
	
	public String interpretacion () {
		return this.interpretacion;
	};
	
	public abstract String toString();
	
}