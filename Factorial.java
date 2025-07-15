import java.util.Scanner;
class factorial{
  public static void main(String args[])
  {   System.out.println("Tanvi hingankar : 23BE0674");

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int fact=1;

     if(n<0){
         System.out.println("Number should be Greater than 0.");
     }else if(n==0){
         System.out.println("Factorial of 0 is 1.");   
    }else{
     for(int i=1; i<=n; i++)
     {
        fact = fact*i;
         
        }}
        System.out.println(fact);
   }

}