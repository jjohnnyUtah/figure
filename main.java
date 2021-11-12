package figure;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner ( System . in );
		System.out.println("Inserisci i tre lati del triangolo  :");
        double l1 = input . nextDouble ();
        double l2 = input . nextDouble ();
        double l3 = input . nextDouble ();   
        Triangolo t1 = new Triangolo(l1,l2,l3);
        figura.setPerimetro(t1.CalcoloPerimetro());
        figura.setArea(t1.CalcoloArea());
        t1.printInfo();
	}

}
