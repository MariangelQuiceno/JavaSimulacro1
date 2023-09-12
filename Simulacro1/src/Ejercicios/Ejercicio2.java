package Ejercicios;
import javax.swing.JOptionPane;

/*2. Haga un algoritmo donde se construya un arreglo resultante de la suma de 2 arreglos del mismo tamaño, el nuevo arreglo mostrará en cada posición el resultado de la suma de las 
 * mismas posiciones de los otros 2, para el llenado de los 2 arreglos, solicite el ingreso al usuario, adicionalmente debe mostrar el contenido de los 3 arreglos, tanto los iniciales como el resultante. 
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\n Ingrese la cantidad de numeros que va a tener el arreglo"));
		
		int[] arreglo1 = new int[cantidadNumeros];
		int[] arreglo2 = new int[cantidadNumeros];
		
		
		 for (int i = 0; i < cantidadNumeros; i++) {
	          int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para el Arreglo 1"));
	          arreglo1[i] = numero1;
	        }
		
		 for (int i = 0; i < cantidadNumeros; i++) {
	          int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para el Arreglo 2"));
	          arreglo2[i] = numero2;
		 }
		 
		 
		 int[] numerosR1 = arreglo1;
			System.out.print("Numeros Arreglo 1: \n");
			for (int i = 0; i < arreglo1.length; i++) {
			System.out.print("Posición: " + i + " Numero: "+ arreglo1[i] + " \n" );
			}
			
			int[] numerosR2 = arreglo2;
			System.out.print("Numeros Arreglo 1: \n");
			for (int i = 0; i < arreglo2.length; i++) {
			System.out.print("Posición: " + i + " Numero: "+ arreglo2[i] + " \n" );
			}
			

		int[] resultado = sumarArreglos(arreglo1, arreglo2);
		System.out.print("Resultado de la suma: \n");
		for (int i = 0; i < resultado.length; i++) {
		System.out.print("Posición: " + i + " Numero: "+ resultado[i] + " \n" );
		}
	}

	public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
		      
		if (arreglo1.length != arreglo2.length) {
		System.out.print("Los arreglos deben tener el mismo tamaño.");
		}

		int[] resultado = new int[arreglo1.length];

		for (int i = 0; i < arreglo1.length; i++) {
		            resultado[i] = arreglo1[i] + arreglo2[i];
		}

		 return resultado;
	}
		
}

