import java.util.Scanner;
import static java.lang.Math.*;

public class Zad2_1e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        int factorial = 1;
        int[] num = new int[n];
        for (int i = 0; i<= num.length-1; i++)
        {
            num[i] = scan.nextInt();
        }
        for (int i = 1; i<= num.length-1; i++)
        {
            factorial *=i;
            if (pow(2, i)<= num[i] && num[i]<= factorial)
            {
                result+=1;
            }
        }
        System.out.println("Ilość liczb: ");
        System.out.println(result);
    }
}