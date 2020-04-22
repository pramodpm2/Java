import java.util.Scanner;
class compound 
{

    public void calculate(double p,double r,double time)
    {
        double amount;
        double ci;
        double t=1;
        
        r=(1+r/100);
        
        for(int i=0;i<time;i++)
        {
          t*=r;
        }
        System.out.println();
        amount=p*t;  
        ci=amount-p;
        System.out.println("Amount= "+amount);
        System.out.println("Compound Intrest= "+ci);
    }
}

public class Main
{
    public static void main(String args[]) 
    {
        double p,time,r;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal Amount");
        p=sc.nextDouble();
        System.out.println("Enter The Interest Rate");
        r=sc.nextDouble();
        System.out.println("Enter The Time");
        time=sc.nextDouble();
      
    	compound obj = new compound();
    	obj.calculate(p,r,time);
    }
}
