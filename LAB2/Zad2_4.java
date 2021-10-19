import java.util.Scanner;
import static java.lang.Math.*;

public class Zad2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        int max, min;
        for (int i = 0; i<=num.length-1; i++ )
        {
            num[i] = scan.nextInt();
        }
        min = num[0];
        max = num[0];
        for (int i = 0; i<=num.length-1; i++ )
        {
            if(i>0)
            {

                if (num[i] < min)
                {
                    min = num[i];
                }
                if (num[i] > max)
                {
                    max = num[i];
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}