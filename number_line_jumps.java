import java.util.Scanner;

public class number_line_jumps {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long x1=scan.nextLong(),v1=scan.nextLong(),x2=scan.nextLong(),v2=scan.nextLong();
        int count=0;
        scan.close();
        for(int i=0;i<10000;i++){
            if(x1+(i*v1)==x2+(i*v2)){
                count++;
                if(count>=1){
                 
                    break;
                }

            } 
            } if(count>0){
                System.out.print("YES");
                
           } else{  System.out.print("NO");}

    }
}
