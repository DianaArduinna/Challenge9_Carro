package mainCarro;

import clases.Pantalon;
import clases.Polera;
import clases.Zapato;

import java.util.ArrayList;
import java.util.Arrays;

import clases.Articulos;

public abstract class Productos {
	
	/*Se crean de manera estatica para poder acceder a ellos
	 * */
	
	//String nombre, int precio, String codigo, int talla, String marca, String color, int bolsillos
	static Pantalon pantalon1 = new Pantalon("Skinny Jeans", 12990, "1001", 40,"Americanino", "Rojo", 2);
	static Pantalon pantalon2 = new Pantalon("Jeans", 20990, "1002", 42,"Lee","Azul", 4);
	
	//String nombre, int precio, String codigo, int talla, String marca, String color
	static Polera polera1 = new Polera("polera lisa", 6990, "1022", 38, "Mango", "Azul");
	
	//String nombre, int precio, String codigo, int talla, String marca, String modelo
	static Zapato zapato1 = new Zapato("Venti Z", 29990, "1034", 42, "Gacel","Venti");
	static Zapato zapato2 = new Zapato("Boomer XS", 17990, "1035", 34, "Kids", "Boomer");
	
	
	// los tengo agregados a una lista a cada uno de ellos
	public static ArrayList<Articulos> articulosDis = new ArrayList<Articulos>(
			Arrays.asList(pantalon1, pantalon2, polera1, zapato1, zapato2));
	
	public static void mostrarArticulos() {  //metodo que muestra los articulos llamados desde el menu op1
		System.out.println("\n");
		for(int i=0; i<articulosDis.size();i++) {  // recorre
			System.out.println("- "+articulosDis.get(i).toString()); // muestra lo que hay en cada articulo
		}
		System.out.println("\n");
	}
	

}
