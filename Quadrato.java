package figure;
import java . util . Scanner ;
public class Quadrato extends Rettangolo {
	Scanner input = new Scanner ( System . in );

	public double CalcoloPerimetro () {
    	return 2*(base+altezza);
    }
	
	
	public double CalcoloArea () {
		return base*altezza;
	}
}
