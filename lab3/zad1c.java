/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	int n = rand.nextInt(100);
	int[] tab = new int[n];
	int i, ile =0;
	int min = -1000;
	int max = 1000;
	for (i=0; i<n; i++)
	{
		int s = rand.nextInt((max-min)+1) + min;
		tab[i] = s;
		System.out.println(tab[i]); 

	}
    int najw = tab[0];
    for (i =1; i<n; i++)
    {
        if (najw<tab[i])
        {
        najw=tab[i];
        }
        if (najw==tab[i])
        {
        ile++;
        }
    }

    System.out.println("Liczba najwieksza :" + najw);
    System.out.println("Ilosc wystapien :" + ile);
 }
}
