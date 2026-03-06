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

				System.out.println("-----------------------------------------------------------------");
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

		switch (opcion) {
		case 1:
			parte1();
			break;
		case 2:

		case 3:

		case 4:

		case 5:
		}
	}

	static void parte1() {
		ciclosYOperacionesNumericas();
		numeroFactorial();
		cantidadNumeros();
		calcularPromedio();
		sumaDigitos();
	}

	static void ciclosYOperacionesNumericas() {
		int n = 0;
		int sumaTotal = 0;
		try {
			System.out.println("\n-----------------------------------------------------------------\n");
			System.out.println("----- Suma numeros divisibles entre 4 ------");
			System.out.print("Ingrese un numero: ");
			n = Integer.parseInt(leer.next());
		} catch (NumberFormatException e) {
			System.out.println("ERROR... Solo se permiten datos numericos, intente de nuevo");
			ciclosYOperacionesNumericas();
		}
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				sumaTotal += i;
			}
		}
		System.out.println("La suma de los numeros divisibles entre 4 desde 1 hasta " + n + " es: " + sumaTotal);
		System.out.println("\n-----------------------------------------------------------------\n");
	}

	static void numeroFactorial() {
		long factorial = 1;
		int numFac = 0;
		try {
			System.out.println("----- Numero Factorial ------");
			System.out.print("Ingrese un numero: ");
			numFac = Integer.parseInt(leer.next());
		} catch (NumberFormatException e) {
			System.out.println("ERROR... Solo se permiten datos numericos, intente de nuevo");
			numeroFactorial();
		}
		for (int i = 1; i <= numFac; i++) {
			factorial *= i;
		}
		System.out.println("El factorial de " + numFac + " es: " + factorial);
		System.out.println("\n-----------------------------------------------------------------\n");
	}

	static void cantidadNumeros() {
		double numero = 0;
		int numCantidad = 0;
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		boolean cantidadValida = false;

		do {
			try {
				System.out.println("\n----- Numeros Cantidad ------");
				System.out.print("¿Cuantos numeros desea ingresar?: ");
				numCantidad = Integer.parseInt(leer.next());

				if (numCantidad > 0) {
					cantidadValida = true;
				} else {
					System.out.println("Por favor, ingrese un número mayor a 0.");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos enteros, intente de nuevo.");
			}
		} while (!cantidadValida);

		for (int i = 1; i <= numCantidad; i++) {
			try {
				System.out.print("Numero " + i + ": ");
				numero = Double.parseDouble(leer.next());
				if (numero > 0) {
					positivos++;
				} else if (numero < 0) {
					negativos++;
				} else {
					ceros++;
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Dato numerico invalido. Intente de nuevo para este numero.");
				i--;
			}
		}

		System.out.println("\n--- Resumen de los numeros ingresados ---");
		System.out.println("Cantidad de positivos: " + positivos);
		System.out.println("Cantidad de negativos: " + negativos);
		System.out.println("Cantidad de ceros: " + ceros);

	}

	static void calcularPromedio() {
		int num = 0;
		int sumaPares = 0;
		int contadorPares = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("\n----- Numeros Promedio ------");
				System.out.print("Ingrese un numero mayor a 1: ");
				num = Integer.parseInt(leer.next());

				if (num > 1) {
					entradaValida = true;
				} else {
					System.out.println("Ingrese un numero mayor a 1 para que existan numeros pares. ");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos enteros. Intente de nuevo");
			}
		} while (!entradaValida);

		for (int i = 1; i <= num; i++) {
			sumaPares += i;
			contadorPares++;
		}

		if (contadorPares > 0) {
			double promedio = (double) sumaPares / contadorPares;

			System.out.println("\n --- Resultados ---");
			System.out.println("Suma total de pares: " + sumaPares);
			System.out.println("Cantidad de numeros pares encontrados: " + contadorPares);
			System.out.println("El promedio de los pares entre 1 y " + num + " es " + promedio);
		} else {
			System.out.println("No se encontraron numeros pares en el rango...");
		}
	}
	
	static void sumaDigitos() {
		int num = 0;
		boolean entradaValida = false;
		int numProcesar = Math.abs(num);
		int sumaTotal = 0;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Suma numeros digitos ------");
				System.out.print("Ingrese un numero entero: ");
				num = Integer.parseInt(leer.next());
				entradaValida = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos enteros. Intente de nuevo");
			}
		} while (!entradaValida);
		
		while(numProcesar > 0) {
			int ultimoDigito = numProcesar % 10;
			sumaTotal += ultimoDigito;
			numProcesar /= 10;
		}
		
		System.out.println("--- Resultado ---");
		System.out.println("El numero original es: " + num);
		System.out.println("La suma de sus digitos es: " + sumaTotal);
	}

}

























