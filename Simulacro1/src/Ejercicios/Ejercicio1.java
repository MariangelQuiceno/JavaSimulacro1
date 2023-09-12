package Ejercicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*¬1. Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
- Total personas registradas
- Cantidad de personas ingresadas
- Cantidad de personas mayores de edad
- Cantidad de personas menores de edad. 
*/

public class Ejercicio1 {
    public static void main(String[] args) {

        String mensaje = 
        "Menu del sistema\n" + 
        "1. Ingresar Usuario\n" + 
        "2. Información Usuarios\n" + 
        "3. Salir\n";

        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> documentos = new ArrayList<String>();
        ArrayList<String> profesiones = new ArrayList<String>();
        ArrayList<Integer> edades = new ArrayList<Integer>();

        int entrada = 0;

        do {
        	
            entrada = Integer.parseInt(JOptionPane.showInputDialog(mensaje + "\n Ingrese una opción"));

            switch (entrada) {
                case 1:
                    String nombreA = JOptionPane.showInputDialog("Ingrese un Nombre");
                    String profesionA = JOptionPane.showInputDialog("Ingrese una Profesión");
                    String documentoA = JOptionPane.showInputDialog("Ingrese un Documento");
                    int edadA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
                   
                    nombres.add(nombreA);
                    documentos.add(documentoA);
                    profesiones.add(profesionA);
                    edades.add(edadA);
                    break;

                case 2:
                    int totalPersonas = nombres.size();
                    int mayoresDeEdad = 0;
                    int menoresDeEdad = 0;

                    for (int i = 0; i < edades.size(); i++) {
                        int edadPersona = edades.get(i);
                        if (edadPersona >= 18) {
                            mayoresDeEdad++;
                        } else {
                            menoresDeEdad++;
                        }
                    }

                    System.out.println("Cantidad de personas ingresadas: " + totalPersonas);
                    System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
                    System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);

                    break;
            }
        } while (entrada != 3);

        System.out.println("Ha salido del sistema...");
    }
    

    
    
}
