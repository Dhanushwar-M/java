import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        if(a==0 || a==1)
        {
            System.out.println("Not a prime");
        }
        for(int i=1;i<a/2;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            System.out.println("Not a prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}
