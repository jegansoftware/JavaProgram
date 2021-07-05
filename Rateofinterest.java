package Java;
import java.util.*;
public class Rateofinterest extends Remainder {
	

	protected double n;
	protected double i;
	protected double t;
	protected double p;
	
	public void main()
	{
		
		
		System.out.printf("\nEnter Principle Amount :");
		p=in.nextDouble();
		System.out.printf("\nEnter Rate of Interest :");
		i=in.nextDouble();
		System.out.printf("Enter Time :");	
		t=in.nextDouble();
		
		n=p*i/100*t;
		
		
		
		System.out.printf("Total Interest: %f",n);
		
		super.remainder();
	}


}
