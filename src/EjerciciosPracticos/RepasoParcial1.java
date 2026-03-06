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
			parte2();
			break;
		case 3:
			parte3();
			break;
		case 4:
			parte4();
			break;
		case 5:
		}
	}

	static void parte1() {
		ciclosYOperacionesNumericas();
		numeroFactorial();
		cantidadNumeros();
		calcularPromedio();
		sumaDigitos();
		menuPrincipal();
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

		int numProcesar = Math.abs(num);

		while (numProcesar > 0) {
			int ultimoDigito = numProcesar % 10;
			sumaTotal += ultimoDigito;
			numProcesar /= 10;
		}

		System.out.println("--- Resultado ---");
		System.out.println("El numero original es: " + num);
		System.out.println("La suma de sus digitos es: " + sumaTotal);
	}

	static void parte2() {
		determinarMultiplo();
		divisibleTresNoDos();
		clasificaionHorario();
		menuPrincipal();
	}

	static void determinarMultiplo() {
		int num = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Calcular multiplo ------");
				System.out.print("Ingrese un numero: ");
				num = Integer.parseInt(leer.next());
				entradaValida = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
			}
		} while (!entradaValida);

		System.out.println("\n--- Resultado ---");

		if (num % 7 == 0 && num % 11 == 0) {
			System.out.println("El numero " + num + " es multiplo de 7 y 11");
		} else if (num % 7 == 0) {
			System.out.println("EL numero " + num + " es multiplo de 7");
		} else if (num % 11 == 0) {
			System.out.println("EL numero " + num + " es multiplo de 11");
		} else {
			System.out.println("El numero " + num + " no es multiplo de 7 ni 11");
		}
	}

	static void divisibleTresNoDos() {
		int num = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Numeros divisibles entre 3 pero no en 2 ------");
				System.out.print("Ingrese un numero: ");
				num = Integer.parseInt(leer.next());
				if (num >= 1) {
					entradaValida = true;
				} else {
					System.out.println("Ingrese un numero mayor o igual a 1");
				}

			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
			}
		} while (!entradaValida);

		System.out.println("\n --- Resultado ---");
		System.out.println("Numeros entre 1 y " + num + " que cumple la condicion: ");

		boolean encontroAlguno = false;

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 2 != 0) {
				System.out.print(i + " ");
				encontroAlguno = true;
			}
		}
		if (!encontroAlguno) {
			System.out.println("No se encontraron numeros con caracteristicas de este rango...");

		}

	}

	static void clasificaionHorario() {
		int hora = -1;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Clasificacion Horario ------");
				System.out.print("Ingrese la hora (0-23)");
				hora = Integer.parseInt(leer.next());

				if (hora >= 0 && hora <= 23) {
					entradaValida = true;
				} else {
					System.out.println("Ingresar una hora valida del 0 al 23...");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
			}
		} while (!entradaValida);
		System.out.println("\n --- Resultado ---");

		if (hora >= 6 && hora <= 11) {
			System.out.println("La hora " + hora + ":00 correspone a la mañana");
		} else if (hora >= 12 && hora <= 18) {
			System.out.println("La hora " + hora + ":00 correspone a la tarde");
		} else {
			System.out.println("La hora " + hora + ":00 correspone a la noche");
		}
	}

	static void parte3() {
		convertirANumeroRomano();
		operacionesBasicas();
		menuPrincipal();
	}

	static void convertirANumeroRomano() {
		int numRomano = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Convertir Numero romano ------");
				System.out.print("Ingrese un numero (1 - 5): ");
				numRomano = Integer.parseInt(leer.next());

				if (numRomano >= 1 && numRomano <= 5) {
					entradaValida = true;
				} else {
					System.out.println("Ingrese un numero valido del 1 al 5");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
			}
		} while (!entradaValida);

		switch (numRomano) {
		case 1:
			System.out.println("El numero " + numRomano + " en numeros romanos es: I");
			break;
		case 2:
			System.out.println("El numero " + numRomano + " en numeros romanos es: II");
			break;
		case 3:
			System.out.println("El numero " + numRomano + " en numeros romanos es: III");
			break;
		case 4:
			System.out.println("El numero " + numRomano + " en numeros romanos es: IV");
			break;
		case 5:
			System.out.println("El numero " + numRomano + " en numeros romanos es: V");
			break;
		}

	}

	static void operacionesBasicas() {
		int opcion = 0;
		int a = 0;
		int b = 0;
		int resultado = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Operaciones Basicas ------");
				System.out.println("1. Suma ");
				System.out.println("2. Resta ");
				System.out.println("3. Multiplicacion ");
				System.out.print("Ingrese una opcion (1 - 3): ");
				opcion = Integer.parseInt(leer.next());

				if (opcion >= 1 && opcion <= 3) {
					entradaValida = true;
				} else {
					System.out.println("Ingrese un numero valido del 1 al 3.");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
			}
		} while (!entradaValida);

		switch (opcion) {
		case 1:
			try {
				System.out.println("\n --- Suma ---");
				System.out.print("Ingrese el primer numero: ");
				a = Integer.parseInt(leer.next());
				System.out.print("Ingrese el segundo numero: ");
				b = Integer.parseInt(leer.next());
				resultado = a + b;
				System.out.println("El resultado de la suma de " + a + " + " + b + " = " + resultado);
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
				operacionesBasicas();
			}
			break;

		case 2:
			try {
				System.out.println("\n --- Resta ---");
				System.out.print("Ingrese el primer numero: ");
				a = Integer.parseInt(leer.next());
				System.out.print("Ingrese el segundo numero: ");
				b = Integer.parseInt(leer.next());
				resultado = a - b;
				System.out.println("El resultado de la resta de " + a + " - " + b + " = " + resultado);
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
				operacionesBasicas();
			}
			break;

		case 3:
			try {
				System.out.println("\n --- Multiplicacion ---");
				System.out.print("Ingrese el primer numero: ");
				a = Integer.parseInt(leer.next());
				System.out.print("Ingrese el segundo numero: ");
				b = Integer.parseInt(leer.next());
				resultado = a * b;
				System.out.println("El resultado de la multiplicacion de " + a + " x " + b + " = " + resultado);
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos enteros. Intente de nuevo");
				operacionesBasicas();
			}
			break;
		}

	}
	
	static void parte4() {
		mayorMenorDiferencias();
		tablaDivision();
		cantidadDigitosPares();
		determinarSiEsTriangular();
		promedioNumerosNegativos();
		menuPrincipal();
	}
	
	static void mayorMenorDiferencias(){
		double a = 0;
		double b = 0;
		boolean entradaValida = false;
		
		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Analisis Numerico ------");
				
				System.out.print("Ingrese el primer numero: ");
				a = Double.parseDouble(leer.next());
				
				System.out.print("Ingrese el segundo numero: ");
				b = Double.parseDouble(leer.next());
				entradaValida = true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR... solo se permiten datos numericos. Intente de nuevo.");
			}
		} while (!entradaValida);
		
		double mayor = Math.max(a, b);
		double menor = Math.min(a, b);
		double diferenciaAbsoluta = Math.abs(a - b);

		System.out.println("\n--- Resultados del Analisis ---");
		System.out.println("Numeros ingresados: " + a + " y " + b);
		System.out.println("El numero MAYOR es: " + mayor);
		System.out.println("El numero MENOR es: " + menor);
		System.out.println("La diferencia absoluta entre ambos es: " + diferenciaAbsoluta);
	}
	
	static void tablaDivision() {
		int n = 0;
		boolean entradaValida = false;

		
		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Tabla de Division ------");
				System.out.print("Ingrese un numero entero: ");
				n = Integer.parseInt(leer.next());
				
				if (n == 0) {
					System.out.println("La division entre 0 no esta definida. Por favor, ingrese un numero distinto de 0.");
				} else {
					entradaValida = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos enteros. Intente de nuevo.");
			}
		} while (!entradaValida);

		System.out.println("\n--- Tabla de Division del " + n + " ---");
		
		for (int i = 1; i <= 10; i++) {

			double resultado = (double) n / i;
			
			System.out.println(n + " / " + i + " = " + resultado);
		}
	}
	
	static void cantidadDigitosPares() {
		int num = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Contador de Digitos Pares ------");
				System.out.print("Ingrese un numero entero: ");
				num = Integer.parseInt(leer.next());
				entradaValida = true;
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos enteros. Intente de nuevo.");
			}
		} while (!entradaValida);

		int numProcesar = Math.abs(num);
		int contadorPares = 0;

		if (numProcesar == 0) {
			contadorPares = 1; 
		} else {
			while (numProcesar > 0) {
				int ultimoDigito = numProcesar % 10; 
				
			
				if (ultimoDigito % 2 == 0) {
					contadorPares++; 
				}
				
				numProcesar /= 10; 
			}
		}

		
		System.out.println("\n--- Resultado ---");
		System.out.println("El numero " + num + " contiene " + contadorPares + " digitos pares.");
	}
	
	static void determinarSiEsTriangular() {
		int n = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Verificador de Numero Triangular ------");
				System.out.print("Ingrese un numero entero positivo: ");
				n = Integer.parseInt(leer.next());
				
				if (n > 0) {
					entradaValida = true;
				} else {
					System.out.println("Por favor, ingrese un numero mayor a 0.");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos enteros. Intente de nuevo.");
			}
		} while (!entradaValida);

		int suma = 0;
		int k = 1;

		while (suma < n) {
			suma += k; 
			
			if (suma == n) {
				break; 
			}
			k++; 
		}

			System.out.println("\n--- Resultado ---");
		if (suma == n) {
			System.out.println("El numero " + n + " Si es triangular");
			System.out.println("Explicacion: La suma consecutiva del 1 al " + k + " da exactamente " + n + ".");
		} else {
			System.out.println("El numero " + n + " NO es triangular.");
		}
	}
	
	static void promedioNumerosNegativos() {
		int n = 0;
		boolean entradaValida = false;

		do {
			try {
				System.out.println("\n-----------------------------------------------------------------\n");
				System.out.println("----- Promedio de Numeros Negativos ------");
				System.out.print("Cuantos numeros desea ingresar?: ");
				n = Integer.parseInt(leer.next());

				if (n > 0) {
					entradaValida = true;
				} else {
					System.out.println("Ingrese un numero mayor a 0.");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Solo se permiten datos numericos enteros. Intente de nuevo.");
			}
		} while (!entradaValida);

		double sumaNegativos = 0;
		int contadorNegativos = 0;

		System.out.println("\n Ingrese los " + n + " numeros:");

		for (int i = 1; i <= n; i++) {
			try {
				System.out.print("Numero " + i + ": ");
				double numero = Double.parseDouble(leer.next());

				if (numero < 0) {
					sumaNegativos += numero;
					contadorNegativos++;
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR... Dato numerico invalido. Intente de nuevo para este numero.");
				i--; 
			}
		}

		System.out.println("\n--- Resultado ---");
		
		if (contadorNegativos > 0) {
			
			double promedio = sumaNegativos / contadorNegativos;
			System.out.println("Cantidad de numeros negativos encontrados: " + contadorNegativos);
			System.out.println("El promedio de los numeros negativos es: " + promedio);
		} else {
			
			System.out.println("No hay negativos.");
		}
	}

}
