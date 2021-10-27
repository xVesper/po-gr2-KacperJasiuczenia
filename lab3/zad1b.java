/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	int n = rand.nextInt(100);
	int[] tab = new int[n];
	int i, dodatnie = 0, zerowe= 0, ujemne = 0;
	int min = -1000;
	int max = 1000;
	for (i=0; i<n; i++)
	{
		int s = rand.nextInt((max-min)+1) + min;
		tab[i] = s;
		    if (tab[i]>0) 
		    {
                dodatnie++;
            }
            if (tab[i]==0)
            {
			    zerowe++;
		    }
		    if (tab[i]<0)
		    {
		        ujemne++;
		    }
		        
            System.out.println(s);
	}
	System.out.println("Dodatnie :" + dodatnie);
	System.out.println("Zerowe :" + zerowe);
	System.out.println("Ujemne :" + ujemne);
    }
}
