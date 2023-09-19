package Ejercicio;

public class Peliculas {
    private static int contadorID = 1;
    private int id;
    private String nombre;
    private String genero;

    //CONSTRUCTORES
    public Peliculas() {
    	
    }
    public Peliculas(String nombre, String genero) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.genero = genero;
    }

    //GETS Y SETS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    
    //METODOS
	@Override
	public String toString() {
		return "Pelicula id= " + id + ", nombre= " + nombre + " genero=" + genero;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
    
}