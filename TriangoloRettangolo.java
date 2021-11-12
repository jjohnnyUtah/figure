package figure;
import java . util . Scanner ;
public class TriangoloRettangolo extends Triangolo {
	Scanner input = new Scanner ( System . in );


	public double CalcoloPerimetro () {
    	return l1+l2+l3;
    }
	
	
	public double CalcoloArea () {
		return l1;
	}
}
