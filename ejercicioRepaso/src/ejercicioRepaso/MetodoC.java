package ejercicioRepaso;

import java.util.HashMap;
import java.util.Scanner;


public class MetodoC {

	static void menu() {
		System.out.println("-- Menu --");
		System.out.println("Que acción desea realizar: ");
		System.out.println("1) Introducir un termino y su definición en el diccionario");
		System.out.println("2) Mostrar todos los terminos sin las definiciones");
		System.out.println("3) Obtener la definicion de un termino ");
		System.out.println("4) Eliminar un termino y su definición");
		System.out.println("5) Salir");
	}
	
	public static void main(String[] args) {
		HashMap<String, String> diccionario=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		
	}

}
