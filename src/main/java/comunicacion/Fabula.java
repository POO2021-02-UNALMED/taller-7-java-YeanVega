package comunicacion;

public class Fabula extends Escrito {
	
	private String ense�anza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ense�anza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ense�anza = ense�anza;
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	
	
	
}
