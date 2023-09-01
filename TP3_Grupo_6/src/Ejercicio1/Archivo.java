package Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

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
	
	public void leerLineas() {
		FileReader entrada;
	
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		   String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
				
				
			}
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	
	public TreeSet<Persona> leerPersonas(){
		
		TreeSet<Persona> listaPersonas= new TreeSet<Persona>();		
		
		try {
			FileReader fr= new FileReader(ruta);
			BufferedReader buffer= new BufferedReader(fr);
			
			String linea=buffer.readLine();
			
			while(linea != null) {
					
				String[] separador=linea.split("-");
				Persona persona= new Persona();
								
				if(separador.length==3) {
					persona.setNombre(separador[0]);
					persona.setApellido(separador[1]);
					persona.setDNI(separador[2]);
					listaPersonas.add(persona);
				}
				
				linea= buffer.readLine();		
			}
				buffer.close();
				fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return listaPersonas;
	}
	
	public TreeSet<Persona> ResultadoValidarDniList() {
		
		TreeSet<Persona> pListPersonas = leerPersonas();
		TreeSet<Persona> pListResulTreeSet = new TreeSet<Persona>();
		for (Persona persona : pListPersonas) {
			try {
				if(!Persona.validarDNI(persona.getDNI())) {
					pListResulTreeSet.add(persona);
				}
			} catch (DNIinvalido e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return pListResulTreeSet;
	}
	
	public void GuardarEnArchivoResultado() {
		Archivo archivo =  new Archivo("Resultado.txt");
		if(!archivo.existe()) {
			archivo.crearArchivo();
			TreeSet<Persona> plistPersonas = ResultadoValidarDniList();
		for (Persona persona : plistPersonas) {
			String nombre = persona.getNombre();
			String apellido = persona.getApellido();
			String dni = persona.getDNI();
			String lineaString = nombre+"-"+apellido+"-"+dni+"\n";
			
			archivo.escribirLineas(lineaString);
		}
		
		}
		
	}

}
