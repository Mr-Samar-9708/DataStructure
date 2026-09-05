class Solution {
    // public boolean isPerfect(int n) {

    //     int sum = 0;

    //     for(int i = 1; i <= n-1; i++){

    //         if(n % i == 0){
    //             sum += i;
    //         }
    //     }

    //     return sum == n;
    // }

    public boolean isPerfect(int n) {

        int sum = 1;

        for(int i = 2; i <= Math.sqrt(n); i++){

            if(n % i == 0){
                sum += i;

                if(i != (n/2)){
                    sum += (n/i);
                }
            }
        }

        return sum == n;
    }
}
