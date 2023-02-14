import java.util.Scanner;

public class grading {
    static int i;
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in)   ;
        int n=scan.nextInt();
        for(i=0;i<n;i++){
            grade(scan.nextInt());
        }
        
        scan.close();
    }
    public static void grade(int a){
        if(a>=38){
        if(a%5==0){
            System.out.println(a);
        }
        else if(a%5==3){
            System.out.println(a+2);
        }
        else if(a%5==4){
            System.out.println(a+1);
        }else{
            System.out.println(a);
        }
    }
    else{ 
          System.out.println(a);
        }
        
        
        
    }
}
