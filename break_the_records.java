import java.util.ArrayList;
import java.util.Scanner;

public class break_the_records {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }scan.close();
        ArrayList<Integer> b= new ArrayList<Integer>();
        ArrayList<Integer> c= new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            int temp=a[i];
            if(max<temp){
                max=temp;
                b.add(temp);
            }
            if(min>temp){
                min=temp;
                c.add(temp);
            }
          
        }
        System.out.println(b.size()-1+" "+ (c.size()-1));
       

    }
    
}
