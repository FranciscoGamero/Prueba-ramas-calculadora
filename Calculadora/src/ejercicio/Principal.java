package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, opcion;
		Scanner sc = new Scanner(System.in);
		String aux;

		System.out.println("""
				1.Sumar
				2.Restar
				3.Multiplicar
				4.Dividir
				""");
		aux = sc.nextLine();
		opcion = Integer.parseInt(aux);
		switch (opcion) {
		case 1:
			System.out.println("Introduzca el primer número:");
			aux=sc.next();
			a = Integer.parseInt(aux);
			System.out.println("Introduzca el segundo número:");
			aux=sc.next();
			b = Integer.parseInt(aux);
			System.out.println("El resultado de la suma es: "+(a+b));
			break;
		case 2:
			System.out.println("Introduzca el primer número:");
			aux=sc.next();
			a = Integer.parseInt(aux);
			System.out.println("Introduzca el segundo número:");
			aux=sc.next();
			b = Integer.parseInt(aux);
			System.out.println("El resultado de la suma es: "+(a-b));
			break;
		case 3:
			System.out.println("Introduzca el primer número:");
			aux=sc.next();
			a = Integer.parseInt(aux);
			System.out.println("Introduzca el segundo número:");
			aux=sc.next();
			b = Integer.parseInt(aux);
			System.out.println("El resultado de la suma es: "+(a*b));
			break;
		case 4:
			System.out.println("Introduzca el primer número:");
			aux=sc.next();
			a = Integer.parseInt(aux);
			System.out.println("Introduzca el segundo número:");
			aux=sc.next();
			b = Integer.parseInt(aux);
			System.out.println("El resultado de la suma es: "+(a/b));
			break;
		default:
			System.out.println("Opcion no valida");
		}

	}
}
