package clases;

public abstract class Articulos {
	//Atriculos es la clase padre y es abstracta
	/*Que significa que sea abstracta?
	 * Una clase que declara la existencia de métodos pero no la implementación de dichos métodos 
	 * */
	
	//Atributos
	//Clase padre encapsulamiento tipo protected
	
	protected String nombre;
	protected int precio;
	protected String codigo;
	protected int talla;
	protected String marca;
	
	
	
	
	
	public Articulos(String nombre, int precio, String codigo, int talla, String marca) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
	}
	// -------- Setters and Getters --------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
