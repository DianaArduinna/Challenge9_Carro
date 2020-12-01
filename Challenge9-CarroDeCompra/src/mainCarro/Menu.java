package mainCarro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import clases.OrdenDespacho;
import implementacion.ExportarExcel;
import interfaz.MediosPago;
import mediopago.TarjetaCredito;
import mediopago.TarjetaDebito;

public class Menu {

	private static MediosPago mediosPago;
	private static ExportarExcel exportador = new ExportarExcel();

	

	static Scanner sc = new Scanner(System.in);

	static void printMenuIni() throws IOException { // metodo

		System.out.println("Bienvenido a la tienda\nQue desea hacer?");

		boolean salir = false;
		int opcion; // Guardar la opcion del usuario

		while (!salir) {

			System.out.println();
			System.out.println("1. Mostrar productos disponibles");
			System.out.println("2. Agregar productos al carrito");
			System.out.println("3. Ver carro de compra");
			System.out.println("4. Pagar");
			System.out.println("5. Salir");
			System.out.println();

			try {

				System.out.println("-------------------------------------------------------\n");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					Productos.mostrarArticulos(); // llamando metodo localizado en clase productos
					break;
				case 2:
					CarritoCompra.agregarProducto(); // metodo agrega productos
					break;
				case 3:
					CarritoCompra.verCarrito();
					break;
				case 4:
					menuPagar();
					break;

				case 5:
					System.out.println("Gracias por su visita");
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debe insertar un número");

			}
		}
	}

	static void menuPagar() throws IOException {

		int opcion;

		System.out.println("Elija su medio de pago:");
		System.out.println("1. Pagar con Tarjeta de credito");
		System.out.println("2. Pagar con debito");
		System.out.println("3. Volver al menu principal");

		try {

			System.out.println("-------------------------------------------------------\n");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				mediosPago = new TarjetaCredito();
				mediosPago.Pagar();

				break;
			case 2:
				mediosPago = new TarjetaDebito();
				mediosPago.Pagar();
				
			

				break;
			case 3:
				printMenuIni();

				break;

			default:
				System.out.println("Solo números entre 1 y 4");
			}
		} catch (InputMismatchException e) {
			System.out.println("Debe insertar un número");

		}

	}
}
