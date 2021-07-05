package Java;
import java.util.*;
public class Remainder {
protected Scanner in=new Scanner(System.in);
	public void remainder()
	{
		int a,b;
		int c,d;
		
		System.out.printf("\nEnter A value :");
		a=in.nextInt();
		
		System.out.printf("\nEnter B value :");
		
		b=in.nextInt();
		
		c=a/b;
		d=c*b;
		
		
		System.out.printf("\nRemaining : %d",d-a);
	}
}
