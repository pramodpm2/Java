import java.util.Scanner;
public class Main{

    public static void main(String[] args)
    {

        int temp, number, rem, result = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number : ");
        number=sc.nextInt();
        temp = number;

        while (number != 0)
        {
            rem= number % 10;
            result += rem*rem*rem;
            number /= 10;
        }

        if(result == temp)
        {
            System.out.println(temp + " is an Armstrong number.");
        }
        else
        {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
