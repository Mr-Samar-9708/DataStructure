class ReverseNumber {

    public static int reverseNum(int n){

        int revNum = 0;

        while(n > 0){
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;

            n = n / 10;
        }

        return revNum;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseNum(n));
    }
}
