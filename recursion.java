class recursion {
    public static void pattern(int n){
      for (int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            print("*");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        pattern(5);
    }
  }