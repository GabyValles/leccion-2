import java.util.Scanner;
public class practica {

	public static void main(String[] args) {
		int edad = 17;

		Scanner user_input = new Scanner(System.in);
		
		edad = user_input.nextInt();
		
		if (edad > 18){
		System.out.println("Eres mayor de edad");
		}
		else{
		System.out.println("Eres menor de edad");
		System.out.println(18 - edad);
		}
		
	}

}
