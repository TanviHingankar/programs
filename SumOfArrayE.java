import java.util.Arrays;
import java.util.Scanner;
class SumOfArrayE
{
	public static void main(String args[])
	{      System.out.println("Tanvi Hingankar, 23be0674");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		int sum=0;

		for(int i=0; i<=a.length-1;i++)
			a[i]=sc.nextInt();

		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Elements : "+sum);
	}
}