package implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import mainCarro.CarritoCompra;

public class ExportarExcel {

	public void exportar(ArrayList<String> ordenCompra) throws IOException { // le informamos que recibira un parametro
																				// Array

		File fichero = new File("Orden_despacho_Carro_Compra.xls");
		if (fichero.exists()) { // Exists revisa si el fichero antes mencionado existe
			System.out.println("Archivo existente. Añadiendo solicitud...");
			try {
				InputStream excelStream = new FileInputStream("Orden_despacho_Carro_Compra.xls");
				HSSFWorkbook libro = new HSSFWorkbook(); // Creamos el libro de trabajo de Excel
				HSSFSheet hoja = libro.getSheetAt(0); // Creamos la hoja de Excel
				int rows = hoja.getLastRowNum();
				HSSFRow fila = hoja.createRow(rows + 1);

				for (int i = 0; i < ordenCompra.size(); i++) {
					HSSFCell celda = fila.createCell((short) i);
					celda.setCellValue(ordenCompra.get(i));
				}

				try {

					FileOutputStream elFichero = new FileOutputStream("Orden_despacho_Carro_Compra.xls");
					libro.write(elFichero);
					elFichero.close();
					libro.close();
					CarritoCompra.vaciarCarro();
					System.out.println("Orden creada correctamente. Volviendo a menu principal. \n");

				} catch (Exception e) {
					System.out.println("Archivo excel abierto, por favor cerrar antes de crear orden");
				}

			} catch (FileNotFoundException fileNotFoundException) {
				System.out.println("The file doesn't exist (No se encontro fichero): " + fileNotFoundException);
			}

		} else {
			HSSFWorkbook libro = new HSSFWorkbook();
			HSSFSheet hoja = libro.createSheet();
			HSSFRow filaNom = hoja.createRow(0);
			ArrayList<String> encabezado = new ArrayList<String>(
					Arrays.asList("Direccion", "Nombre Cliente", "Codigos", "MontoTotal", "FechaCompra"));
			for (int i = 0; i < encabezado.size(); i++) {
				HSSFCell celda = filaNom.createCell((short) i);
				celda.setCellValue(ordenCompra.get(i));
			}

			HSSFRow fila = hoja.createRow(1);
			for (int i = 0; i < ordenCompra.size(); i++) {
				HSSFCell celda = fila.createCell((short) i);
				celda.setCellValue(ordenCompra.get(i));
			}

			try {
				FileOutputStream elFichero = new FileOutputStream("Orden_despacho_Carro_Compra.xls");
				libro.write();
				elFichero.close();
				libro.close();
				CarritoCompra.vaciarCarro();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
