import java.util.Scanner; 
  
class A 
{ 
    
    public static void decToBinary(int n) 
    { 
        
        int[] binaryNum = new int[1000]; 
   
       int a=n;
        int i = 0; 
        while (n > 0)  
        { 
           
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        System.out.print("Decimal Number "+a+" It's Binary Equivalent Is : ");
        for (int j = i - 1; j >= 0; j--)
        {
            System.out.print(binaryNum[j]);
        }
    } 
      
}
public class Main
{
    public static void main (String[] args)  
    { 
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Decimal Number");
        n=sc.nextInt();
        A ob = new A();
        ob.decToBinary(n); 
    } 
} 
