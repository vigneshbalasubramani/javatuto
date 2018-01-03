import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int a,b,c,s;
        System.out.println("enter the three numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=a+b+c;
        if(a==b||b==c){
            s=s-b;
        }
        if(a==c){
            s=s-c;
        }
        System.out.println("the sum is"+s);
     }
}