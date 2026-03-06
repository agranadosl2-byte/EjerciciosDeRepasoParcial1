package EjerciciosPracticos;

import java.util.Scanner;

public class RepasoParcial1 {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuPrincipal();

	}

	// Parte 1

	static void menuPrincipal() {
		int opcion = 0;
		do {
			try {
				
				System.out.println("\n ------ Menu Principal ------ \n");
				System.out.println("1. Parte Ciclos y Operaciones Numericas.");
				System.out.println("2. Parte Condiciones y divisibilidad.");
				System.out.println("3. Parte Uso de switch.");
				System.out.println("4. Parte Analisis numerico.");
				System.out.println("5. Salir");
				System.out.print("Ingrese una opcion (1-5): ");
				opcion = Integer.parseInt(leer.next());
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos, intente de nuevo");
				menuPrincipal();
			}
		} while (opcion < 1 || opcion >= 5);
	}
}
