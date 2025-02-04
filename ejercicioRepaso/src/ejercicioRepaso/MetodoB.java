package ejercicioRepaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Palabra {
	String termino;
	String definicion;
	
	public Palabra(String termino, String definicion) {
		this.termino = termino;
		this.definicion = definicion;
	}

	String getTermino() {
		return termino;
	}

	String getDefinicion() {
		return definicion;
	}

	void setTermino(String termino) {
		this.termino = termino;
	}

	void setDefinicion(String definicion) {
		this.definicion = definicion;
	}	
}

public class MetodoB {

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
		List<Palabra> diccionario=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		int opcion=0;
		
		while(opcion!=5){
		MetodoB.menu();
		opcion=sc.nextInt();
		
		switch(opcion) {
		case 1: 
			System.out.print("introduzca el termino: ");
			String termino=sc.next();
			String vacio=sc.nextLine();
			System.out.println("introduzca la definción: ");
			String definicion=sc.nextLine();
			diccionario.add(new Palabra(termino, definicion));
			System.out.println();
			break;
		
		case 2: 
			for(int i=0; i<diccionario.size(); i++) {
				System.out.print(diccionario.get(i).getTermino()+" ");
			}
			break;
		case 3:
			System.out.println("Introduzca una definicion ");
			definicion = sc.next();
			for(int i=0; i<diccionario.size();i++) {
				if(definicion.equals(diccionario.get(i))){//coge la palabra def q el usuario intr y la comp. con la q esta guardada en la pos i 
						System.out.println(diccionario.get(i).getTermino());
				}
				
			}
			break;
		case 4: 
			System.out.print("introduzca el termino: ");
			 termino=sc.next();
			for(int i=0; i<diccionario.size();i++) {
				if(termino.equals(diccionario.get(i))){
					diccionario.remove(i);		
				}
			}
			break;
		case 5:
			 System.out.println("Salir");

			default:
				System.out.println("Opcion Invalida");
			
			}
		}
	}
}