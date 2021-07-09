package NewtonRapshon;

import java.util.Scanner;
@SuppressWarnings("resource")//evitar warnings en el teclado en cada m�todo

public class NewtonRapshon {

	public static int Menu() {
		Scanner teclado= new Scanner(System.in);
		int desicion=0;
		System.out.println();
		System.out.println("-----------�BIENVENIDO AL M�TODO DE NEWTON-RHAPSON!---------"
				+ "\nIntegrantes: ADILEM DOBRAS, MARIA SOL TORRES, CLAUDIA SASTRE, JAVIER ASPIROZ." + 
				"\n\t\t\t\tMEN�"
				+ "\n1.Introducir otra semilla."
				+ "\n2.Introducir otra precisi�n." 
				+ "\n3.Introducir otro n�mero M�ximo de Iteraciones."
				+ "\n4.Hacer el c�lculo de la ra�z." 
				+ "\n5.Introducir una nueva ecuaci�n y calcular su ra�ces."
				+ "\n6.Salir");

		System.out.print("Indique la operaci�n que desea realizar: ");

		if (teclado.hasNextInt()) {
			desicion=teclado.nextInt();
		}
		return desicion;
	}

	public static int terminos () {
		Scanner teclado= new Scanner(System.in);
		int terminos=0;

		System.out.println("�Cu�ntos t�rminos desea ingresar?");

		if (teclado.hasNextInt()) {
			do{
				terminos=teclado.nextInt();
				if (terminos<1){
					System.out.println("Introduce un n�mero de t�rminos mayor que 0");
				}
			}	
			while (terminos<1);
		}
		else {
			System.out.println("Valor inv�lido.");
		}

		return terminos;
	}

	public static void Imprimir_Ecuacion (double coefs[],double potencias []) {

		for (int i=0; i<coefs.length; i++){
			if (coefs[i]!=0 && potencias[i]!=0) {

				if (coefs[i]>0) {
					System.out.print(" +" + coefs[i]+"x^"+ potencias[i]);
				}
				else {
					System.out.print(" " + coefs[i]+"x^"+ potencias[i]);
				}
			}

			if (potencias[i]==0){
				if (coefs[i]>0) {
					System.out.print("+ " + coefs[i]);
				}
				else if (coefs[i]<0) {
					System.out.print(" " + coefs[i]);
				}
			}
		}
		System.out.println();//para separar impresiones
	}

	public static double DecisionConsolaDoublePrecision (double valor) { //**AGREGAR UN WHILE PARA QUE PIDA HASTA QUE ESTE BIEN
		Scanner teclado = new Scanner (System.in);
		double respuesta;

		if (teclado.hasNextDouble()) {
			respuesta = teclado.nextDouble();

			if(respuesta==1) { //**mejor usar char para la S
				System.out.println("�Qu� valor desea introducir? (Usar la coma para separar decimales)");

				if (teclado.hasNextDouble()) {
					valor=teclado.nextDouble();
					System.out.print("El valor introducido es: "+ valor);
					System.out.println();
				}

				else {
					valor=0.001;//reestablezco al inicial, ya que puede haber sido cambiado antes
					System.out.println("Valor inv�lido. El valor por defecto es: " + valor);
				}
			}
			else if (respuesta==2) {
				valor=0.001;//reestablezco al inicial, ya que puede haber sido cambiado antes
				System.out.print("El valor por defecto es: " + valor);
				System.out.println();
			}
			else if (respuesta==0) {
				System.out.println("Ha elegido salir");
			}
			else {
				valor=0.001;//reestablezco al inicial, ya que puede haber sido cambiado antes
				System.out.println("Opci�n inv�lida. El valor por defecto es: " + valor);
			}
		}
		else {
			valor=0.001;//reestablezco al inicial, ya que puede haber sido cambiado antes
			System.out.println("Opcion inv�lida. El valor por defecto es: " + valor);
		}

		return valor;
	}
	
