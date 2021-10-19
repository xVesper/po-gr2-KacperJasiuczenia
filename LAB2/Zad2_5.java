import java.util.Scanner;
import static java.lang.Math.*;

public class Zad2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a,b;
        int[] num = new int[n];
        a= num[0];
        b= num[0];
        for (int i = 0; i<= num.length-1; i++)
        {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i<= num.length-2; i++)
        {
            if(num[i]>0)
            {
                if (num[i]>0)
                {
                    a=num[i];
                }
                if (num[i+1]>0)
                {
                    b=num[i+1];
                }
                System.out.println("Pary: " +"(" +a +"," +b+")" );
            }
        }
    }
}