import java.util.Scanner;

public class RevStrBuffer
{
    public static void main(String arr[])
    {
        int ln, i;
        String sentence;
        Scanner sc= new Scanner (System.in);
        System.out.println("\nEnter the string:");
        sentence= sc.nextLine();
        StringBuffer sbf= new StringBuffer(sentence);
        sbf.reverse();
        System.out.println("The reverse of string is "+ sbf);
    }
}