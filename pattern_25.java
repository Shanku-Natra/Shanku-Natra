package Patterns;
public class pattern_25 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) // 5 rows - 1 2 3 4 5
		{
		for (int j=i; j >= 1 ;j--) // i times
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
		}
	}
}