	public static double DecisionConsolaDoubleSemilla (double valor) { //**AGREGAR UN WHILE PARA QUE PIDA HASTA QUE ESTE BIEN
		Scanner teclado = new Scanner (System.in);
		double respuesta;

		if (teclado.hasNextDouble()) {
			respuesta = teclado.nextDouble();

			if(respuesta==1) { //**mejor usar char para la S
				System.out.println("�Qu� valor desea introducir? (Usar la coma para separar decimales)");

				if (teclado.hasNextDouble()) {
					valor=teclado.nextDouble();
					System.out.print("El valor introducido es: "+ valor);
					System.out.println();
				}

				else {
					valor=0;//reestablezco al inicial, ya que puede haber sido cambiado antes
					System.out.println("Valor inv�lido. El valor por defecto es: " + valor);
				}
			}
			else if (respuesta==2) {
				valor=0;//reestablezco al inicial, ya que puede haber sido cambiado antes
				System.out.print("El valor por defecto es: " + valor);
				System.out.println();
			}
			else if (respuesta==0) {
				System.out.println("Ha elegido salir");
			}
			else {
				valor=0;//reestablezco al inicial, ya que puede haber sido cambiado antes
				System.out.println("Opci�n inv�lida. El valor por defecto es: " + valor);
			}
		}
		else {
			valor=0;//reestablezco al inicial, ya que puede haber sido cambiado antes
			System.out.println("Opci�n inv�lida. El valor por defecto es: " + valor);
		}

		return valor;
	}

	public static int DecisionConsolaInt (int valor) {
		Scanner teclado = new Scanner (System.in);
		int respuesta;

		if (teclado.hasNextInt()) {
			respuesta = teclado.nextInt();

			if(respuesta==1) {
				System.out.println("�Qu� valor desea introducir? (n�mero entero, por favor)");

				if (teclado.hasNextInt()) {
					valor=teclado.nextInt();
					System.out.print("El valor introducido es: "+ valor);
					System.out.println();
				}

				else {
					valor=10;//reestablezco al inicial, ya que puede haber sido cambiado antes
					System.out.println("Valor inv�lido. El valor por defecto es: " + valor);
				}
			}
			else if (respuesta==2) {
				valor=10;//reestablezco al inicial, ya que puede haber sido cambiado antes
				System.out.print("El valor por defecto es: " + valor);
				System.out.println();
			}
			else if (respuesta==0) {
				System.out.println("Ha elegido salir");
			}
			else {
				valor=10;//reestablezco al inicial, ya que puede haber sido cambiado antes
				System.out.println("Opci�n inv�lida. El valor por defecto es: " + valor);
			}
		}
		else {
			valor=10;//reestablezco al inicial, ya que puede haber sido cambiado antes
			System.out.println("Opci�n inv�lida. El valor por defecto es: " + valor);
		}

		return valor;
	}

