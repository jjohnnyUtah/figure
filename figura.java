package figure;
import java . util . Scanner ;
public abstract class figura {
	Scanner input = new Scanner ( System . in );

	protected static double perimetro;

	protected static double area;
	public abstract double CalcoloPerimetro ();
	
	public abstract double CalcoloArea ();

	public figura(double perimetro,double area){
		this.perimetro = perimetro;
		this.area = area;
	}
    public figura(String figura) {
    	switch(figura) {
    	case "Triangolo": {
    		               System.out.println("Inserisci i tre lati del triangolo :");
    		               double l1 = input . nextDouble ();
    		               double l2 = input . nextDouble ();
    		               double l3 = input . nextDouble ();    		              
    		               Triangolo t1 = new Triangolo(l1,l2,l3,perimetro,area);
    		               setPerimetro(t1.CalcoloPerimetro());
    		               setArea(t1.CalcoloArea());
    	                  }
    	
    	}
    	
    }

    public void printInfo() {
    	System.out.println("Il perimetro è "+ getperimetro() +'\n'+"L'area è "+ getarea());
    }
    public double getperimetro() {
		return perimetro;
	}
	public double getarea() {
		return area;
	}
	public static void setPerimetro(double Perimetro){
		perimetro=Perimetro;
	}
	public static void setArea(double Area){
		area=Area;
	}
}

