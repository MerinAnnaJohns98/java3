import java.util.Scanner;
public class ReplaceChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the character to replace:");
        char oldChar=sc.next().charAt(0);
         System.out.println("Enter the new  character:");
        char newChar=sc.next().charAt(0);
        String result=str.replace(oldChar,newChar);
        System.out.println("The string:"+result);
    }
}