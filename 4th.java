import java.util.*;
public class HelloWorld{
public static int[] a= new int[20];
public static int count(int n){
    if(n==0)
    return 0;
    if(a[n-1]==11)
    return 1+count(n-1);
    else
    return count(n-1);
}
     public static void main(String []args){
         int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values");
        no=sc.nextInt();
        System.out.println("enter the digits");
        for(int i=0;i<no;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the count of 11 is"+ count(no));
     }
}
