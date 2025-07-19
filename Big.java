import java.util.*;
public class Big{
public static void main(String[] args){
    //Author:Merin Anna Johns
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    System.out.println("enter the first number:");
    n1=sc.nextInt();
    System.out.println("enter the second number:");
    n2=sc.nextInt();
   int bigNumber;
   bigNumber=(n1>n2)?n1:n2;
   System.out.println("I am"+bigNumber+",the BigNumber");
}
}