package mediopago;

import java.util.Scanner;

import clases.OrdenDespacho;
import interfaz.MediosPago;
import mainCarro.CarritoCompra;

public class TarjetaDebito implements MediosPago {

	static Scanner sc = new Scanner(System.in);
	@Override
	public OrdenDespacho Pagar() {
		
		String direccion;
		String nombreCliente;
		System.out.printf("Esta seguro que desea pagar con debito el total  de %d?\n", CarritoCompra.calcularTotal());
		System.out.printf("Ingrese S para si y N para no");
		if (sc.nextLine().toUpperCase().equals("S")) {
			System.out.print("Ingrese direccion de despacho: ");
			direccion = sc.nextLine();
			System.out.println("Ingrese nombre del receptor");
			nombreCliente =sc.nextLine();
			return new OrdenDespacho(direccion, nombreCliente);
		}
		else {
			System.out.println("Pago cancelado...\n");
			return null;
		}
		
	
	}
	

}
