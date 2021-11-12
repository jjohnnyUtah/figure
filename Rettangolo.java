package figure;
import java . util . Scanner ;
public class Rettangolo extends figura {
	Scanner input = new Scanner ( System . in );

    public double base,altezza;
	
    
	public double CalcoloPerimetro () {
    	return 2*(base+altezza);
    }
	
	
	public double CalcoloArea () {
		return base*altezza;
	}
}
