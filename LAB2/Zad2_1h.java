import java.util.Scanner;
import static java.lang.Math.*;

public class Zad2_1h {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        int[] num = new int[n];
        for (int i = 0; i<= num.length-1; i++)
        {
            num[i] = scan.nextInt();
            if(abs(num[i]) < pow(i, 2))
            {
                result +=1;
            }
        }
        System.out.println("Ilość liczb: ");
        System.out.println(result);
    }
}