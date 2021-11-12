package figure;
import java . util . Scanner ;
public class Quadrato extends Rettangolo {
	Scanner input = new Scanner ( System . in );
	
	Quadrato(double lato){
		super(perimetro,area);
	}
	
	//usiamo solo la base visto che il quadrato ha tutti e quattro i lati uguali!
	public double CalcoloPerimetro () {
    	return 4*(base);
    }
	
	
	public double CalcoloArea () {
		return base*base;
	}
	
	public double getLato() {
		return base;
	}

}
