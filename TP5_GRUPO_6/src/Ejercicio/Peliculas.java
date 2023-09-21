package Ejercicio;

public class Peliculas implements Comparable<Peliculas> {
    private static int contadorID = 1;
    private int id;
    private String nombre;
    private Generos genero;

    //CONSTRUCTORES
    public Peliculas() {
    	
    }
    public Peliculas(String nombre, Generos genero) {
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

    public Generos getGenero() {
        return genero;
    }
    
    
    
    public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	//METODOS
	@Override
	public String toString() {
		return id + " - " + nombre + " - " + genero;
		
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
	@Override
	public int compareTo(Peliculas Peli) {
		return this.nombre.compareTo(Peli.getNombre());
	}
    
}