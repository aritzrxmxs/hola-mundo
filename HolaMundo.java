/**
Miestra por pantalla la frase "¡Hola Mundo!"

@author Aritz Ramos
*/

public class HolaMundo {
	public static void main(String[] args) {
		String naranja = "\033[33m";
		String azul = "\033[34m";

		System.out.println(naranja + "¡Hola Mundos!");
		System.out.println(azul + "¡Mundo!");
	}
}
