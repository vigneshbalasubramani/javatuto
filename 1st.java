import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        String str;
        int j=0;
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            j++;
        }
        System.out.println("there are "+ j +"digits in the string");
     }
}