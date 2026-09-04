public class PalindromNumber {
  
  public static boolean isPalindrom(int n){
     int orgNum = n;
        
     int revNum = 0;

     while(n > 0){
       int lastDigit = n % 10;
       revNum = revNum * 10 + lastDigit;

       n = n / 10;
     }
    
    return revNum == orgNum;
  }
  
  public static void main(String[] args) {
    System.out.println(isPalindrom(123));
  }
}
