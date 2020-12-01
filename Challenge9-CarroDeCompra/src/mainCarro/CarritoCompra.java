package mainCarro;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Articulos;

public class CarritoCompra {

	public static ArrayList<Articulos> carroCompra = new ArrayList<Articulos>();
	//obtener de manera estatica la info de los productos

	static Scanner sc = new Scanner(System.in);
	
	public static void agregarProducto() {
		System.out.println("Ingrese el codigo del articulo que desea agregar");	
		String opcion = sc.nextLine();

		boolean codigoEncontrado = false;
		for (int i = 0; i < Productos.articulosDis.size(); i++) { // recorriendo la lista de articulos para encontrar el
																	// que necesitamos
			if (opcion.equals(Productos.articulosDis.get(i).getCodigo())) {
				System.out.printf("Esta seguro que desea agregar '%s' al carrito por $%d?\n",
						Productos.articulosDis.get(i).getNombre(), Productos.articulosDis.get(i).getPrecio());
				System.out.println("Ingrese S para si y N para no");
				if (sc.nextLine().toUpperCase().equals("S")) {
					carroCompra.add(Productos.articulosDis.get(i));
					System.out.printf("'%s' agregado correctamente.\n\n", Productos.articulosDis.get(i).getNombre());
					codigoEncontrado = true;
					break;
				} else {
					System.out.printf("Producto '%s' No agregado al carro. \n\n",
							Productos.articulosDis.get(i).getNombre());
					codigoEncontrado = true;
				}
			}

			if (codigoEncontrado = false) {
				System.out.printf("Codigo no encontrado. Intente nuevamente\n\n");
			}

		}
	}
	
	public static void verCarrito() {
		System.out.println("\n");
		for (int i = 0; i < carroCompra.size(); i++) {
			System.out.println("- "+carroCompra.get(i).toString());
		}
		System.out.println("\n");	
		}
	
	public static int calcularTotal() {
		int total = 0;
		for(Articulos a : carroCompra) {
			total+=a.getPrecio();
		}
		return total;
		
	}
	
	public static void vaciarCarro() {
		carroCompra= new ArrayList<Articulos>();  //setea nuevamente el carro de compra y no queda nada dentro de ella
		
	}
}
