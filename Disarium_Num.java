class Disarium_Num {
    
    public boolean isDisarium(int n) {
        
        int sum  = 0;
        
        int temp = n;
        while(temp != 0){
            
            int position = digitPosition(temp, temp%10);
            int pow = 1;
            int digit = temp%10;
            
            for(int i = 0; i < position; i++){
                pow *= digit;
            }
            
            sum += pow;
            
            temp = temp/10;
        }
        
        return n == sum;
    }
    
    public int digitPosition(int num, int n){
        
        String nums = Integer.toString(num);
        
        int position = nums.indexOf(String.valueOf(n));
        
        return position + 1;
    }
}
