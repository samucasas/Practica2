import java.util.*;
public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, suma, resta, mult;
		double division;
		
		System.out.println("Introduce el número 1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el número 2: ");
		num2 = sc.nextInt();
		
		calculadora cal = new calculadora(num1, num2);
		
		suma = cal.suma();
		resta = cal.resta();
		mult = cal.multiplicacion();
		division = cal.division();
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + mult);
		System.out.println("La división es: " + division);
		

	}

}
