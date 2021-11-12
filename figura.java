package figure;
import java . util . Scanner ;
public abstract class figura {
	Scanner input = new Scanner ( System . in );
	
	//dichiarazione variabili protette
	protected static double perimetro;
	protected static double area;
	//dichiarazione metodi astratti
	public abstract double CalcoloPerimetro ();
	public abstract double CalcoloArea ();

	public figura(double Perimetro,double Area){
		perimetro = Perimetro;
		area = Area;
	}
	//Il metodo switcher fa da interfaccia del programma in se
    public void switcher(String figura) {
    	switch(figura) {
    	case "Triangolo":
    		System.out.println("Inserisci i tre lati del triangolo:");
    		double l1 = input.nextDouble ();
    		double l2 = input.nextDouble ();
    		double l3 = input.nextDouble ();    		              
    		Triangolo t1 = new Triangolo(l1,l2,l3);
    		setPerimetro(t1.CalcoloPerimetro());
    		setArea(t1.CalcoloArea());
    		t1.printInfo();break;
    		
    	case "Triangolo Rettangolo":
    		System.out.println("Inserire rispettivamente i due cateti e l'ipotenusa del triangolo: ");
    		double r1 = input.nextDouble ();
    		double r2 = input.nextDouble ();
    		double r3 = input.nextDouble ();    		              
    		TriangoloRettangolo tr = new TriangoloRettangolo(r1,r2,r3);
    		setPerimetro(tr.CalcoloPerimetro());
    		setArea(tr.CalcoloArea());
    		tr.printInfo();break;
    		
    	case "Quadrato":
    		System.out.println("Inserire il lato del quadrato: ");
    		double lato = input.nextDouble();
    		Quadrato q = new Quadrato(lato);
    		setPerimetro(q.CalcoloPerimetro());
    		setArea(q.CalcoloArea());
    		q.printInfo();break;
    		
    	case "Cerchio":
    		System.out.println("Inserire il raggio del cerchio: ");
    		double raggio = input.nextDouble();
    		Cerchio c = new Cerchio(raggio);
    		setPerimetro(c.CalcoloPerimetro());
    		setArea(c.CalcoloArea());
    		c.printInfo();break;
    		
    	case "Rettangolo":
    		System.out.println("Inserire rispettivamente base e altezza del rettangolo: ");
    		double base = input.nextDouble();
    		double altezza = input.nextDouble();
    		Rettangolo r = new Rettangolo(base, altezza);
    		setPerimetro(r.CalcoloPerimetro());
    		setArea(r.CalcoloArea());
    		r.printInfo();break;
    		
    	}
    		
    	
    }
    //getter e setter
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

