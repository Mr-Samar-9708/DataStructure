public class Main {

    public static boolean isArmstrongNum(int n){
      int orignalNum = n;
      int numSize = 0; 
        
      while(n > 0){
        numSize++;
        n = n / 10;
      }
      n = orignalNum;
      
      int sum  = 0;
      while(n > 0){
        int lastDigit = n % 10;
        int powerValue = 1;
        
        for(int i = 0; i < numSize; i++){
          powerValue *= lastDigit;
        }
        sum += powerValue;
        
        n = n / 10;
      }

      n = orignalNum;
      
      return n == sum;
    
    }
    
    public static void main(String[] args) {
        System.out.println(isArmstrongNum(153));
    }
}
