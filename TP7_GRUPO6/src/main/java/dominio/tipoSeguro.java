package dominio;

public class tipoSeguro{

	int IdTipo;
	String Descripcion;
	
	public tipoSeguro() {
	}

	public tipoSeguro(int idTipo, String descripcion) {
		super();
		IdTipo = idTipo;
		Descripcion = descripcion;
	}

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int idTipo) {
		IdTipo = idTipo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "tipoSeguro IdTipo=" + IdTipo + ", Descripcion=" + Descripcion;
	}
	
	
}
