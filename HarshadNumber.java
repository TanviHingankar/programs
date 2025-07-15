import java.util.Scanner;
class HarshadNumber{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;

		while(n!=0){
			int d=n%10;
			sum+=d;
			n/=10;
		}
		if(temp%sum==0){
			System.out.println("HarshadNumber");
		}else{
			System.out.println("Not HarshadNumber");
		}
	}
}
