import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        String str;
        System.out.println("enter the number of cigarettes used in the party");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the day of the week");
        str=sc.next();
        if(str.equals("sunday")||str.equals("saturday")){
            if(n>40)
            System.out.println("success");
            else
            System.out.println("failure");
        }
        else{
            if(n>40&&n<60)
            System.out.println("success");
            else
            System.out.println("failure");
        }
     }
}