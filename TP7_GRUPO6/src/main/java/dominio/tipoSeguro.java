package dominio;

public class tipoSeguro{

	private int IdTipo;
	private String Descripcion;
	
	public tipoSeguro() {
	}
	public tipoSeguro(int id) {
		this.IdTipo=id;
	}

	public tipoSeguro(int idTipo, String descripcion) {
		this.IdTipo = idTipo;
		this.Descripcion = descripcion;
	}

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int idTipo) {
		this.IdTipo = idTipo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "tipoSeguro IdTipo=" + IdTipo + ", Descripcion=" + Descripcion;
	}
	
	
}


