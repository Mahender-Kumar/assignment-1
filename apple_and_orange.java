import java.util.Scanner;

public class apple_and_orange {
    static int i;
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Long x=scan.nextLong(),y=scan.nextLong(),a=scan.nextLong(),o=scan.nextLong();
        long A=scan.nextLong();
        long O=scan.nextLong();
        Long apple[]=new Long[(int)A], orange[]=new Long[(int)O];
        for(i=0;i<A;i++){// can be done without using arrays
            apple[i]=scan.nextLong();// direct scan and add, then compare 
        }for(i=0;i<O;i++){
            orange[i]=scan.nextLong();
        }
        scan.close();
        Long count=(long) 0,counto=(long) 0;
        for(i=0;i<A;i++){
           if(a+apple[i]>=x &&a+apple[i]<=y ){
            count++;
           }
        }
        for(i=0;i<O;i++){
            if(o+orange[i]<=y &&o+orange[i]>=x){
             counto++;
            }
         }
         System.out.println(count);
         System.out.println(counto);
         
    
    }
    
        
    }

