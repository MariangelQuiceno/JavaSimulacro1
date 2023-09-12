package Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

/*3. En la nómina de una empresa se le hace descuento a los empleados por concepto de ahorro, de acuerdo al estrato social en que vive según la tabla. 
 * Solicite el nombre de cada empleado y Calcule e imprima el valor a descontar.
 * Estrato        Descuento
 *  1-2             2%
 *  3-4             4%
 *   5              8%
 *   6              10%
 *   Descuento = sueldoActual * PorcentajeDescuento
 * Use estructuras de datos para almacenar todos los descuentos realizados e imprímalos.
 */


public class Ejercicio3 {
	
public static ArrayList<String> nombres = new ArrayList<String>();
public static ArrayList<Double> datos = new ArrayList<Double>();

static HashMap<String, ArrayList<Double>> mapaSistema = new HashMap<>();

     
	public static void main(String[] args) {
		
        String mensaje = 
        "Menu del Sistema\n" + 
        "1. Ingresar Empleado\n" + 
        "2. Información Empleados\n" + 
        "3. Salir\n";
	
        int entrada = 0;

        do {
        	
            entrada = Integer.parseInt(JOptionPane.showInputDialog(mensaje + "\n Ingrese una opción"));

            switch (entrada) {
                case 1:
                	agregarEmpleado(mapaSistema);
                    break;

                case 2:
                imprimirDescuentos(mapaSistema);
                break;
            }
        } while (entrada != 3);

        System.out.println("Ha salido del sistema...");
    }
	
	

	public static void agregarEmpleado(HashMap<String, ArrayList<Double>> mapaSistema) {
	    String nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado: ");
	    Double estratoE =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Estrato"));
	    Double salarioE =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Salario"));
	    
	    ArrayList<Double> datosEmpleado = new ArrayList<>();
	    datosEmpleado.add(estratoE);
	    datosEmpleado.add(salarioE);

	    mapaSistema.put(nombre, datosEmpleado);
	    JOptionPane.showMessageDialog(null, "Empleado Agregado");
	}
	
	
	
	
    public static void imprimirDescuentos(HashMap<String, ArrayList<Double>> mapaSistema) {
        System.out.println("\n<<<<<<<<<<<<<<< DESCUENTOS >>>>>>>>>>>>>>>");

        for (String nombre : mapaSistema.keySet()) {
            ArrayList<Double> datos = mapaSistema.get(nombre);
            double estrato = datos.get(0);
            double salario = datos.get(1);
            double porcentajeDescuento = calcularPorcentajeDescuento(estrato);
            double descuento = salario * porcentajeDescuento;

            System.out.println(nombre + ": Estrato: " + estrato + ", Salario: " + salario + ", Descuento: " + descuento);
        }
    }

    public static double calcularPorcentajeDescuento(double estrato) {
        double porcentajeDescuento;

        if (estrato >= 1 && estrato <= 2) {
            porcentajeDescuento = 0.2;
        } else if (estrato >= 3 && estrato <= 4) {
            porcentajeDescuento = 0.4;
        } else if (estrato == 5) {
            porcentajeDescuento = 0.8;
        } else if (estrato == 6) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.0; 
        }

        return porcentajeDescuento;
    }
}
