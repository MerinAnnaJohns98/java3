
import java.util.*;
public class Fact{
    public static void main(String[] args){
        //AUTHOR:Merin Anna Johns
        // Date:19/7/25
        System.out.println("eneter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1,i;
        System.out.println("enter the fact");;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(" the factorial is"+f);
    }
}
