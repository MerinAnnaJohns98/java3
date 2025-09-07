import java.util.Scanner;
public class nonrepeatChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterv the string:");
        String str=sc.nextLine();
        int length=str.length();
        int[] count=new int[256];
for(int i=0;i<length;i++){
    count[str.charAt(i)]++;
  }
  for(int i=0;i<length;i++){
    if(count[str.charAt(i)]==1){
        System.out.println("First nonrepeater char is:"+str.charAt(i));
        return;
    }}
    System.out.println("no such character found");
  }
}