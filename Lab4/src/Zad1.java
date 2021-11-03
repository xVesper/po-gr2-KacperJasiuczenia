import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;
import static java.lang.Character.*;

public class Zad1 {
    public static int countChar(String str,char c){
        int count=0;
        StringBuffer SB=new StringBuffer();
        SB.append(str);
        for(int i=0; i<=SB.length()-1; i++){
            if(SB.charAt(i)==c)
                count++;
        }
        return count;
    }

    public static int countSubStr(String str,String subStr){
        int count=0;
        StringBuffer SB=new StringBuffer();
        SB.append(str);
        if(subStr.length()>str.length())
            return 0;
        for(int i=0;i<=SB.length()-1;i++){
            if((SB.length()-1) >= i+subStr.length()-1){
                String s=SB.substring(i,i+subStr.length());
                if(s.equals(subStr))
                    count++;
            }
        }
        return count;
    }

    public static String middle(String s){
        StringBuffer SB=new StringBuffer();
        SB.append(s);
        StringBuffer stringBuffer=new StringBuffer();
        if (SB.length()%2==0)
            stringBuffer.append(SB.charAt(SB.length()/2-1)).append(SB.charAt(SB.length()/2));
        if(s.length()%2!=0)
            stringBuffer.append(SB.charAt(SB.length()/2));
        return stringBuffer.toString();
    }

    public static String repeat(String s,int n){
        StringBuffer SB=new StringBuffer();
        String stringBuffer=s;
        for(int i=0;i <=n-1;i++)
            SB.append(stringBuffer);
        return SB.toString();
    }

    public static int[] where(String str,String subStr){
        int n = countSubStr(str,subStr);
        int[] where=new int[n];
        int j=0;
        StringBuffer SB=new StringBuffer();
        SB.append(str);
        for(int i=0; i<=SB.length();i++){
            if((SB.length())>=i+subStr.length()){
                String s=SB.substring(i,i+subStr.length());
                if(s.equals(subStr)){
                    where[j]=i;
                    j++;
                }
            }
        }
        return where;
    }

    public static String change(String str){
        StringBuffer CH=new StringBuffer();
        StringBuffer SB=new StringBuffer();
        SB.append(str);
        for(int i=0;i<=SB.length()-1;i++) {
            if (isLowerCase(SB.charAt(i)))
                CH.append(toUpperCase(SB.charAt((i))));
            if(isUpperCase(SB.charAt(i)))
                CH.append(toLowerCase(SB.charAt(i)));
        }
        return CH.toString();
    }

    public static String nice(String str,char separator,int range){
        StringBuffer decimal=new StringBuffer();
        StringBuffer SB=new StringBuffer();
        SB.append(str);
        int count=0;
        for(int i=SB.length()-1;i>=0;i--){
            if(count==range){
                decimal.append(separator);
                decimal.append(SB.charAt(i));
                count = 0;
            }
            else
                decimal.append(SB.charAt(i));
            count++;
        }
        return decimal.reverse().toString();
    }

    public static int countFromFile(String filePath, char c) throws FileNotFoundException {
        int counter=0;
        Scanner SC=new Scanner(new File(filePath));
        while(SC.hasNext()){
            String str=SC.next();
            for (int i=0;i<=str.length()-1;i++)
                if(str.charAt(i)==c)
                    counter++;
        }
        return counter;
    }

    public static int countWordsFromFile(String filePath, String word) throws FileNotFoundException {
        int counter = 0;
        Scanner sc = new Scanner(new File(filePath));
        while(sc.hasNext()){
            String compare = sc.next();
            if (compare.equalsIgnoreCase(word))
                counter++;
        }

        return counter;
    }

    public static BigInteger ziarna(int n){
        BigInteger wynik=new BigInteger("0");
        BigInteger last=new BigInteger("1");
        BigInteger akt=new BigInteger("1");
        if(n!=0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++) {
                    wynik=wynik.add(akt);
                    akt=last.multiply(new BigInteger("2"));
                    last=akt;
                }
            }
        }
        return wynik;
    }

    public static BigDecimal odsetki(double k,double p,int n){
        BigDecimal odsetki=new BigDecimal("1.0");
        odsetki=odsetki.add(new BigDecimal(""+p/100)).pow(n).multiply(new BigDecimal(""+k)).multiply(new BigDecimal(""+k)).multiply(new BigDecimal("0.01"));
        return odsetki;
    }

    public static void main(String[] args) {
//        zadanie1a
//        String str="Programowanie Obietkowe";
//        char c='e';
//        if(countChar(str, c)==1)
//            System.out.println("W napisie '"+str+"' znak '"+c+"' zostal uzyty "+countChar(str, c)+" raz.");
//        else
//            System.out.println("W napisie '"+str+"' znak '"+c+"' zostal uzyty "+countChar(str, c)+" razy.");

//        zadanie1b
//        String str="Programowanie Obietkowe";
//        String subStr="ow";
//        if(countSubStr(str,subStr)==1)
//            System.out.println("W napisie '"+str+"' wyrazenie '"+subStr+"' zostalo uzyte "+countSubStr(str,subStr)+" raz.");
//        else
//            System.out.println("W napisie '"+str+"' wyrazenie '"+subStr+"' zostalo uzyte "+countSubStr(str,subStr)+" razy.");

//        zadanie1c
//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//        System.out.println(middle(s));

//        zadanie1d
//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//        System.out.println(repeat(s,2));

//        zadanie1e
//        String str="Programowanie Obietkowe";
//        String subStr="ow";
//        int[] tab=where(str,subStr);
//        for(int i=0;i<=tab.length-1;i++)
//            System.out.println(tab[i]+1);

//        zadanie1f
//        System.out.println(change("Programowanie"));

//        zadanie1g
//        System.out.println(nice("0123456789",'|',5));

//        zadanie2
//        System.out.println(countFromFile("E:\\IdeaProjects\\PO-gr2-KacperJasiuczenia\\src\\plik", 'd'));

//        zadanie3
//        System.out.println(countWordsFromFile("E:\\IdeaProjects\\PO-gr2-KacperJasiuczenia\\src\\plik", "c"));

//        zadanie4
//        System.out.println(ziarna(3));

//        zadanie5
//        System.out.println(odsetki(100,1,2));
    }
}
