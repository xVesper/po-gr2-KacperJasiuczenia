import java.util.Scanner;

public class Zad1f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int suma = 0;
        while(i != n) {
            int k = in.nextInt();
            suma += k * k;
            i++;
        }
        System.out.println(suma);
    }
}