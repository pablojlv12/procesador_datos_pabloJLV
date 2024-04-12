package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicheroReader {
	public static void procesarDatos(String fichero) {

		
		int contador = 1;
		BufferedReader ficheroEntrada;
		try {

			// enlaza con un fichero usando las clases de Java
			ficheroEntrada = new BufferedReader(new FileReader(fichero));

			// leo la línea a ver si existe y hay algo
			String linea = ficheroEntrada.readLine();

			
			// mientras que las lineas tengan algo
			while (linea != null ) {
				
				//procesamos la linea leida
				DataProcesor.procesarLinea(linea,contador);
				//leemos otra línea
				linea = ficheroEntrada.readLine();
				contador++;
			}

			ficheroEntrada.close();
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}

	}

}
