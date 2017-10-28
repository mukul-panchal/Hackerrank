import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       int t= sc.nextInt();
        sc.nextLine();
               for(int i=0;i<=t;i++)
        {
            String str=sc.nextLine();
            char ch[]=str.toCharArray();
           
                for(int a=0;a<str.length();a++){
                  if(a==0||a%2==0)
                  {System.out.print(ch[a]) ;}
                    
               }
            System.out.print(" ");
            for(int a=0;a<str.length();a++){
                  if(a%2!=0)

                  {System.out.print(ch[a]) ;

                  }
                              
            
        } System.out.print("\n") ;
    
    
        }
    }
}
