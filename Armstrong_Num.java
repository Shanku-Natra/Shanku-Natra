package Numbers;
import java.util.*;
public class Armstrong_Number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = obj.nextInt(); //n= 153 , 1634
		int t = n; // t = 153
		int d=0;
		int sum =0;
		// no of digits
		while(n > 0)
		{
			int rem = n%10;
			d++; // d = 3
			n= n/10;
		}
		n = t; // n = 153
		while(n>0)
		{
			int rem = n%10; // rem = 153%10 = 3,5,1
			sum = sum + (int)Math.pow(rem, d);
			n = n/10;
		}
		if(t == sum )
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
