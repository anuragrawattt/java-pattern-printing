public class SUMBYRECURSION {
    static int sumof(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            return n + sumof(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(sumof(x));
    }
    
}
