import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0;i<=s.length()-k;i++)
        {
            String str=s.substring(i,i+k);
            if(str.compareTo(smallest)<0 || smallest.isEmpty()){smallest=str;}
            if(str.compareTo(largest)>0 || largest.isEmpty()){largest=str;}
            
        }
        
       return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
