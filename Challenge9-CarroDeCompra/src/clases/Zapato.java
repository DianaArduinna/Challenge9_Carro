package clases;

public class Zapato extends Articulos{
	
	private String modelo;
	
	// Constructor
	public Zapato(String nombre, int precio, String codigo, int talla, String marca, String modelo) {
		super(nombre, precio, codigo, talla, marca);
		this.modelo = modelo;
	}

	//Getters and Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	@Override
	public String toString() {
		return "Zapato [modelo=" + modelo + ", nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo
				+ ", talla=" + talla + ", marca=" + marca + "]";
	}

	
	
	
	

}
