package clases;

import java.util.ArrayList;
import java.util.Date;

import mainCarro.CarritoCompra;

public class OrdenDespacho {
	
	private String nombreCliente;
	private String dirDespacho;
	private ArrayList<String>codigos;
	private int montoTotal;
	private Date fechaCompra;
	
	
	
	public OrdenDespacho(String nombreCliente, String dirDespacho) {
		super();
		this.nombreCliente = nombreCliente;
		this.dirDespacho = dirDespacho;
		this.codigos = obtenerCodigo();
		this.montoTotal = CarritoCompra.calcularTotal();
		this.fechaCompra = new Date();
		
	}



	/*public OrdenDespacho(String nombreCliente, String dirDespacho, ArrayList<String> codigos, int montoTotal,
			Date fechaCompra) {
		super();
		this.nombreCliente = nombreCliente;
		this.dirDespacho = dirDespacho;
		this.codigos = codigos;
		this.montoTotal = montoTotal;
		this.fechaCompra = fechaCompra;
	}*/
	
	

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirDespacho() {
		return dirDespacho;
	}

	public void setDirDespacho(String dirDespacho) {
		this.dirDespacho = dirDespacho;
	}

	public ArrayList<String> getCodigos() {
		return codigos;
	}

	public void setCodigos(ArrayList<String> codigos) {
		this.codigos = codigos;
	}

	public int getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	
	//Metodos
	
	ArrayList<String> obtenerCodigo(){
		ArrayList<String> codigos= new ArrayList<String>();
		for (int i=0; i < CarritoCompra.carroCompra.size(); i++) {
				codigos.add(CarritoCompra.carroCompra.get(i).getCodigo());
				
		}
		return codigos;
	}
	
	
	 ArrayList<String> ordenComoArray(){
		ArrayList <String> orden = new ArrayList<String>();
		orden.add(nombreCliente);
		orden.add(dirDespacho);
		orden.add(codigos.toString());
		orden.add(Integer.toString(montoTotal));
		orden.add(fechaCompra.toString());
		return orden;
			
	}
	
	
	

}
