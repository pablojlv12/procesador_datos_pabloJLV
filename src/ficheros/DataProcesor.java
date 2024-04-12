package ficheros;

public class DataProcesor {

	public static void procesarLinea(String linea, int contador) {

		try {
			float num = Float.parseFloat(linea);
			if (num < 0) {
				throw new Exception("Número negativo en línea " + contador);
			}
			System.out.println("[" + contador + "] " + num);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
