package figure;
import java . util . Scanner ;
public class Cerchio extends figura {
	Scanner input = new Scanner ( System . in );
	
	Cerchio(double raggio) {
		super(perimetro,area);
		}
	public double raggio;
	public double CalcoloPerimetro () {
    	return raggio*2*3.1415;
    }
	
	
	public double CalcoloArea () {
		return 3.1415*raggio*raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}

}
