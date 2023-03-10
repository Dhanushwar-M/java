import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        for(int i=0,j=a.length()-1;i<j;i++,j--)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                System.out.println("Not a palindrome");
            }
            else
            {
                System.out.println("Palindrome");
            }
        
    }
}
}
