package mediopago;

import java.util.Scanner;

import clases.OrdenDespacho;
import interfaz.MediosPago;
import mainCarro.CarritoCompra;

public class TarjetaCredito implements MediosPago{
	
	static Scanner sc = new Scanner(System.in);
	@Override
	public OrdenDespacho Pagar() {
		
		String direccion;
		String nombreCliente;
		int cuotas = 0;
		System.out.printf("Esta seguro que desea pagar con credito el total  de %d?\n", CarritoCompra.calcularTotal());
		System.out.printf("Ingrese S para si y N para no");
		if (sc.nextLine().toUpperCase().equals("S")) {
			
			String opcion;
			do { //primer do
				do {
				System.out.println("Seleccione cantidad de cuotas (1-12)");
				String c = sc.nextLine();
				if(c.matches("[0-9]+")) {
					cuotas = Integer.parseInt(c);
					if(cuotas >12 || cuotas <1) {
						System.out.println("Ingrese cuotas entre 1 y 12");
						cuotas =0;
					}
					
				}//cierre if
				else {System.out.println("Ingrese valores numericos");
						cuotas = 0;
				}
					
				} while (cuotas ==0);
				System.out.printf("Esta seguro que desea pagar %d\n en cuotas de %d\n", cuotas, CarritoCompra.calcularTotal()/cuotas);
				System.out.printf("Ingrese S para si y N para no");
				opcion = sc.nextLine().toUpperCase();
			} while (!opcion.equals("S"));// cierre primer do
			
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
