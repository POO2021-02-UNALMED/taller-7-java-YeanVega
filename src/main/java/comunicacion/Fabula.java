package comunicacion;

public class Fabula extends Escrito {
	
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	
	
	
}
