package modelo;
import java.io.*;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = -1532668217626159454L;
	
	private String nombre;
	private String direccion;

	// Constructor
	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/**
	 * 
	 * Obtener nombre del cliente
	 * 
	 * @return nombre
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * Establecer nombre del cliente
	 * 
	 * @param nombre
	 * 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * Obtener direccion del cliente
	 * 
	 * @return direccion
	 * 
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * 
	 * Establecer direccion del cliente
	 * 
	 * @param direccion
	 * 
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
