class Bird{
    void fly(){
        System.out.println("Bird is flying");
    }
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("Sparrow  fly at short distance");
}}
class Eagle extends Bird{
    void fly(){
        System.out.println("Eagle soar high in the sky");
}}
public class BirdsDetails{
    public static void main(String[] args){
        Bird[] ob=new Bird[3];
        ob[0]=new Bird();
        ob[1]=new Sparrow();
        ob[2]=new Eagle();
        for(Bird b:ob){
            b.fly();
        }
    }
}