	public static double EvaluarEnX (double coefs[], double potencias[], double x) {
		double FuncionEnX=0;
		//Comprobar que hay la misma cantidad de coeficientes que de potencias para poder evaluar
		if (coefs.length==potencias.length) {
			for (int i=0; i<coefs.length; i++) {
				FuncionEnX+= (coefs[i]*Math.pow(x, potencias[i]));
			}
		}
		return FuncionEnX;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		double coefs[]= {};
		double potencias[]= {};
		double coefs_der[]={};
		double potencias_der[]= {};
		double semilla=0;
		double precision=0.001;
		int iteraciones=10;

		//----PRIMERA EJECUCION DEL PROGRAMA----
		System.out.println("-----------�BIENVENIDO AL M�TODO DE NEWTON-RHAPSON!---------"
				+ "\nIntegrantes: ADILEM DOBRAS, MARIA SOL TORRES, CLAUDIA SASTRE, JAVIER ASPIROZ."); 

		//PEDIR LA CANTIDAD DE TERMINOS
		int terminos;
		terminos=terminos();
		if (terminos==0 && terminos>0) { //Si son 0 o negativos, FIN del programa
			System.out.println("Valores no v�lidos. Fin del programa.");//no deber�a pasar nunca
		}

		else {
			// INTRODUCIR LOS COEFICIENTES Y GRADOS
			coefs = new double[terminos];
			potencias = new double[terminos];

			for (int i = 0; i < coefs.length; i++) {// pido la funcion
				System.out.print("Introduce el coeficiente del t�rmino " + (i + 1) + ":");
				if (teclado.hasNextInt()) {
					coefs[i] = teclado.nextInt();
					System.out.print("Introduce el grado de ese t�rmino (para el t�rmino independiente, introduce 0):");

					if (teclado.hasNextInt()) {
						potencias[i] = teclado.nextInt();
					} else {
						System.out.println("Valor inv�lido");
					}
				} else {
					System.out.println("Valor inv�lido");
				}
			}

			// IMPRIMIR LA ECUACION NORMAL
			Imprimir_Ecuacion(coefs, potencias);

			// DERIVAR LA ECUACION
			coefs_der = new double[terminos];
			potencias_der = new double[terminos];
			for (int i = 0; i < terminos; i++) {
				if (potencias[i] == 0) {
					coefs_der[i] = 0;
				} else {
					coefs_der[i] = coefs[i] * potencias[i];
					potencias_der[i] = (potencias[i] - 1);
				}
			}

			//COMPROBAR: Si la derivada es 0, no se puede hacer
			int suma=0;

			for (int i =0; i<coefs_der.length; i++) {
				suma+=Math.abs(coefs_der[i]); //Hace la suma de todos en valor absoluto para saber si hay numeros dentro
			}
			if (suma==0) { //si la suma es 0, es porque todos los elementos son 0
				System.out.println("La derivada es 0, as� que no es posible computar el m�todo Newton-Raphson");
			}
			else {

				// IMPRIMIR LA ECUACION DERIVADA
				Imprimir_Ecuacion(coefs_der, potencias_der);

				//INTRODUCIR LA SEMILLA
				System.out.println("SEMILLA\n" + "Desea (Elegir 1 o 2, 0 para salir):"
						+ "\n\t1.Introducir la semilla para comenzar el c�lculo "
						+ "\n\t2.Trabajar con la semilla por defecto (0)");

				semilla=DecisionConsolaDoubleSemilla(semilla);

				//INTRODUCIR LA PRECISION
				System.out.println("PRECISI�N\n" + "Desea (Elegir 1 o 2, 0 para salir):"
						+ "\n\t1.Introducir la precisi�n para obtener el resultado" + 
						"\n\t2.Trabajar con el valor por defecto (0.001)");

				precision=DecisionConsolaDoublePrecision(precision);

				//INTRODUCIR EL NUMERO MAXIMO DE ITERACIONES
				System.out.println("ITERACIONES\n" + "Desea (Elegir 1 o 2, 0 para salir):"
						+ "\n\t1. Introducir el n�mero m�ximo de iteraciones para obtener el resultado" 
						+ "\n\t2.Trabajar con el valor por defecto (10)");

				iteraciones=DecisionConsolaInt(iteraciones);

				//CALCULO NEWTON
				int i=0;
				double PrecisionActual=Double.MAX_VALUE;	
				double [] Valoresx = new double [iteraciones+1]; //Un espacio para la x1 y el resto para las iteraciones
				Valoresx [0]= semilla;
				System.out.println("SEMILLA:" + "\n\tx1=" + Valoresx[0]); 

				while (i<iteraciones && precision<PrecisionActual) { 

					Valoresx[i+1]=Valoresx[i]-(EvaluarEnX(coefs, potencias, Valoresx[i])/EvaluarEnX(coefs_der, potencias_der,Valoresx[i]));
					System.out.println("Iteraci�n n" + (i+1) +": \n\tx" +(i+2) + "=" + Valoresx[i+1]);	

					PrecisionActual= Math.abs(Valoresx[i]-Valoresx[i+1]);
					System.out.println("La precisi�n Actual es: " + PrecisionActual); 
					i++;
				}
				//En caso de no encontrar la ra�z, m�ximas iteraciones alcanzadas
				if(i==iteraciones){
					System.out.println("Lo sentimos no hemos sido capaces de encontrar la ra�z. "
							+ "Por favor; cambie la semilla, aumente el n�mero de iteraciones m�ximas o reduzca la precisi�n.");
				}
			}
		}

		//----SEGUNDA EJECUCION DEL PROGRAMA---
		int desicion=0; //Para el menu de la segunda ecuacion

		while(desicion!=6) {
			desicion=Menu();

			switch(desicion) {
			case 1:
				System.out.println("Has elegido la opci�n: \n\t1. Introducir otra semilla");
				//INTRODUCIR LA SEMILLA
				System.out.println("Desea (Elegir 1 o 2, 0 para salir):"
						+ "\n\t1.Introducir la semilla para comenzar el c�lculo "
						+ "\n\t2.Trabajar con la semilla por defecto (0)");

				semilla=DecisionConsolaDoubleSemilla(semilla);
				break;
				
			case 2:
				System.out.println("Has elegido la opci�n: \n\t2. Introducir otra precisi�n");
				//INTRODUCIR LA PRECISION
				System.out.println("Desea (Elegir 1 o 2, 0 para salir):"
						+ "\n\t1.Introducir la precisi�n para obtener el resultado" + 
						"\n\t2.Trabajar con el valor por defecto (0.001)");
				precision=DecisionConsolaDoublePrecision(precision);
				break;
				
			case 3:
				System.out.println("Has elegido la opci�n: \n\t3. Introducir otro n�mero m�ximo de iteraciones");
				//INTRODUCIR EL NUMERO MAXIMO DE ITERACIONES
				System.out.println("ITERACIONES\n" + "Desea (Elegir 1 o 2, 0 para salir):"
						+ "\n\t1. Introducir el n�mero m�ximo de iteraciones para obtener el resultado" 
						+ "\n\t2.Trabajar con el valor por defecto (10)");
				iteraciones=DecisionConsolaInt(iteraciones);
				break;
				
			case 4:
				System.out.println("Has elegido la opci�n: \n\t4. Hacer el cálculo la raíz");
				//CALCULO NEWTON
				int k=0;
				double PrecisionActual=Double.MAX_VALUE;	
				double [] Valoresx = new double [iteraciones+1]; //Un espacio para la x1 y el resto para las iteraciones
				Valoresx [0]= semilla;
				System.out.println("SEMILLA:" + "\n\tx1=" + Valoresx[0]); 

				while (k<iteraciones && precision<PrecisionActual) { 

					Valoresx[k+1]=Valoresx[k]-(EvaluarEnX(coefs, potencias, Valoresx[k])/EvaluarEnX(coefs_der, potencias_der,Valoresx[k]));
					System.out.println("Iteraci�n n" + (k+1) +": \n\tx" +(k+2) + "=" + Valoresx[k+1]);	

					PrecisionActual= Math.abs(Valoresx[k]-Valoresx[k+1]);
					System.out.println("La precisi�n Actual es: " + PrecisionActual); 
					k++;
				}
				//En caso de no encontrar la ra�z, m�ximas iteraciones alcanzadas
				if(k==iteraciones){
					System.out.println("Lo sentimos no hemos sido capaces de encontrar la ra�z. "
							+ "Por favor; cambie la semilla, aumente el n�mero de iteraciones m�ximas o reduzca la precisi�n.");
				}
				break;
				
			case 5:
				System.out.println("Has elegido la opci�n: \n\t5.Introducir una nueva ecuaci�n y calcular su ra�ces");
				//PEGAR TODA LA EJECUCION 1 DEL PROGRAMA 
				terminos=terminos();
				if (terminos==0 && terminos>0) { //Si son 0 o negativos, FIN del programa
					System.out.println("Valores no v�lidos. Fin del programa.");
				}

				else {
					// INTRODUCIR LOS COEFICIENTES Y GRADOS
					coefs = new double[terminos];
					potencias = new double[terminos];

					for (int i = 0; i < coefs.length; i++) {// pido la funcion
						System.out.print("Introduce el coeficiente del t�rmino " + (i + 1) + ":");
						if (teclado.hasNextInt()) {
							coefs[i] = teclado.nextInt();
							System.out.print("Introduce el grado de ese t�rmino (para el t�rmino independiente, introduce 0):");

							if (teclado.hasNextInt()) {
								potencias[i] = teclado.nextInt();
							} else {
								System.out.println("Valor inv�lido");
							}
						} else {
							System.out.println("Valor inv�lido");
						}
					}

					// IMPRIMIR LA ECUACION NORMAL
					Imprimir_Ecuacion(coefs, potencias);

					// DERIVAR LA ECUACION
					coefs_der = new double[terminos];
					potencias_der = new double[terminos];
					for (int i = 0; i < terminos; i++) {
						if (potencias[i] == 0) {
							coefs_der[i] = 0;
						} else {
							coefs_der[i] = coefs[i] * potencias[i];
							potencias_der[i] = (potencias[i] - 1);
						}
					}

					//COMPROBAR: Si la derivada es 0, no se puede hacer
					int suma=0;

					for (int i =0; i<coefs_der.length; i++) {
						suma+=Math.abs(coefs_der[i]); //Hace la suma de todos en valor absoluto para saber si hay numeros dentro
					}
					if (suma==0) { //si la suma es 0, es porque todos los elementos son 0
						System.out.println("La derivada es 0, as� que no es posible computar mediante el m�todo Newton-Raphson");
					}
					else {

						// IMPRIMIR LA ECUACION DERIVADA
						Imprimir_Ecuacion(coefs_der, potencias_der);

						//INTRODUCIR LA SEMILLA
						System.out.println("SEMILLA\n" + "Desea (Elegir 1 o 2, 0 para salir):"
								+ "\n\t1.Introducir la semilla para comenzar el c�lculo "
								+ "\n\t2.Trabajar con la semilla por defecto (0)");

						semilla=DecisionConsolaDoubleSemilla(semilla);

						//INTRODUCIR LA PRECISION
						System.out.println("PRECISI�N\n" + "Desea (Elegir 1 o 2, 0 para salir):"
								+ "\n\t1.Introducir la precisi�n para obtener el resultado" + 
								"\n\t2.Trabajar con el valor por defecto (0.001)");

						precision=DecisionConsolaDoublePrecision(precision);

						//INTRODUCIR EL NUMERO MAXIMO DE ITERACIONES
						System.out.println("ITERACIONES\n" + "Desea (Elegir 1 o 2, 0 para salir):"
								+ "\n\t1. Introducir el n�mero m�ximo de iteraciones para obtener el resultado" 
								+ "\n\t2.Trabajar con el valor por defecto (10)");
						iteraciones=DecisionConsolaInt(iteraciones);
						//CALCULO NEWTON
						int j=0;
						double PrecisionActual1=Double.MAX_VALUE;	
						double [] Valoresx1 = new double [iteraciones+1]; //Un espacio para la x1 y el resto para las iteraciones
						Valoresx1 [0]= semilla;
						System.out.println("SEMILLA:" + "\n\tx1=" + Valoresx1[0]); 

						while (j<iteraciones && precision<PrecisionActual1) { 
							Valoresx1[j+1]=Valoresx1[j]-(EvaluarEnX(coefs, potencias, Valoresx1[j])/EvaluarEnX(coefs_der, potencias_der,Valoresx1[j]));
							System.out.println("Iteraci�n n" + (j+1) +": \n\tx" +(j+2) + "=" + Valoresx1[j+1]);	
							PrecisionActual1= Math.abs(Valoresx1[j]-Valoresx1[j+1]);
							System.out.println("La precisi�n Actual es: " + PrecisionActual1); 
							j++;
						}
						//En caso de no encontrar la ra�z, m�ximas iteraciones alcanzadas
						if(j==iteraciones){
							System.out.println("Lo sentimos no hemos sido capaces de encontrar la ra�z. "
									+ "Por favor; cambie la semilla, aumente el n�mero de iteraciones m�ximas o reduzca la precisi�n.");
						}
					}
				}
				break;
			case 6:
				System.out.println("Has elegido salir. �Hasta pronto!");
				break;
			default:
				System.out.println("Opci�n inv�lida, int�ntelo de nuevo\n");
				break;
			}
		}
		teclado.close();
	}
}