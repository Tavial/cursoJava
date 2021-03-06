import javax.swing.JOptionPane;

/* Escribir un programa que almacene la cadena de caracteres contraseņa en una variable, 
 * pregunte al usuario por la contraseņa hasta que introduzca la contraseņa correcta.
 */

public class Ejercicio009 {

	public static void main (String[] args) {
		String entrada, password = "contraseņa";
		boolean correcta = false;
		do {
			entrada = JOptionPane.showInputDialog("Introduce la contraseņa para acceder: ");
			if (entrada.equals(password)) {
				correcta = true;
				System.out.println ("Contraseņa correcta. Acceso autorizado");
			}
			else {
				System.out.println ("Contraseņa incorrecta. Acceso denegado");
			}
		}
		while (!correcta);
	} //  main
} // class
