package clases;

public class Pantalon extends Articulos{
	
	private String color;
	private int bolsillos;
	
	// Constructor heredado
	
	public Pantalon(String nombre, int precio, String codigo, int talla, String marca, String color, int bolsillos) {
		super(nombre, precio, codigo, talla, marca);
		this.color = color;
		this.bolsillos = bolsillos;
		
	}
	
	
	// Getters and Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBolsillos() {
		return bolsillos;
	}

	public void setBolsillos(int bolsillos) {
		this.bolsillos = bolsillos;
	}

	@Override
	public String toString() {
		return "Pantalon [color=" + color + ", bolsillos=" + bolsillos + ", nombre=" + nombre + ", precio=" + precio
				+ ", codigo=" + codigo + ", talla=" + talla + ", marca=" + marca + "]";
	}
	
	

}
