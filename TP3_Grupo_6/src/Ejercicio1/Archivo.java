package Ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	private String ruta;

	public boolean existe() {
		
		File archivo = new File(ruta);
		
		if (archivo.exists()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	///constructores
	public Archivo() {
		this.ruta = "";
	}
	
	public Archivo(String ruta) {
		this.ruta = ruta;
	}
	
	//getters y setters
	public String getRuta() {
		return ruta;
	}
	
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	/// MÉTODOS
	
	public boolean crearArchivo() {
		FileWriter escritura;
			try {
				escritura = new FileWriter(ruta, true);
				escritura.write("");
				escritura.close();
				return true;
			} catch(IOException e) {
				e.printStackTrace();
				System.out.println("No se pudo crear el archivo");
			}
			return false;
	}
	
	public void escribirLineas(String texto) {
		try {
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter buffer = new BufferedWriter(entrada);
			buffer.write(texto);
			buffer.close();
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No se pudo escribir la línea");
		}
	}

}
