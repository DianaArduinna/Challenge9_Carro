package clases;

public class Polera extends Articulos{
	
	private String color;
	
	// Constructor

	public Polera(String nombre, int precio, String codigo, int talla, String marca, String color) {
		super(nombre, precio, codigo, talla, marca);
		this.color = color;
		
	}
	
	// Getters and Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override  // se genera con los atributos heredados de Articulo
	public String toString() {
		return "Polera [color=" + color + ", nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo
				+ ", talla=" + talla + ", marca=" + marca + "]";
	}
	
	

}
