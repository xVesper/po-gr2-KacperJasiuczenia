import java.util.Scanner;

public class Zad2_1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int ile = 0;
        while(i != n) {
            int k = in.nextInt();
            if(k % 2 == 1)
                ile++;
            i++;
        }
        System.out.println(ile);
    }
}