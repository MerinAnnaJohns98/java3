import java.util.Scanner;
public class stringPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the string:");
        String str=sc.nextLine().toLowerCase();
        String original="";
        int length=str.length();
        for(i=0;i<length;i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                original+=c;
            }
        }       
        String rev="";
        for(i=original.length()-1;i>=0;i--){
            rev=rev+original.charAt(i);
        }
        if(original.equals(rev)){
        System.out.println("palindrome");
        }
        else{
            System.out.println(" not palindrome");
        }
        sc.close();
    }}

        
        