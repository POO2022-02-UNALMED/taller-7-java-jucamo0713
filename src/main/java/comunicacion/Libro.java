package comunicacion;

public class Libro extends Escrito {

	private String co_autor;
	private String editorial;
	private String edicion;
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
			String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.edicion = edicion;
		this.editorial = editorial;
		this.interpretacion = interpretacion;
		this.factor = 2;
	}

	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina * this.getPaginas() * 2;
	}

	public String toString() {
		return this.resumen() + "\n"
				+ this.co_autor + "\n" + this.editorial + "\n" + this.edicion;
	}

	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
}
