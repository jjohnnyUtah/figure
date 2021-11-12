package figure;
import java . util . Scanner ;
public class Triangolo extends figura {
	Scanner input = new Scanner ( System . in );

	public double l1,l2,l3;
	Triangolo(double l1,double l2,double l3) {
		super(perimetro,area);
		setl1(l1);
		setl2(l2);
		setl3(l3);
		}
	
    public double CalcoloPerimetro () {
    	return l1+l2+l3;
    }
	public double CalcoloArea () {
		double Perimetro = CalcoloPerimetro();
		return Math.sqrt((Perimetro/2)*((Perimetro/2)-l1)*((Perimetro/2)-l2)*((Perimetro/2)-l3));
	}
	
	public double getl1() {
		return l1;
	}
	public double getl2() {
		return l2;
	}
	public double getl3() {
		return l3;
	}
	public void setl1(double l1){
		this.l1=l1;
	}
	public void setl2(double l2){
		this.l2=l2;
	}
	public void setl3(double l3){
		this.l3=l3;
	}
	
	
	
	
}
