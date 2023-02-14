import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class append_and_delete {



    
    public static String appendAndDelete(String s, String t, int k) {
    
    if(k>=s.length()+t.length()){
        return "Yes";
    } 
    else{
         
        int x=0;
        for(int i=0;i<Math.min(s.length(),t.length());i++){
            if(s.charAt(i)==t.charAt(i)){
                x++;
            }
            else{
                break;
            }
        }
        
        
        
        int diff_char=s.length()-x+t.length()-x;
        if(k==diff_char){
            return "Yes";
        }
        else if(k<diff_char){
            return "No";
        }
        else{
            if((k-diff_char)%2==0){
                return "Yes";
            }
            else{
                return "No";
            }
        }

        
        
    }
    
    }

}

 class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s = scan.nextLine();

        String t = scan.nextLine();

        int k = scan.nextInt();

        String result = append_and_delete.appendAndDelete(s, t, k);

        System.out.println(result);
    }
}

    

