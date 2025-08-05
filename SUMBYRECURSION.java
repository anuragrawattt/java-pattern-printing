import java.util.Scanner;
public class SUMBYRECURSION {
    static int sumof(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            return n + sumof(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. upto which u want the sum")
            int x= sc.nextInt();
        
        System.out.println(sumof(x));
    }
    
}
