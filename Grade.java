import java.util.*;
public class Grade{
public static void main(String[]args){
    //Author:Merin Anna Johns
    // Date:19/7/25
    System.out.println("enter the score:");
    Scanner sc=new Scanner(System.in);
    int mark=sc.nextInt();
    String grade;
    if(mark>=90)
    {grade="A+";
    }
else if(mark>=80)
{
    grade="A";
}
else if(mark>=70)
{
    grade="B+";
}
else if(mark>=60)
{
    grade ="B";
}
    else if(mark>=50)
{
    grade="C+";
}
else if(mark>=40)
{
    grade="C";
}
else if(mark>=30)
{
    grade="D";
}
else{
grade="F";
}
System.out.println("Grade is:"+grade);
}
}