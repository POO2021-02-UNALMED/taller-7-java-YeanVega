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

	public String getEnse�anza() {
		return ense�anza;
	}

	public void setEnse�anza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina;
	}
	
	@Override
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" 
				+ getPaginas() + "\n" + ense�anza + "\n" + interpretacion;
	}
	
	
	
	
}
