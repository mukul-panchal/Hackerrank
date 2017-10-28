import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
      int count=0;
        int l=A.length();
        for(int i=0;i<l;i++)
        {
          if(A.charAt(i)!=A.charAt(l-1)){count+=1;
          break;}
          else {
        	  l-=1;
          }
        }
        System.out.println(count==0?"Yes":"No");

        
        
    }
}
