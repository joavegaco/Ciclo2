import java.util.Scanner;


public class Rectangulo {
	public static void main (String [] args){
	
	Scanner s = new Scanner(System.in);

	System.out.print("Introduzca ancho");
	double ancho = Double.parseDouble(s.nextLine());

	
	System.out.print("Introduzca ancho");
	double largo = Double.parseDouble(s.nextLine());

	double area = largo * ancho;
	System.out.print("El area del rectangulo es: " + area);	
	
	}
}