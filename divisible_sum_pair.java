import java.util.Scanner;

public class divisible_sum_pair {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        scan.close();
        
        System.out.println(pair(a,n,k));
    }
    public static int pair(int a[],int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}
