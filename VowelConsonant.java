import java.util.Scanner;
public class VowelConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine().toLowerCase();
        int vowel=0, consonants=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                if("aeoiu".indexOf(c)!=-1)
                vowel++;
                else
                consonants++;
                }
            
        }
        System.out.println("Vowels:" + vowel);
         System.out.println("Consonants:"+ consonants);
        sc.close();
    }
}