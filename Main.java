package figure;

import java.util.Scanner;

public class Main {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(">>> Benvenuto, scegli tra una delle opzioni(Ricorda di dover scrivere il nome della figura)");
		System.out.println("  > Triangolo");
		System.out.println("  > Quadrato");
		System.out.println("  > Cerchio");
		System.out.println("  > Triangolo Rettangolo");
		System.out.println("  > Rettangolo");
		
		//non so perche non va
		String choice = input.nextLine();
		//figura.switcher(choice);
	}

}
